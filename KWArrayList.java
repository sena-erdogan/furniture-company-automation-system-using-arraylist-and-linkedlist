import java.util.*;

/** This class implements some of the methods of the Java ArrayList class. It
 does not implement the List interface.
*/
@SuppressWarnings("unchecked")
public class KWArrayList<E> {
	 // Data Fields
	 /** The default initial capacity */
	 private static final int INITIAL_CAPACITY = 10;
	 /** The underlying data array */
	 private E[] theData; 
	 /** The current size */
	 private int size = 0;
	 /** The current capacity */
	 private int capacity = 0;
	 
	 /**	Default constructor
	
	*/
	 public KWArrayList(){
		 capacity = INITIAL_CAPACITY;
		 theData = (E[]) new Object[capacity];
	}
	
	/**	Constructor
		
		@param init initial value of capacity
	
	*/
	public KWArrayList(int init){
		capacity = init;
		theData = (E[]) new Object[capacity];
	}
	
	/**	Adds a new entry
	
		@param anEntry the new entry
		
		@return boolean always true
	
	*/
	public boolean add(E anEntry){
		 if(size == capacity){
		 reallocate();
		 }
		 theData[size] = anEntry;
		 size++;
		 return true;
	}

	/**	Adds a new entry to a specific index
	
		@param index the index to be added
	
		@param anEntry the new entry
	
	*/
	public void add(int index, E anEntry){
		 if(index < 0 || index > size){
		 throw new ArrayIndexOutOfBoundsException(index);
		 }
		 if(size == capacity){
		 reallocate();
		 }
		 // Shift data in elements from index to size - 1
		 for(int i = size; i > index; i--){
		 theData[i] = theData[i - 1];
		 }
		 // Insert the new item.
		 theData[index] = anEntry;
		 size++;
	}

	/**	Gets the entry of the given index
	
		@param index the index of the entry
		
		@return E the entry of the index
	
	*/
	public E get(int index) {
		 if(index < 0 || index >= size){
		 throw new ArrayIndexOutOfBoundsException(index);
		 }
		 return theData[index];
	}
	
	/**	Sets an index to be the entry
	
		@param index the index
		
		@param newValue the new entry
		
		@return E the old value
	
	*/
	public E set(int index, E newValue){
		 if(index < 0 || index >= size){
		 throw new ArrayIndexOutOfBoundsException(index);
		 }
		 E oldValue = theData[index];
		 theData[index] = newValue;
		 return oldValue;
	}

	/**	Removes the entry of the given index
	
		@param index the index
		
		@return E the old value
	
	*/
	public E remove(int index){
		 if(index < 0 || index >= size){
		 throw new ArrayIndexOutOfBoundsException(index);
		 }
		 E returnValue = theData[index];
		 for(int i = index + 1; i < size; i++){
		 theData[i - 1] = theData[i];
		 }
		 size--;
		 return returnValue;
	}

	/**	Allocates space
	
	*/
	private void reallocate(){
		 capacity = 2 * capacity;
		 theData = Arrays.copyOf(theData, capacity);
	}
	
	/**	Finds the first appearance index of an entry
	
		@param target entry to be found
		
		@return int the index
	
	*/
	public int indexOf(E target){
	
		for(int i=0; i<size; i++){
		
			if(theData[i] == target)	return i;
		
		}
		
		return -1;
	
	}
	
	/**	Returns the size 
	
		@return size
	
	*/
	public int size(){
	
		return size;
	
	}
	
	/**	Returns the last entry
		
		@return E last entry
	
	*/
	public E getLast(){
	
		return get(size()-1);
	
	}
	 
}


