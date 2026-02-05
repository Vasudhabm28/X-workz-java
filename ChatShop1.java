class ChatShop1{
	public static void main(String[] args){
		String chatItems[]={"Pani Puri","Bhel Puri","Sev Puri","Masala Puri","Dahi Puri","Aloo Tikki","Samosa","Kachori","Papdi Chat","Ragda Patties"};
		//String teaItems[]={"Normal Tea","Ginger Tea","Masala Tea","Green Tea","Black Tea","Lemon Tea","Elaichi Tea","Tulsi Tea","Honey Tea","Milk Tea"};
	    String paniPuri = chatItems[0];
		String belPuri = chatItems[1];
		String sevPuri = chatItems[2];
	    String masalaPuri = chatItems[3];
		String dahiPuri = chatItems[4];
		String alooTikki = chatItems[5];
		String samosa = chatItems[6];
		String Kachori = chatItems[7];
		String PapdiChat = chatItems[8];
		String RagdaPatties= chatItems[8];
		
		int size = chatItems.length;
		System.out.println("The no of Chats available are "+size);
        System.out.println("Chats names are");	
		System.out.println(paniPuri + " "+belPuri+" "+sevPuri+" "+masalaPuri+" "+dahiPuri+" "+samosa + " "+Kachori+ " "+PapdiChat+ " "+RagdaPatties);
		System.out.println("Chat list using for each");
			for(String chatName: chatItems){
				System.out.println(chatName);
			}
		
	}
	
}