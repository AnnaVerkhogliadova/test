package Anya_programist.collection.map;


public class HashMap<K, V> {
    private Entity<K,V>[] entities;
    private int capacity = 16;

    public HashMap(){
        entities = new Entity[capacity];
    }

    public void put(K key, V value) {
        int index = key.hashCode() % capacity;
        Entity entity = new Entity(key, value);
        entities[index] = entity;
    }

    public V get(K key){
        int index = key.hashCode() % capacity;
        return entities[index].getValue();
    }

    private class Entity<K,V>{
        private final K key;
        private final V value;

        public Entity(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey(){
            return key;
        }

        public V getValue(){
            return value;
        }

    }
    public static void main(String[] args){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Anna");
        hashMap.put(2, "Hatasha");
        hashMap.put(3, "Denis");

        System.out.println(hashMap.get(2));
    }

}
