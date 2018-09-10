package cn.gs.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 根据网页URL下载图片
 * @Author: gaoshuai
 * @Date: 2018/9/5 11:30
 * @Version 1.0
 */

public class DownImageTest {

    public void saveToFile(String destUrl) {
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        HttpURLConnection httpUrl = null;
        URL url;
        int BUFFER_SIZE = 1024;
        byte[] buf = new byte[BUFFER_SIZE];
        int size;
        try {
            url = new URL(destUrl);
            httpUrl = (HttpURLConnection) url.openConnection();
            httpUrl.connect();
            bis = new BufferedInputStream(httpUrl.getInputStream());
            fos = new FileOutputStream("D:\\haha.jpg");
            while ((size = bis.read(buf)) != -1) {
                fos.write(buf, 0, size);
            }
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (httpUrl != null) {
                    httpUrl.disconnect();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //图片到byte数组
    public byte[] image2byte(String destUrl) {
        byte[] data = null;
        BufferedInputStream bis = null;
        HttpURLConnection httpUrl = null;
        try {
            URL url = new URL(destUrl);
            httpUrl = (HttpURLConnection) url.openConnection();
            httpUrl.connect();
            bis = new BufferedInputStream(httpUrl.getInputStream());
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int numBytesRead;
            while ((numBytesRead = bis.read(buf)) != -1) {
                output.write(buf, 0, numBytesRead);
            }
            data = output.toByteArray();
            output.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (httpUrl != null) {
                    httpUrl.disconnect();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    @Test
    public void image2byteTest() {
        String url = "https://110.xway.cn/wanted/2017/08/12/441323199108158542_1502513858.jpg";
        byte[] bytes = this.image2byte(url);
        System.out.println(bytes.length);

    }

    @Test
    public void saveToFileTest() {
        String url = "https://110.xway.cn/wanted/2017/08/12/441323199108158542_1502513858.jpg";
        this.saveToFile(url);
    }
}