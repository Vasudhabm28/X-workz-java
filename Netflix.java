class Netflix{
	public static void main(String[] args){

		String kannadaMovies[]={
		"KGF","Kantara","Lucia","Ugramm","RangiTaranga","Mungaru Male","Raajakumara","GGVV",
		"Ulidavaru Kandanthe","Avane Srimannarayana","777 Charlie","Dia","Kirik Party",
		"Tagaru","Bell Bottom","Operation Alamelamma","Popcorn Monkey Tiger",
		"Badava Rascal","Sapta Sagaradaache Ello","Garuda"};
		

		String englishMovies[]={
		"The Shawshank Redemption","Inception","The Dark Knight","Forrest Gump","Titanic",
		"Interstellar","Avatar","Gladiator","Jurassic Park","The Matrix","Fight Club",
		"Avengers","Iron Man","The Prestige","Django Unchained","The Godfather",
		"Se7en","Whiplash","Joker","Oppenheimer"};

		String hindiMovies[]={
		"3 Idiots","Dangal","Lagaan","Sholay","PK","Andhadhun","Kabir Singh",
		"Bajrangi Bhaijaan","Queen","Gully Boy","Drishyam","Taare Zameen Par",
		"Chak De India","Swades","Kesari","Barfi","Uri","Zindagi Na Milegi Dobara",
		"Article 15","Rockstar"};

		String teluguMovies[]={
		"Baahubali","Baahubali 2","RRR","Pushpa","Magadheera","Ala Vaikunthapurramuloo",
		"Eega","Rangasthalam","Jersey","Arjun Reddy","Pokiri","Athadu","Temper",
		"Khaleja","Bichagadu","Sye","Leader","Vikramarkudu","Chatrapathi","Janatha Garage"};

		String tamilMovies[]={
		"Baasha","Enthiran","Vikram","Nayakan","Anniyan","Alaipayuthey","Master",
		"Asuran","Ghajini","Visaranai","Kaithi","Super Deluxe","Ratsasan",
		"Thani Oruvan","Jai Bhim","96","Soorarai Pottru","Vada Chennai","Petta","Indian"};
		
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
