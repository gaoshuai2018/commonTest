package cn.gs.base.test.unpress;

import com.github.junrar.Archive;
import com.github.junrar.rarfile.FileHeader;


import java.io.*;

/**
 * @author Gao Shuai
 */
public class UnZipAnRar {
    public static void unRar(File rarFile, String outDir) throws Exception {
        File outFileDir = new File(outDir);
        if (!outFileDir.exists()) {
            boolean isMakDir = outFileDir.mkdirs();
            if (isMakDir) {
                System.out.println("创建压缩目录成功");
            }
        }
        Archive archive = new Archive(new FileInputStream(rarFile));
        FileHeader fileHeader = archive.nextFileHeader();
        while (fileHeader != null) {
            if (fileHeader.isDirectory()) {
                fileHeader = archive.nextFileHeader();
                continue;
            }
            File out = new File(outDir + fileHeader.getFileNameString());
            if (!out.exists()) {
                if (!out.getParentFile().exists()) {
                    out.getParentFile().mkdirs();
                }
                out.createNewFile();
            }
            FileOutputStream os = new FileOutputStream(out);
            archive.extractFile(fileHeader, os);

            os.close();

            fileHeader = archive.nextFileHeader();
        }
        archive.close();
    }

    public static void main(String[] args) {
        String originDir = "D:\\ownProject\\";
        String rarPath = originDir + "wechat.rar";
        File rarFile = new File(rarPath);


        try {
            UnZipAnRar.unRar(rarFile, "D:\\ownProject\\");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}