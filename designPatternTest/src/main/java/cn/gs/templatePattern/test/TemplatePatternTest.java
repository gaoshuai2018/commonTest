package cn.gs.templatePattern.test;

import cn.gs.templatePattern.Cricket;
import cn.gs.templatePattern.FootBall;
import org.junit.Test;

/**
 * @Description:模板模式测试类
 * @Author: gaoshuai
 * @Date: 2019/2/27 15:10
 * 来源：http://www.runoob.com/design-pattern/template-pattern.html
 **/
public class TemplatePatternTest {
    @Test
    public void templatePatternTest1() {
        FootBall footBall = new FootBall();
        footBall.playGame();
        System.out.println();
        Cricket cricket = new Cricket();
        cricket.playGame();
    }
}
