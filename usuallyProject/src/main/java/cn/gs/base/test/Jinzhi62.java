package cn.gs.base.test;

import java.util.Stack;

/**
 * @Description:短网址算法——之 10进制与62进制转换
 * @Author: gaoshuai
 * @Date: 2019/4/2 22:12
 * 来源：https://blog.csdn.net/sxhong/article/details/19398317
 *      https://blog.csdn.net/lz0426001/article/details/52370177
 */
public class Jinzhi62 {

    public static void main(String[] args) {
        System.out.println(36526445);
//        System.out.println(_10_to_62(36526445));
//        System.out.println(_62_to_10(_10_to_62(36526445)));
        System.out.println(_62_to_10("e3jdf"));
    }

    public static final char[] array = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
            'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
            'z', 'x', 'c', 'v', 'b', 'n', 'm',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P',
            'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L',
            'Z', 'X', 'C', 'V', 'B', 'N', 'M'};

    public static String _10_to_62(long number) {
        Long rest = number;
        Stack<Character> stack = new Stack<Character>();
        StringBuilder result = new StringBuilder(0);
        while (rest != 0) {
            stack.add(array[new Long((rest - (rest / 62) * 62)).intValue()]);
            rest = rest / 62;
        }
        for (; !stack.isEmpty(); ) {
            result.append(stack.pop());
        }
        return result.toString();

    }

    public static long _62_to_10(String sixty_str) {
        int multiple = 1;
        long result = 0;
        Character c;
        for (int i = 0; i < sixty_str.length(); i++) {
            c = sixty_str.charAt(sixty_str.length() - i - 1);
            result += _62_value(c) * multiple;
            multiple = multiple * 62;
        }
        return result;
    }

    private static int _62_value(Character c) {
        for (int i = 0; i < array.length; i++) {
            if (c == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
