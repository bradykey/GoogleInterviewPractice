public abstract class LList<T>{
	/**
	* Insert an element to the head of the 
	* linked list.
	*/
	public bool insert(LList<T> list, T data){
		LListElement<T> element = new LListElement<T>(data);
		element.setNext(list);

		// return the new head to the caller
		return element;
	}
}

public class LListElement<T> extends LList<T> {

	// private global data members
	private T data;
	private LListElement<T> next;

	/**
	* Default constructor for a 
	* @link{LListElement<T>} element.
	*/
	public LListElement(T value){
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

	public LListElement<T> getNext(){
		return next;
	}

	public void setNext(LListElement<T> next){
		this.next = next;
	}
}

public static void main(String[] args) {
	// create a linked list
	LListElement<Int> l1 = new LListElement<Int>(10);	
}