package cn.gs.commonMethod.copyPropertiesMethod;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/5/6 19:28
 */
@Data
public class CopyEntity2 {
    public String outerName;
    public CopyEntity2.InnerClass innerClass;
    public List<CopyEntity2.InnerClass> clazz;

    @Data
    public static class InnerClass {
        public String InnerName;
    }

}
