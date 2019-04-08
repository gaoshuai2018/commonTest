package cn.gs.base.objectTest.mapTest;

import lombok.Data;

/**
 * @Author: gaoshuai
 * @Date: 2018/7/30 15:28
 * @Version 1.0
 */
public class MyHashMap {

    private static int default_length = 16;
    private MyEntry[] entries;


    public MyHashMap() {
        super();
        entries = new MyEntry[default_length];
    }

    public void put(Object key, Object value) {
        int index = key.hashCode() % default_length;
        MyEntry previous = entries[index];
        for (MyEntry entry = entries[index]; entry != null; entry = entry.next) {
            if (entry.getKey().equals(key)) {
                return;
            }
        }
        MyEntry entry = new MyEntry(key, value);
        entry.next = previous;
        entries[index] = entry;
    }

    public Object get(Object key) {
        int index = key.hashCode() % default_length;
        for (MyEntry entry = entries[index]; entry != null; entry = entry.next) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Data
    class MyEntry {
        private Object key;
        private Object value;
        private MyEntry next;

        public MyEntry(Object key, Object value) {
            super();
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        MyHashMap mhm = new MyHashMap();
        mhm.put("lmy", 20);
        System.out.println(mhm.get("lmy"));
    }
}