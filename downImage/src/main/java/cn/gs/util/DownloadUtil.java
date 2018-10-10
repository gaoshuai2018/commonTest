package cn.gs.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/17 11:37
 * @Version 1.0
 */
public class DownloadUtil {
    private static Pattern p = Pattern.compile(".*MSIE.*?;.*");

    public static void downFile(String filepath, HttpServletRequest request, HttpServletResponse response) {
        try {
            File temFile = new File(filepath);
            if (!temFile.exists()) {
                response.getWriter().write("ERROR:File Not Found");
                return;
            }
            String fileName = temFile.getName();
            String browser = request.getHeader("user-agent");

            Matcher m = p.matcher(browser);

            OutputStream ot = response.getOutputStream();
            response.reset();
            if (m.matches()) {
                response.setHeader("Content-Disposition", "attachment; filename=" +
                        URLEncoder.encode(fileName, "UTF-8").replace("+", ""));
            } else {
                response.setHeader("Content-Disposition", "attachment; filename=" +
                        new String(fileName.getBytes("UTF-8"), "ISO8859-1").replace(" ", ""));
            }
            response.setHeader("Cache-Control", "max-age=" + 100);
            response.setContentLength((int) temFile.length());
           response.setContentType("application/x-download");


            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(temFile));
            BufferedOutputStream bos = new BufferedOutputStream(ot);
            byte[] buffer = new byte[4096];
            int length;
            while ((length = bis.read(buffer)) > 0) {
                bos.write(buffer, 0, length);
            }
            bos.flush();
            bos.close();
            bis.close();
            ot.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createImage(String fileName, String data) {
        try {
            // Base64解码
            byte[] b = new BASE64Decoder().decodeBuffer(data);
            // 生成图片
            OutputStream out = new FileOutputStream(new File(fileName));
            out.write(b);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getImageString(String imgFile) {
        InputStream in;
        byte[] data = null;
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);
    }
}
