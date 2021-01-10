package day14.generic.good2;

public class Basic<K, V> extends Object {

	// 멀티제네릭
	// key 와 value를 사용한 제네릭 이용방법 

	private K key;
	private V value;
	
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public V get(K key) {
		return value;
	}
	
	public String toString() {
		return "{" + key + "=" +  value  + "}";
	}
	
	
}
