package cn.gs.base.objectTest.collectionsTest.mapTest;

/**
 * @Author: gaoshuai
 * @Date: 2018/7/30 15:28
 * @Version 1.0
 */
public class MyHashMap<K, V> {

    private static int default_length = 16;
    private MyEntry<K, V>[] entries;


    public MyHashMap() {
        super();
        entries = new MyEntry[default_length];
    }

    public V put(K key, V value) {
        int index = key.hashCode() % default_length;
        MyEntry previous = entries[index];
        for (MyEntry<K, V> entry = entries[index]; entry != null; entry = entry.next) {
            if (entry.key.equals(key)) {
                V oldValue = entry.value;
                entry.value = value;
                return oldValue;
            }
        }
        MyEntry<K, V> entry = new MyEntry(key, value);
        entry.next = previous;
        entries[index] = entry;
        return null;
    }

    public V get(V key) {
        int index = key.hashCode() % default_length;
        for (MyEntry<K, V> entry = entries[index]; entry != null; entry = entry.next) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    class MyEntry<K, V> {
        public K key;
        public V value;
        public MyEntry next;

        public MyEntry(K key, V value) {
            super();
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Object> mhm = new MyHashMap();
        mhm.put("lmy", 20);
        mhm.put("lmy1", 21);
        mhm.put("lmy2", 22);
        mhm.put("lmy3", 23);
        mhm.put("lmy4", 24);
        mhm.put("lmy4", 25);
        System.out.println(mhm.get("lmy"));
        System.out.println(mhm.get("lmy4"));
    }
}