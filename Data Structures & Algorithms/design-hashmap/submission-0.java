class MyHashMap {
    int []map = new int [1000001];
    boolean[] exist = new boolean [1000001];
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        map[key] = value;
        exist[key] = true;
    }
    
    public int get(int key) {
        if(exist[key] == true){
            return map[key];
        }
        return -1;
    }
    
    public void remove(int key) {
        exist[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */