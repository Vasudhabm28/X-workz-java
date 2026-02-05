class SonyLiv{
	public static void main(String[] args){

		String kannadaMovies[]={
		"Ugramm","Tagaru","Kirik Party","Bell Bottom","Dia","Garuda",
		"Popcorn Monkey Tiger","Badava Rascal","French Biryani","Gantumoote",
		"Kavaludaari","Operation Alamelamma","Godhi Banna","Maya Bazaar",
		"Rama Rama Re","Athade Srimannarayana","Humble Politician Nograj",
		"RangiTaranga","Avane Srimannarayana","Kenda Sampige"};

		String englishMovies[]={
		"Men in Black","Spider-Man","Jumanji","Bad Boys","Venom",
		"Ghostbusters","Zombieland","Hotel Transylvania","The Karate Kid",
		"Skyfall","Spectre","Casino Royale","Equalizer","Hancock",
		"Passengers","Elysium","District 9","Looper","Arrival","Blade Runner 2049"};

		String hindiMovies[]={
		"Bhuj","Sadak 2","Ludo","Andhadhun","Drishyam",
		"Pink","Badla","Kahaani","Gangs of Wasseypur","Haider",
		"Omerta","Talvar","Shahid","Rocket Singh","Swades",
		"Chak De India","Udaan","Masaan","Newton","Article 15"};

		String teluguMovies[]={
		"Pokiri","Athadu","Khaleja","Leader","Temper",
		"Sye","Vikramarkudu","Chatrapathi","Bichagadu","Jersey",
		"Rangasthalam","Dear Comrade","Janatha Garage","Magadheera",
		"Eega","Baahubali","Baahubali 2","RRR","Pushpa","Ala Vaikunthapurramuloo"};

		String tamilMovies[]={
		"Nayakan","Baasha","Anniyan","Enthiran","Ghajini",
		"Vikram","Master","Asuran","Kaithi","Ratsasan",
		"96","Visaranai","Super Deluxe","Thani Oruvan",
		"Vada Chennai","Soorarai Pottru","Jai Bhim",
		"Sarpatta Parambarai","Karnan","Pariyerum Perumal"};
		
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
