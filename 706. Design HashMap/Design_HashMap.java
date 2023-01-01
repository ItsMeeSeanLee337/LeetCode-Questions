class MyHashMap 
{
    //Create an integer array of size 10^6 + 1
    //Fill the array as -1 for all elements
    //The index will act as the key for values
    int[] hashMap;
    public MyHashMap() 
    {
        hashMap = new int [1000001];
        Arrays.fill(hashMap, -1);
    }
    //Store the value in the index for the HashMap function put
    public void put(int key, int value) 
    {
        hashMap[key] = value;
    }
    //Retrieve the value at the index for the HashMap function get
    public int get(int key) 
    {
        return hashMap[key];
    }
    //Set the value at the index to -1, the same as all key value pairs
    public void remove(int key) 
    {
        hashMap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */