import java.util.*;
public class admin implements automationSystem{

	/**	Array of all the customers
	
	*/
	protected KWArrayList<customer> cList = new KWArrayList<>(); 
	
	/**	Customer number
	
	*/
	protected int cNumber;
	
	/**	Customer count
	
	*/
	protected static int cCount=0;
	
	/**	Array of all the branches
	
	*/
	protected KWLinkedList<Integer> branch = new KWLinkedList<>();
	
	/**	Array of stocked products
	
	*/
	protected KWArrayList<product> stock = new KWArrayList<>(119);
	
	/**	Array of the needed products
	
	*/
	protected KWArrayList<product> need = new KWArrayList<>(119);
	
	/**	Array of all the branch employees
	
	*/
	protected KWLinkedList<branchEmployee> employee = new KWLinkedList<>();
	
	/**	Sole constructor.
	
	*/
	public admin(){
	
		//Intentionally empty
	
	}
	
	/**	admin constructor
	
		@param dummy is used to distinguish the no parameter constructor from this constructor
	
	*/
	public admin(int dummy){
	
		System.out.println("Admin constructor is running...");
	
		branch.add(1);
		branch.add(2);
		branch.add(3);
		branch.add(4);
		
		int k=0;
		
		for(int i=1; i<8; i++){
		
			for(int j=1; j<6; j++){
			
				officeChair officeChair1 = new officeChair(i,j);
				
				officeChair1.number = 50;
				
				stock.add(officeChair1);
				
				officeChair1.number = 0;
				
				need.add(officeChair1);
				
				k++;
			
			}
		
		}
		
		for(int i=1; i<6; i++){
		
			for(int j=1; j<5; j++){
			
				officeDesk officeDesk1 = new officeDesk(i,j);
			
				officeDesk1.number = 50;
				
				stock.add(officeDesk1);
				
				officeDesk1.number = 0;
				
				need.add(officeDesk1);
				
				k++;
			
			}
		
		}
		
		for(int i=1; i<11; i++){
		
			for(int j=1; j<5; j++){
			
				meetingTable meetingTable1 = new meetingTable(i,j);
			
				meetingTable1.number = 50;
				
				stock.add(meetingTable1);
				
				meetingTable1.number = 0;
				
				need.add(meetingTable1);
				
				k++;
			 
			}
		
		}
		
		for(int i=1; i<13; i++){
		
			bookcase bookcase1 = new bookcase(i);
			
			bookcase1.number = 50;
				
			stock.add(bookcase1);
				
			bookcase1.number = 0;
				
			need.add(bookcase1);
			
			if(i==2)	stock.get(k).number = 0; // for test case
				
			k++;
		
		}
		
		for(int i=1; i<13; i++){
		
			officeCabinet officeCabinet1 = new officeCabinet(i);
			
			officeCabinet1.number = 50;
				
			stock.add(officeCabinet1);
				
			officeCabinet1.number = 0;
				
			need.add(officeCabinet1);
				
			k++;
		
		}
		
		System.out.println("Admin has successfully logged in");
	
	}
	
	public void addBranchEmployee(int tBranch){
	
		try{
			if(tBranch>branch.size())	throw new Exception("There is no branch " + tBranch + " to add employees.");
			
			branchEmployee employee1 = new branchEmployee(tBranch);
			
			System.out.println("Admin added a new employee to the branch " + tBranch);
		
		}catch(Exception e){	System.out.println(e);}
			
	}
	
	public void removeBranchEmployee(int index){
	
		try{
			if(index>employee.size())	throw new Exception("There isn't a branch employee of the specified index.");
			
			employee.remove(index);
			
			System.out.println("Branch employee is successfully removed");
		
		}catch(Exception e){	System.out.println(e);}
	
	}
	
	public void addBranch(){
	
		branch.add(branch.size());
		
		System.out.println("A new branch has opened!");
		
		System.out.println("New branch is: " + branch.size());
	
	}

	public void removeBranch(int num){
	
		branch.remove(num-1);
		
		for(int i=0; i<employee.size(); i++){
		
			if(employee.get(i).branch == num){
			
				removeBranchEmployee(i);
				--i;
			}
		
		}
		
		System.out.println("Branch " + num + " is removed");
	
	}

	public void anyProductNeeded(){
	
		for(int i=0; i<need.size(); i++){
		
			if(need.get(i).number>0){
			
				stock.get(i).number += need.get(i).number + 30;
			
				need.get(i).number = 0;
			
			}
		
		}
		
		System.out.println("Products needed are supplied");
	
	}
	
	/**	Returns the branch employee at the given index
	
		@param i index
		
		@return branchEmployee branch employee of the index
	
	*/
	public branchEmployee getBranchEmployee(int i){
	
		return employee.get(i);
	
	}
	
	/**	Returns the customer at the given index
	
		@param num index
		
		@return customer customer of the index
	
	*/
	public customer getCustomer(int num){
	
		return cList.get(num);
	
	}
	
	/**	Adds a new customer
	
		@param name name of the new customer
		
		@param surname surname of the new customer
		
		@param email email of the new customer
		
		@param password password of the new customer
	
	*/
	public void addCustomer(String name, String surname, String email, String password){
	
		customer temp = new customer(name, surname, email, password);
	
	}
	
}
