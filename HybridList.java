import java.util.*;
/** Class KWLinkedList implements a linked list and
 a ListIterator. */
 @SuppressWarnings("unchecked")
public class HybridList<E>{

	/** max number of elements in the array list */
	private int MAX_NUMBER = 10;
	
	/** The list to store the data */
	private KWLinkedList<KWArrayList> list;
	
	/** Size of the list */
	private int size=0;
	
	/**	Default constructor
	
	*/
	public HybridList(){
		
		list = new KWLinkedList<>();
	
	}
	
	/**	Constructor that takes the max number as a parameter
	
		@param MAX_NUMBER the max number of elements
	
	*/
	public HybridList(int MAX_NUMBER){
	
		this.MAX_NUMBER = MAX_NUMBER;
		
		list = new KWLinkedList<>(); 
	
	}
	
	/**	Returns the entry at the given index
	
		@param i linked list's ith entry
		
		@param j array list's jth entry
		
		@return E teh entry
	
	*/
	public E get(int i, int j){
	
		KWArrayList<E> temp = new KWArrayList<>();
		temp = list.get(i);
		
		return temp.get(j);
	
	}
	
	/**	Adds a new entry
	
		@param obj the new entry
	
	*/
	public void add(E obj){
	
		if(list.get(list.size() - 1).size() == MAX_NUMBER){
		
			KWArrayList<E> temp = new KWArrayList();
			
			temp.add(obj);
		
			list.add(temp);
		
		}else	list.get(list.size()-1).add(obj);
		
		size++;
	
	}
	
	/**	Returns the last entry
		
		@return E the last entry
	
	*/
	public E getLast(){
	
		KWArrayList<E> temp = new KWArrayList<>();
		temp = list.getLast();
	
		return temp.getLast();
	
	}
	
	/**	Returns size of the linked list entries
		
		@return int size
	
	*/
	public int sizeLL(){
	
		return list.size();
	
	}
	
	/**	Returns size of the array list entries
		
		@return int size
	
	*/
	public int sizeAL(){
	
		return list.getLast().size();
	
	}

}
