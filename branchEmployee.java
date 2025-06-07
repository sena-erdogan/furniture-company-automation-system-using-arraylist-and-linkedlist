public class branchEmployee extends admin{
	
	/**	Branch number the branch employee is currently working in
	
	*/
	protected int branch;
	
	/**	Sole constructor.
	
	*/
	protected branchEmployee(){
	
		//Intentionally empty
	
	}
	
	/**	branchEmployee constuctor
	
		@param branch branch number the employee will work in 
	
	*/
	public branchEmployee(int branch){
	
		System.out.println("Branch employee constructor is running...");
	
		this.branch = branch;
		
		employee.add(this);
		
		System.out.println("A new employee has started working in branch " + branch);
	
	}
	
	/**	Branch number an employee is currently working
	
		@return int branch number
	
	*/
	public int getBranch(){	return branch;}
	
	/**	Sets branch number an employee is currently working
	
		@param branch branch number
	
	*/
	public void setBranch(int branch){	this.branch = branch;}
	
	/**	Allows branch employees to add products to the need array
	
		@param pro product needed
		
		@param num quantity of the product needed 
	
	*/
	public void addNeed(product pro, int num){
	
		if(num<1)	System.out.println("Number of products needed should be larger than 1");
		else{
		
			for(int i=0; i<need.size(); i++){
		
				if(need.get(i) == pro)	need.get(i).number += num;
		
			}
		
		}
	
	}
	
	/**	Allows branch employees to check if enough number of the product is in stock
	
		@param pro product to be checked
		
		@param num quantity of the product
		
		@return boolean true if the product is in stock in the needed amount, else false
	
	*/
	public boolean isInStock(product pro, int num){
	
		for(int i=0; i<stock.size(); i++){
			
			if(stock.get(i) == pro){
			
				if(stock.get(i).getNumber()>=num)	return true;
			
			}
		
		}
		
		return false;
	
	}
	
	/**	Allows branch employees to make sales
	
		@throws Exception if the product is not in stock
	
		@param pro product sold
		
		@param num quantity of the product sold
		
		@param cus customer whom the product was sold to
	
	*/
	public void makeSale(product pro, int num, customer cus){
	
		try{
		
			if(isInStock(pro, num) == false)	throw new Exception("Sorry, we are out of that product");
			
			cus.addOrder(pro, num);
			
			for(int i=0; i<stock.size(); i++){
			
				if(stock.get(i) == pro)	stock.get(i).number -= num;
			
			}
		
		}
		
		catch(Exception e){	System.out.println(e);}
	
	}
	
	/**	Allows the branch employees to add product to stock
	
		@param pro product to be added
		
		@param num quantity of the product to be added
	
	*/
	public void addProduct(product pro, int num){
	
		for(int i=0; i<stock.size(); i++){
		
			if(stock.get(i) == pro){
			
				stock.get(i).number += num;
				
				stock.get(i).store = branch;
				
			}
		
		}
		
		System.out.println("Product added.");
	
	} 
	
	/**	Allows branch employees to remove products from the stock if they are sold from the stock
	
		@param pro product to be removed
		
		@param num quantity of the product to be removed
	
	*/
	public void removeProduct(product pro, int num){
	
		for(int i=0; i<stock.size(); i++){
		
			if(stock.get(i) == pro && stock.get(i).number>=num)	stock.get(i).number -= num;
			else if(stock.get(i) == pro && stock.get(i).number<num){
			
				System.out.println("Sorry, we don't have enough of that product, we have informed the manager.");
		
				addNeed(pro, num);
		
			}
			
		}
		 
		System.out.println("Product removed.");
	
	}
	
	/**	Allows a branch employee to see a customer's previous orders
	
		@param cus customer whose orders to be seen
	
	*/
	public void previousOrders(customer cus){
	
		cus.getOrders();
	
	}
	
	/**	Adds a new customer
	
		@param name name of the new customer
		
		@param surname surname of the new customer
		
		@param email email of the new customer
		
		@param password password of the new customer
	
	*/
	public void addCustomer(String name,String surname,String email, String password){
	
		customer temp = new customer(name,surname, email, password);
	
	}
	
}
