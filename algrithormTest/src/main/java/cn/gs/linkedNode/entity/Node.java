package cn.gs.linkedNode.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description:链表节点
 * @Author: gaoshuai
 * @Date: 2019/3/28 15:50
 */
@Getter
@Setter
public class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node() {

    }
}
