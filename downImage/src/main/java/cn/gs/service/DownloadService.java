package cn.gs.service;


import cn.gs.util.DownloadUtil;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/17 11:37
 * @Version 1.0
 */
@Service
public class DownloadService {

    public void downLoadImageToWord(HttpServletRequest request, HttpServletResponse response,
                                    Map<String, Object> param) throws Exception {
        String dailyReportName = request.getSession().getServletContext()
                .getRealPath("/") + "警情分析" + ".doc";
        System.out.println(dailyReportName);
        if (param.size() < 1) {
            return;
        }
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

        DownloadUtil.downFile(dailyReportName, request, response);
//        File f = new File(dailyReportName);
//        if (!f.exists()) {
//            response.sendError(404, "File not found!");
//            return;
//        }
//        BufferedInputStream br = new BufferedInputStream(new FileInputStream(f));
//        byte[] buf = new byte[1024];
//        int len = 0;
//
//        response.reset(); // 非常重要
//        // 纯下载方式
//        response.setContentType("application/x-msdownload");
//        response.setHeader("Content-Disposition", "attachment; filename=" + f.getName());
//
//        OutputStream out = response.getOutputStream();
//        while ((len = br.read(buf)) > 0)
//            out.write(buf, 0, len);
//        br.close();
//        out.close();
    }

}
