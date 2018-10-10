package org.sang.controller;

import cn.gs.util.DownloadUtil;
import com.alibaba.fastjson.JSONObject;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/17 11:36
 * @Version 1.0
 */
@RestController
@RequestMapping("/download")
public class DownloadController {

    @RequestMapping(value = "/downloadImage", method = RequestMethod.POST)
    public Object downloadImage(HttpServletRequest request, HttpServletResponse response,
                                @RequestBody Map<String, Object> param) throws Exception {
//        downloadService.downLoadImageToWord(request, response, param);
        String dailyReportName = "D:/ceshi.doc";
        System.out.println(dailyReportName);
        List<String> imgUrls = (List<String>) param.get("imgUrls");
        String[] tempImgNames = new String[imgUrls.size()];
        for (int i = 0; i < imgUrls.size(); i++) {
            String tempImgName = request.getSession().getServletContext()
                    .getRealPath("/") + "/echarts" + System.currentTimeMillis() + ".png";
            DownloadUtil.createImage(tempImgName, imgUrls.get(i));
            tempImgNames[i] = tempImgName;
        }

        String mcImage = DownloadUtil.getImageString(tempImgNames[0]);
        String xqfnImage = DownloadUtil.getImageString(tempImgNames[1]);

        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("model/");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate("/test.btl");
        FileOutputStream fileOut = new FileOutputStream(dailyReportName);
        t.binding("image1", mcImage);
        t.binding("image2", xqfnImage);
        t.binding("image1Desc", param.get("img1Desc"));
        t.binding("image2Desc", param.get("img2Desc"));
        t.renderTo(fileOut);
        fileOut.close();
        Map map=new HashMap();
        map.put("path",dailyReportName);
        return JSONObject.toJSONString(map);
    }


    @RequestMapping("/down")
    public void down(HttpServletRequest request,HttpServletResponse response,String path) throws Exception {
        OutputStream ot=null;
        InputStream bis=null;
        try {
            File temFile = new File(path);
            if (!temFile.exists()) {
                response.getWriter().write("ERROR:File Not Found");
                return;
            }
            String encFileName = temFile.getName();
            final String userAgent = request.getHeader("USER-AGENT");

            ot = response.getOutputStream();
            bis = new FileInputStream(path);
            response.setContentType("application/x-download");
            response.setCharacterEncoding("utf-8");
            String finalFileName = null;

            if (StringUtils.contains(userAgent, "MSIE")) {
                finalFileName = URLEncoder.encode(encFileName, "UTF8");
                //google,火狐浏览器
            } else if (StringUtils.contains(userAgent, "Mozilla")) {
                finalFileName = new String(encFileName.getBytes(), "ISO8859-1");
            } else {
                //其他浏览器
                finalFileName = URLEncoder.encode(encFileName, "UTF8");
            }
            //这里设置
            response.setHeader("Content-Disposition", "attachment; filename=\"" + finalFileName + "\"");
            int len;
            byte[] bytes = new byte[10240];
            while ((len=bis.read(bytes))!= -1) {
                ot.write(bytes,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ClosedStream(bis,ot);
        }


    }
    private void ClosedStream(InputStream is, OutputStream out) {
        try {
            if (out != null) {
                out.close();
            }
            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
