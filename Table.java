public class Table {
	public Integer[] values;
	public int size;
	
	public Table(int _size) {
		size = _size;
		values = new Integer[size];
	}
	
	
	private int hash(int key, int probe) {
		return (key + probe) % size;
	}
	
	public int insert(int key) {
		for(int i = 0; i < size; i++){
			int j = hash(key, i);
			if(values[j] == null) {
				values[j] = key;
				return j;
			}
		}
		throw new RuntimeException("hash table overflow");
	}
	public int search(int key) {
		for(int i = 0; i < size; i++) {
			int j = hash(key, i);
			if(values[j] == key) {
				return j;
			}
			if(values[j] == null) break;
		}
		return -1;
	}
	
	public void print(){
		for(int i = 0; i < size; i++) {
			System.out.println(String.format("values[%d]=%d", i, values[i]));
		}
	}
	
}
