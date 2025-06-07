import java.util.*;
import java.util.Scanner;

class driver{
	public static void main(String args[]){
	
		admin Admin = new admin(1);
		
		Admin.addBranchEmployee(2);
		Admin.addBranchEmployee(3);
		Admin.addBranchEmployee(4);
		
		customer customer1 = new customer("shfgf","sdfhsg","s@gmail.com","1234");
		customer customer2 = new customer("sthrsy","sdhgf","f@hotmail.com","abcd");
		customer customer3 = new customer("sdfgsdh","shtfd","hello@gmail.com","hi");
		customer customer4 = new customer("myname","mysurname","NotAnEmail","something");
		
		branchEmployee branchEmployee1 = new branchEmployee(3);
		
		Admin.addBranch();
		
		branchEmployee branchEmployee2 = new branchEmployee(5);
		
		System.out.println("branchEmployee1's branch is: " + branchEmployee1.getBranch());
		
		System.out.println("customer2's customer number is: " + customer2.getNumber());
		
		officeChair officeChair1 = new officeChair(6,3);
		
		branchEmployee2.addNeed(officeChair1,-2); 
		
		branchEmployee2.addNeed(officeChair1,13);
		
		bookcase bookcase1 = new bookcase(11);
		
		System.out.println("This will print true if bookcase1 is in stock, false if not: " + branchEmployee2.isInStock(bookcase1,2));
		
		branchEmployee branchEmployee3 = new branchEmployee(3);
		
		branchEmployee3.makeSale(bookcase1, 4, customer2);
		
		branchEmployee3.addProduct(officeChair1, 4);
		
		officeCabinet officeCabinet1 = new officeCabinet(9);
		
		branchEmployee1.removeProduct(officeCabinet1, 30);
		
		System.out.println("Name of customer1 is: " + customer1.getName());
		
		System.out.println("Surname of customer3 is: " + customer3.getSurname());
		
		System.out.println("Email of customer3 is: " + customer3.getEmail());
		
		System.out.println("Password of customer2 is: " + customer2.getPassword());
		
		System.out.println("This will print true if bookcase1 is in stock, false if not: " + customer2.searchProduct(bookcase1,2));
		
		customer2.shopOnline(officeCabinet1,5,"A galaxy far far away","12345678901");
		
		customer2.shopOnline(officeCabinet1,10,"Wonderland","1234");
		
		Admin.addBranchEmployee(6);
		
		Admin.addBranchEmployee(4);
		
		branchEmployee1.setBranch(3);
		
		System.out.println("branchemployee1 is working at branch 3 now.");
		
		int entry = 1;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the automation system! How can I help you?");
		
		while(entry != 0){
		
			System.out.println("\n1- Add a new branch employee");
			System.out.println("2- Add a new customer");
			System.out.println("3- Add a new branch");
			System.out.println("4- Get a branch employee's branch");
			System.out.println("5- Get a customer's name");
			System.out.println("6- Get a customer's surname");
			System.out.println("7- Get a customer's email");
			System.out.println("8- Get a customer's password");
			System.out.println("9- Add a new product");
			System.out.println("10- Shop online");
			System.out.println("11- Transfer a branch employee to another branch");
			System.out.println("12- Remove a branch");
			System.out.println("13- Check if there are any products needed");
			System.out.println("14- Check if a product is in stock");
			System.out.println("15- Purchase a product");
			System.out.println("16- Remove a product");
			System.out.println("17- See a customer's previous orders");
			System.out.println("18- List the products");
			System.out.println("19- See which store a product is in");
			System.out.println("0- Exit");
			
			System.out.println("Choose an operation");
			entry = scan.nextInt();
			
			String name;
			String surname;
			String email;
			String password;
			int employee;
			int branch;
			int product;
			int model;
			int color;
			int cnum;
			int num;
			String address;
			String phone;
			
			switch(entry){
			
				case 0:
					System.out.println("Goodbye!");
					
					break;
			
				case 1:
					System.out.println("Enter the branch number the branch employee will work in");
					branch = scan.nextInt();
					
					Admin.addBranchEmployee(branch);
					
					break;
				
				case 2:
					scan.nextLine();
					
					System.out.println("Enter the name of the customer");
					name = scan.nextLine();
					
					System.out.println("Enter the surname of the customer");
					surname = scan.nextLine();
					
					System.out.println("Enter the email of the customer");
					email = scan.nextLine();
					
					System.out.println("Enter the password of the customer");
					password = scan.nextLine();
					
					Admin.addCustomer(name,surname,email,password);
					
					break;
				
				case 3:
					Admin.addBranch();
					
					break;
				
				case 4:
					System.out.println("Enter the branch employee's number you want the learn the branch of");
					num = scan.nextInt();
					
					System.out.println("This branch employee is currently working in branch " + Admin.getBranchEmployee(num).getBranch());
					
					break;
				
				case 5:
					System.out.println("Enter the customer's customer number you want the learn the name of");
					cnum = scan.nextInt();
					
					System.out.println("This customer's name is " + Admin.getCustomer(cnum).getName());
					
					break;
				
				case 6:
					System.out.println("Enter the customer's customer number you want the learn the surname of");
					cnum = scan.nextInt();
					
					System.out.println("This customer's name is " + Admin.getCustomer(cnum).getSurname());
					
					break;
				
				case 7:
					System.out.println("Enter the customer's customer number you want the learn the email of");
					cnum = scan.nextInt();
					
					System.out.println("This customer's name is " + Admin.getCustomer(cnum).getEmail());
					
					break;
				
				case 8:
					System.out.println("Enter the customer's customer number you want the learn the password of");
					cnum = scan.nextInt();
					
					System.out.println("This customer's name is " + Admin.getCustomer(cnum).getPassword());
					
					break;
				
				case 9:
					System.out.println("Choose the product you want to add");
					
					System.out.println("1- Bookcase");
					System.out.println("2- Meeting Table");
					System.out.println("3- Office Cabinet");
					System.out.println("4- Office Chair");
					System.out.println("5- Office Desk");
					
					product = scan.nextInt();
					
					System.out.println("How many you want to add?");
					num = scan.nextInt();
					
					switch(product){
					
						case 1:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							bookcase bookcasenew1 = new bookcase(model);
							
							branchEmployee1.addProduct(bookcasenew1, num);
						
							break;
						
						case 2:
							System.out.println("Which model do you want? (between 1 and 10)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							meetingTable meetingtablenew1 = new meetingTable(model,color);
							
							branchEmployee1.addProduct(meetingtablenew1, num);
							
							break;
						
						case 3:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							officeCabinet officecabinetnew1 = new officeCabinet(model);
							
							branchEmployee1.addProduct(officecabinetnew1, num);
						
							break;
						
						case 4:
							System.out.println("Which model do you want? (between 1 and 7)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 5)");
							color = scan.nextInt();
							
							officeChair officechairnew1 = new officeChair(model,color);
							
							branchEmployee1.addProduct(officechairnew1, num);
						
							break;
						
						case 5:
							System.out.println("Which model do you want? (between 1 and 5)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							officeDesk officedesknew1 = new officeDesk(model,color);
							
							branchEmployee1.addProduct(officedesknew1, num);
						
							break;
							
						default:
							System.out.println("Invalid choice");
							
							break;
					
					}
					
					break;
				
				case 10:
					System.out.println("Choose the product you want to purchase online");
					
					System.out.println("1- Bookcase");
					System.out.println("2- Meeting Table");
					System.out.println("3- Office Cabinet");
					System.out.println("4- Office Chair");
					System.out.println("5- Office Desk");
					
					product = scan.nextInt();
					
					System.out.println("Enter your customer number");
					cnum = scan.nextInt();
					
					System.out.println("How many you want to purchase?");
					num = scan.nextInt();
					
					scan.nextLine();
					
					System.out.println("Enter the address the order will be delivered to");
					address = scan.nextLine();
					
					System.out.println("Enter a phone number");
					phone = scan.nextLine();
					
					switch(product){
					
						case 1:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							bookcase bookcasenew2 = new bookcase(model);
							
							customer1.shopOnline(bookcasenew2,num,address,phone);
						
							break;
						
						case 2:
							System.out.println("Which model do you want? (between 1 and 10)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							meetingTable meetingtablenew2 = new meetingTable(model,color);
							
							customer1.shopOnline(meetingtablenew2,num,address,phone);
							
							break;
						
						case 3:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							officeCabinet officecabinetnew2 = new officeCabinet(model);
							
							customer1.shopOnline(officecabinetnew2,num,address,phone);
						
							break;
						
						case 4:
							System.out.println("Which model do you want? (between 1 and 7)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 5)");
							color = scan.nextInt();
							
							officeChair officechairnew2 = new officeChair(model,color);
							
							customer1.shopOnline(officechairnew2,num,address,phone);
						
							break;
						
						case 5:
							System.out.println("Which model do you want? (between 1 and 5)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							officeDesk officedesknew2 = new officeDesk(model,color);
							
							customer1.shopOnline(officedesknew2,num,address,phone);
						
							break;
							
						default:
							System.out.println("Invalid choice");
							
							break;
					
					}
				
					break;
				
				case 11:
					System.out.println("Which branch employee will be transferred? Enter his/her number");
					num = scan.nextInt();
					
					System.out.println("Which branch they will be transferred to?");
					branch = scan.nextInt();
					
					Admin.getBranchEmployee(num).setBranch(branch);
				
					break;
				
				case 12:
					System.out.println("Enter the number of the branch you want to remove");
					branch = scan.nextInt();
					
					Admin.removeBranch(branch);
				
					break;
				
				case 13:
					Admin.anyProductNeeded();
					
					break;
				
				case 14:
					System.out.println("Choose the product you want to see if is in stock");
					
					System.out.println("1- Bookcase");
					System.out.println("2- Meeting Table");
					System.out.println("3- Office Cabinet");
					System.out.println("4- Office Chair");
					System.out.println("5- Office Desk");
					
					product = scan.nextInt();
					
					System.out.println("How many you need?");
					num = scan.nextInt();
					
					switch(product){
					
						case 1:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							bookcase bookcasenew3 = new bookcase(model);
							
							if(branchEmployee1.isInStock(bookcasenew3, num) == true)	System.out.println("Yes, this product is in stock");
							else	System.out.println("Sorry, this product is not in stock");
						
							break;
						
						case 2:
							System.out.println("Which model do you want? (between 1 and 10)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							meetingTable meetingtablenew3 = new meetingTable(model,color);
							
							if(branchEmployee1.isInStock(meetingtablenew3, num) == true)	System.out.println("Yes, this product is in stock");
							else	System.out.println("Sorry, this product is not in stock");
							
							break;
						
						case 3:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							officeCabinet officecabinetnew3 = new officeCabinet(model);
							
							if(branchEmployee1.isInStock(officecabinetnew3, num) == true)	System.out.println("Yes, this product is in stock");
							else	System.out.println("Sorry, this product is not in stock");
						
							break;
						
						case 4:
							System.out.println("Which model do you want? (between 1 and 7)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 5)");
							color = scan.nextInt();
							
							officeChair officechairnew3 = new officeChair(model,color);
							
							if(branchEmployee1.isInStock(officechairnew3, num) == true)	System.out.println("Yes, this product is in stock");
							else	System.out.println("Sorry, this product is not in stock");
						
							break;
						
						case 5:
							System.out.println("Which model do you want? (between 1 and 5)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							officeDesk officedesknew3 = new officeDesk(model,color);
							
							if(branchEmployee1.isInStock(officedesknew3, num) == true)	System.out.println("Yes, this product is in stock");
							else	System.out.println("Sorry, this product is not in stock");
						
							break;
							
						default:
							System.out.println("Invalid choice");
							
							break;
					
					}
				
					break;
				
				case 15:
					System.out.println("How many you want to purchase?");
					num = scan.nextInt();
					
					System.out.println("Enter your customer number");
					cnum = scan.nextInt();
					
					System.out.println("Choose the product you want to purchase");
					
					System.out.println("1- Bookcase");
					System.out.println("2- Meeting Table");
					System.out.println("3- Office Cabinet");
					System.out.println("4- Office Chair");
					System.out.println("5- Office Desk");
					
					product = scan.nextInt();
					
					switch(product){
					
						case 1:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							bookcase bookcasenew4 = new bookcase(model);
							
							branchEmployee1.makeSale(bookcasenew4,num,customer1);
						
							break;
						
						case 2:
							System.out.println("Which model do you want? (between 1 and 10)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							meetingTable meetingtablenew4 = new meetingTable(model,color);
							
							branchEmployee1.makeSale(meetingtablenew4,num,customer1);
							
							break;
						
						case 3:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							officeCabinet officecabinetnew4 = new officeCabinet(model);
							
							branchEmployee1.makeSale(officecabinetnew4,num,customer1);
						
							break;
						
						case 4:
							System.out.println("Which model do you want? (between 1 and 7)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 5)");
							color = scan.nextInt();
							
							officeChair officechairnew4 = new officeChair(model,color);
							
							branchEmployee1.makeSale(officechairnew4,num,customer1);
						
							break;
						
						case 5:
							System.out.println("Which model do you want? (between 1 and 5)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							officeDesk officedesknew4 = new officeDesk(model,color);
							
							branchEmployee1.makeSale(officedesknew4,num,customer1);
						
							break;
							
						default:
							System.out.println("Invalid choice");
							
							break;
					
					}
				
					break;
				
				case 16:
					System.out.println("How many do you want to remove?");
					num = scan.nextInt();
					
					System.out.println("Choose the product you want to remove");
					
					System.out.println("1- Bookcase");
					System.out.println("2- Meeting Table");
					System.out.println("3- Office Cabinet");
					System.out.println("4- Office Chair");
					System.out.println("5- Office Desk");
					
					product = scan.nextInt();
					
					switch(product){
					
						case 1:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							bookcase bookcasenew5 = new bookcase(model);
							
							branchEmployee1.removeProduct(bookcasenew5,num);
						
							break;
						
						case 2:
							System.out.println("Which model do you want? (between 1 and 10)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							meetingTable meetingtablenew5 = new meetingTable(model,color);
							
							branchEmployee1.removeProduct(meetingtablenew5,num);
							
							break;
						
						case 3:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							officeCabinet officecabinetnew5 = new officeCabinet(model);
							
							branchEmployee1.removeProduct(officecabinetnew5,num);
						
							break;
						
						case 4:
							System.out.println("Which model do you want? (between 1 and 7)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 5)");
							color = scan.nextInt();
							
							officeChair officechairnew5 = new officeChair(model,color);
							
							branchEmployee1.removeProduct(officechairnew5,num);
						
							break;
						
						case 5:
							System.out.println("Which model do you want? (between 1 and 5)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							officeDesk officedesknew5 = new officeDesk(model,color);
							
							branchEmployee1.removeProduct(officedesknew5,num);
						
							break;
							
						default:
							System.out.println("Invalid choice");
							
							break;
					
					}
				
					break;
				
				case 17:
					System.out.println("Enter your customer number");
					cnum = scan.nextInt();
					
					Admin.getCustomer(cnum).getOrders();
				
					break;
					
				case 18:
					customer1.productList();
				
					break;
				
				case 19:
					System.out.println("Choose the product you want to know the location of");
					
					System.out.println("1- Bookcase");
					System.out.println("2- Meeting Table");
					System.out.println("3- Office Cabinet");
					System.out.println("4- Office Chair");
					System.out.println("5- Office Desk");
					
					product = scan.nextInt();
					
					switch(product){
					
						case 1:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							bookcase bookcasenew6 = new bookcase(model);
							
							customer1.whichStore(bookcasenew6);
						
							break;
						
						case 2:
							System.out.println("Which model do you want? (between 1 and 10)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							meetingTable meetingtablenew6 = new meetingTable(model,color);
							
							customer1.whichStore(meetingtablenew6);
							
							break;
						
						case 3:
							System.out.println("Which model do you want? (between 1 and 12)");
							model = scan.nextInt();
							
							officeCabinet officecabinetnew6 = new officeCabinet(model);
							
							customer1.whichStore(officecabinetnew6);
						
							break;
						
						case 4:
							System.out.println("Which model do you want? (between 1 and 7)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 5)");
							color = scan.nextInt();
							
							officeChair officechairnew6 = new officeChair(model,color);
							
							customer1.whichStore(officechairnew6);
						
							break;
						
						case 5:
							System.out.println("Which model do you want? (between 1 and 5)");
							model = scan.nextInt();
							
							System.out.println("Which color do you want? (between 1 and 4)");
							color = scan.nextInt();
							
							officeDesk officedesknew6 = new officeDesk(model,color);
							
							customer1.whichStore(officedesknew6);
						
							break;
							
						default:
							System.out.println("Invalid choice");
							
							break;
					
					}
				
					break;
				
				
					
				default:
					System.out.println("Invalid operation");
					
					break;
			
			}
		
		}
	
	}
}
