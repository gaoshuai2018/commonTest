package cn.gs.base.test.shellTest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/8/5 9:25
 */
public class ShellTest {

    private List<String> runShell() throws Exception {

        List<String> stringList = new ArrayList<>();
        //可以执行脚本
        // String command = "/usr/local/RPFiles/transStr.sh";
        //可以执行命令
        // String command = "ps -ef|grep java";
        //可以执行带参数的脚本
        String[] command = {"/usr/local/RPFiles/transStr.sh", "test"};
        Process ps = Runtime.getRuntime().exec(command);
        int exitValue = ps.waitFor();
        //当返回值为0时表示执行成功
        if (0 != exitValue) {
            System.out.println("call shell failed. error code is :" + exitValue);
        }
        //只能接收脚本echo打印的数据，并且是echo打印的最后一次数据，如果想打印所有数据，可以参考本篇文章的脚本编写
        BufferedInputStream in = new BufferedInputStream(ps.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("脚本返回的数据如下： " + line);
            stringList.add(line);
        }
        in.close();
        br.close();
        return stringList;
    }
}
