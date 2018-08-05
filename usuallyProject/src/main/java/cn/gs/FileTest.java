package cn.gs;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;

/**
 * @Author: gaoshuai
 * @Date: 2018/7/26 14:26
 * @Version 1.0
 */
public class FileTest {

    public static void main(String[] args) throws Exception {

    }

    public static String getLocation(String line) {
        int startTemp = 0;
        int end = 0;
        String arr[] = line.split("");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                startTemp = i;
                break;
            }
        }
        int start = startTemp;
        for (; startTemp < arr.length; startTemp++) {
            if (arr[startTemp].equals("")) {
                end = startTemp;
                break;
            }
        }
        System.out.println(line.substring(start, end));
        return "";
    }
}
