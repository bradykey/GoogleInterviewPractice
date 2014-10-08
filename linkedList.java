public class LList<T> {

	// private global data members
	private T data;
	private LList<T> next;

	/**
	* Default constructor for a 
	* @link{LList<T>} element.
	*/
	public LList(T value){
		data = value;
	}

	/*
	* BEGIN getters and setters
	*/
	public T getData(){
		return data;
	}

	public void setData(T data){
		this.data = data;
	}

	public LList<T> getNext(){
		return next;
	}

	public void setNext(LList<T> next){
		this.next = next;
	}
}