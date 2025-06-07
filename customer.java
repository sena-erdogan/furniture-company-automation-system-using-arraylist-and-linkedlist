import java.util.*;
public class customer extends branchEmployee{
	
	/**	Name of the customer
	
	*/
	protected String name;
	
	/**	Surname of the customer
	
	*/
	protected String surname;
	
	/**	 E-mail of the customer
	
	*/
	protected String email;
	
	/**	Password of the customer
	
	*/
	protected String password;
	
	/**	Array of the orders this customer made
	
	*/
	protected HybridList<product> order = new HybridList<>(100);
	
	/**	Sole constructor.
	
	*/
	public customer(){
	
		//Intentionally empty
	
	}
	
	/**	customer constuctor
	
		@throws Exception if the e-mail address doesn't contain '@', therefore is invalid
	
		@param tName customer's name
		
		@param tSurname customer's surname
		
		@param tEmail customer's email
		
		@param tPassword customer's password
	
	*/
	public customer(String tName, String tSurname, String tEmail, String tPassword){
	
		try{
		
			if(tEmail.contains("@")==false)	throw new Exception("\nInvalid e-mail address.\nCustomer could not be constructed.");
		
			System.out.println("Customer constructor is running...");
		
			name = tName;
			surname = tSurname;
			email = tEmail;
			password = tPassword;
			
			++cCount;
			cNumber = cCount;
			
			System.out.println("New customer " + name + ' ' + surname + "'s customer number is " + cNumber);
			
			cList.add(this);
		
		}
		
		catch(Exception e){	System.out.println(e);}
	
	}
	
	/**	Name of a customer
	
		@return String representing the name of the customer
	
	*/
	public String getName(){	return name;}
	
	/**	Surname of a customer
	
		@return String representing the surname of the customer
	
	*/
	public String getSurname(){	return surname;}
	
	/**	Email of a customer
	
		@return String representing the email of the customer
	
	*/
	public String getEmail(){	return email;}
	
	/**	Password of a customer
	
		@return String representing the password of the customer
	
	*/
	public String getPassword(){	return password;}
	
	/**	Customer number of a customer
	
		@return int representing the customer number of the customer
	
	*/
	public int getNumber(){	return cNumber;}
	
	/**	Allows a customer to see the products
	
	*/
	public void productList(){
	
		for(int i=0; i<35; i++){
		
			System.out.println("Office chair of model" + stock.get(i).getModel() + " in the color " + stock.get(i).getColor());
		
		}
		
		for(int i=35; i<55; i++){
		
			System.out.println("Office desk of model" + stock.get(i).getModel() + " in the color " + stock.get(i).getColor());
		
		}
		
		for(int i=55; i<95; i++){
		
			System.out.println("Meeting table of model" + stock.get(i).getModel() + " in the color " + stock.get(i).getColor());
		
		}
		
		for(int i=95; i<107; i++){
		
			System.out.println("Bookcase of model" + stock.get(i).getModel());
		
		}
		
		for(int i=107; i<119; i++){
		
			System.out.println("Office cabinet of model " + stock.get(i).getModel());
		
		}
	
	}
	
	/**	Allows a branch employee to add an order to the customer's previous orders
		Protected in customer class
		
		@param pro product the customer purchased
		
		@param num quantity of the product purchased
	
	*/
	protected void addOrder(product pro, int num){
		
		order.add(pro);
		
		order.getLast().number = num;
	
	}
	
	/**	Allows a customer to see their previous orders
	
	*/
	public void getOrders(){
	
		for(int i=0; i<order.sizeLL(); i++){
		
			for(int j=0; j<order.sizeAL(); j++){
			
				System.out.println(order.get(i,j).getName() + " of model" + order.get(i,j).getModel());
			
				if(order.get(i,j).getColor() != -1)	System.out.println(" int the color" + order.get(i,j).getColor());
			
			}
		
		}
	
	}
	
	/**	Allows a customer to check if a product is available
	
		@param pro product to be searched
		
		@param num quantity of the product to be searched
		
		@return boolean true if the product is available, else false
	
	*/
	public boolean searchProduct(product pro, int num){
	
		for(int i=0; i<stock.size(); i++){
		
			if(stock.get(i) == pro && stock.get(i).number>=num){
			
				System.out.println("This product is in stock");
				
				return true;
			
			}
		
		}
		
		return false;
	
	}
	
	/**	Allows a customer to shop online
	
		@throws Exception phone number should be of 11 numbers, throws exception if not
	
		@param pro product to be purchased
		
		@param num quantity of the product to be purchased
		
		@param address address which the order will be sent to
		
		@param phone phone number of the receiver
	
	*/
	public void shopOnline(product pro, int num, String address, String phone){
	
		try{
		
			if(phone.length() != 11)	throw new Exception("Invalid phone number\nSorry, your order to \"" + address + "\" cannot be shipped\nYou can make sure your information is valid and then try again.");
			 
			removeProduct(pro, num);
			addOrder(pro, num);
			
			System.out.println("Your order of " + num + ' ' + pro.getName() + "s has been shipped to the address \"" + address + "\" and your phone number is " + phone);
		
		}
		
		catch(Exception e){
		
			System.out.println(e);
			
		}
	
	}
	
	/**	Allows a customer to see which store has the product they're looking for
	
		@param pro product to be searched for
	
	*/
	public void whichStore(product pro){
	
		for(int i=0; i<stock.size(); i++){
		
			if(stock.get(i).getName() == pro.getName() && stock.get(i).getModel() == pro.getModel() && 
				stock.get(i).getColor() == pro.getColor())	System.out.println("This product is in branch" + stock.get(i).store);
		
		}
	
	}
	
}
