package cn.gs.io.excel;

import lombok.Data;

/**
 * @Author: gaoshuai
 * @Date: 2018/10/26 18:18
 * @Version 1.0
 */
@Data
public class ExcelDataVO {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 居住地
     */
    private String location;

    /**
     * 职业
     */
    private String job;

}
