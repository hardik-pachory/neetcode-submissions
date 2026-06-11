class MyHashSet {
    boolean[] sets;

    public MyHashSet() {
        sets = new boolean[1000001];
    }
    
    public void add(int key) {
        sets[key]=true;
    }
    
    public void remove(int key) {
        if(sets[key]==true)
            sets[key]=false;
    }
    
    public boolean contains(int key) {
        return sets[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */