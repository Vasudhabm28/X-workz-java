class Resturant{
	public static void main(String[] args){
    String resName="Udupi Resturant";
	String resOwner="Ram";
	String resAddress="Banglore";
	String branches[]={"Majestic","RR Nagar","Vijaynagar"};
	String managers[]={"Abc","Def","Xyz"};
	
	System.out.println("The Resturant info is:");
	System.out.println("The name of Resturant is "+resName);
	System.out.println("The owner of Resturant is "+resOwner);
	System.out.println("The address of Resturant is "+resAddress);
	
	System.out.println("The branches of Resturant is "+ branches.length);
	System.out.println("The list of branches available are ");
	for(String branch:branches){
		System.out.println(branch);
	}
	System.out.println("The managers of Resturant is "+ managers.length);
	System.out.println("The managers available are ");
	for(String manager:managers){
		System.out.println(manager);
	}
	}
}
		
		
		
		