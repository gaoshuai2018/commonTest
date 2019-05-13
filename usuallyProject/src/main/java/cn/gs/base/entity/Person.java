package cn.gs.base.entity;


import lombok.Data;

/**
 * @author: gaoshuai
 * @date: 2018/9/2 22:36
 * @version 1.0
 */

@Data
public class Person implements Comparable<Person> {
    private Long personId;
    private String personName;
    private String personDesc;

    @Override
    public int compareTo(Person o) {
        if (personId > o.getPersonId()) {
            return 1;
        } else if (personId < o.getPersonId()) {
            return -1;
        }
        return 0;
    }
}
