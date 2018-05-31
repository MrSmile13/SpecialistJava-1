
public class ReadonlyStorage<T extends Comparable<? super T>>{
	
	private T data;
	

	public ReadonlyStorage(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public boolean isGreater(T x) {
		return data.compareTo(x) > 0;
	}
	

}
