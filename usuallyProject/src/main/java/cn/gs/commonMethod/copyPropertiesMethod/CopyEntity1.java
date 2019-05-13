package cn.gs.commonMethod.copyPropertiesMethod;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/5/6 19:27
 */
@Data
public class CopyEntity1 {
    public String outerName;
    public CopyEntity1.InnerClass innerClass;
    public List<CopyEntity1.InnerClass> clazz;

    @Data
    public static class InnerClass {
        public String InnerName;
        public String testName;
    }
}

