package cn.gs.linkedNode;

import cn.gs.linkedNode.entity.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 反转单向链表
 * @author: gaoshuai
 * @date: 2019/3/28 15:50
 * 来源：https://www.cnblogs.com/edisonchou/p/4769537.html
 * 题目：定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
 */

public class ReverseListNode {


    public static void main(String[] args) {
        Node node6 = new Node(6, null);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node headNode = reverseNodeList2(node1);
        System.out.println(headNode.getValue());
    }

    //以将单链表储存为数组，然后按照数组的索引逆序进行反转。但是，此方式比较浪费空间，而且需要两次遍历，效率不占优势。
    private static Node reverseNodeList(Node node) {
        List<Node> nodeList = new ArrayList<>();
        while (node != null) {
            nodeList.add(node);
            node = node.getNext();
        }
//       List<Node> nodeResultList = new ArrayList<>();

        int size = nodeList.size();
        for (int i = size - 1; i >= 0; i--) {
            Node node1 = nodeList.get(i);
            if (i > 0) {
                node1.setNext(nodeList.get(i - 1));
            } else {
                node1.setNext(null);
            }
//        nodeResultList.add(node1);
        }
//        for (Node nodeTemp : nodeResultList) {
//            System.out.print(nodeTemp.getValue() + ",");
//        }
//        System.out.println("");
        return nodeList.get(size - 1);
    }


    private static Node reverseNodeList2(Node currentNode) {
        Node nextNode;
        Node preNode = null;
        while (currentNode != null) {
            nextNode = currentNode.getNext();
            currentNode.setNext(preNode);
            preNode = currentNode;
            currentNode = nextNode;
        }
        return preNode;
    }
}
