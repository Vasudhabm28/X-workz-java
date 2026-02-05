class Hotstar{
	public static void main(String[] args){

		String kannadaMovies[]={
		"KGF","KGF 2","Raajakumara","Kantara","777 Charlie","Ugramm","RangiTaranga",
		"Tagaru","Dia","Bell Bottom","French Biryani","Kirik Party","Avane Srimannarayana",
		"Garuda","Popcorn Monkey Tiger","Badava Rascal","Kavaludaari",
		"Operation Alamelamma","Godhi Banna","Maya Bazaar"};

		String englishMovies[]={
		"Avengers","Avengers Endgame","Iron Man","Captain America","Thor",
		"Black Panther","Doctor Strange","Guardians of the Galaxy","Ant Man",
		"Spider-Man","Deadpool","Logan","X-Men","Fantastic Four",
		"Star Wars","Rogue One","Avatar","Titanic","The Lion King","Aladdin"};

		String hindiMovies[]={
		"MS Dhoni","Chhichhore","Bajrangi Bhaijaan","Baby","Neerja",
		"Tanhaji","Super 30","Bhool Bhulaiyaa","Drishyam","Prem Ratan Dhan Payo",
		"Ek Tha Tiger","Sultan","War","Kesari","Raazi",
		"Badhaai Ho","Hindi Medium","Laxmii","Lootera","Haider"};

		String teluguMovies[]={
		"RRR","Magadheera","Baahubali","Baahubali 2","Janatha Garage",
		"Eega","Athadu","Pokiri","Khaleja","Leader",
		"Temper","Bichagadu","Rangasthalam","Jersey","Sye",
		"Vikramarkudu","Chatrapathi","Dear Comrade","Pushpa","Ala Vaikunthapurramuloo"};

		String tamilMovies[]={
		"Vikram","Master","Bigil","Mersal","Theri",
		"Asuran","Kaithi","Soorarai Pottru","Jai Bhim","96",
		"Ratsasan","Petta","Enthiran","Anniyan","Ghajini",
		"Ayan","Thuppakki","Vada Chennai","Karnan","Sarpatta Parambarai"};
		
		System.out.println("Kannada movies are "+ kannadaMovies.length);
	System.out.println("The list of kannada movies available are ");
	for(String kannadaMovie:kannadaMovies){
		System.out.println(kannadaMovie);
	}
	System.out.println("English movies are "+ englishMovies.length);
	System.out.println("The list of english movies available are ");
	for(String englishMovie:englishMovies){
		System.out.println(englishMovie);
	}
	System.out.println("Hindi movies are "+ hindiMovies.length);
	System.out.println("The list of hindi movies available are ");
	for(String hindiMovie:hindiMovies){
		System.out.println(hindiMovie);
	}
	System.out.println("Telugu movies are "+ teluguMovies.length);
	System.out.println("The list of telugu movies available are ");
	for(String teluguMovie:teluguMovies){
		System.out.println(teluguMovie);
	}
	System.out.println("Tamil movies are "+ tamilMovies.length);
	System.out.println("The list of tamil movies available are ");
	for(String tamilMovie:tamilMovies){
		System.out.println(tamilMovie);
	}
	}
}
