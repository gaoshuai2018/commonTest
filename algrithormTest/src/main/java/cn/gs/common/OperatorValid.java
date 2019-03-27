package cn.gs.common;

import java.util.Stack;

/**
 * @Description:操作符对称验证
 * @Author: gaoshuai
 * @Date: 2019/3/22 17:22
 * 来源：https://leetcode-cn.com/problems/valid-parentheses/
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class OperatorValid {
    public boolean isValid(String s) {
        if (s == null || s.equals("")) {
            return true;
        }
        String[] endOperator = {")", "}", "]"};
        Stack<String> stringStack = new Stack<>();
        String[] sArr = s.split("");
        for (String string : sArr) {
            boolean isPop = false;
            for (String s1 : endOperator) {
                if (!string.equals(s1)) {
                  continue;
                }
                isPop = true;
                if (stringStack.empty()) {
                    return false;
                }
                String pop = stringStack.pop();
                //比较“{”,"}"
                boolean result = this.compareOperator(pop, s1);
                if (!result) {
                    return false;
                }
            }
            if (!isPop) {
                stringStack.push(string);
            }
        }
        return stringStack.empty();
    }

    private boolean compareOperator(String pop, String s1) {
        if (pop.equals("{") && s1.equals("}")) {
            return true;
        }
        if (pop.equals("(") && s1.equals(")")) {
            return true;
        }
        if (pop.equals("[") && s1.equals("]")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean valid = new OperatorValid().isValid("[]{}[](){()}");
        System.out.println(valid);
    }

}
