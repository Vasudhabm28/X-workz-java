class Supermarket{
	public static void main(String[] args){

		String fruits[]={
		"Apple","Banana","Orange","Mango","Grapes","Pineapple","Papaya","Watermelon",
		"Muskmelon","Strawberry","Blueberry","Guava","Pomegranate","Kiwi","Peach",
		"Plum","Cherry","Pear","Fig","Litchi","Dragon Fruit","Custard Apple",
		"Apricot","Raspberry","Blackberry"};

		String vegetables[]={
		"Potato","Tomato","Onion","Carrot","Cabbage","Cauliflower","Brinjal","Beans",
		"Peas","Spinach","Radish","Beetroot","Cucumber","Pumpkin","Bottle Gourd",
		"Bitter Gourd","Ridge Gourd","Lady Finger","Capsicum","Sweet Corn",
		"Mushroom","Drumstick","Broccoli","Zucchini","Turnip"};

		String dairyProducts[]={
		"Milk","Curd","Butter","Cheese","Paneer","Ghee","Cream","Buttermilk",
		"Flavored Milk","Condensed Milk","Milk Powder","Ice Cream","Yogurt",
		"Cheddar","Mozzarella","Cottage Cheese","Whey","Lassi","Khoya",
		"Sour Cream","Whipping Cream","Skimmed Milk","Full Cream Milk",
		"Greek Yogurt","Flavored Yogurt"};

		String bakeryItems[]={
		"Bread","Brown Bread","White Bread","Buns","Croissant","Donut","Cake",
		"Pastry","Cookies","Biscuits","Rusk","Muffin","Cupcake","Garlic Bread",
		"Pizza Base","Burger Bun","Bread Sticks","Fruit Cake","Plum Cake",
		"Sponge Cake","Swiss Roll","Brownie","Toast","Cream Roll","Puff"};

		String beverages[]={
		"Tea","Coffee","Green Tea","Black Tea","Lemon Tea","Cold Coffee",
		"Milkshake","Fruit Juice","Orange Juice","Apple Juice","Mango Juice",
		"Energy Drink","Soft Drink","Soda","Mineral Water","Sparkling Water",
		"Iced Tea","Herbal Tea","Hot Chocolate","Protein Shake",
		"Flavored Water","Mocktail","Lassi","Buttermilk","Coconut Water"};

		String snacks[]={
		"Chips","Popcorn","Nachos","Salted Peanuts","Roasted Chana",
		"Mixture","Murukku","Khara Boondi","Aloo Bhujia","Sev",
		"Chocolate","Candy","Toffee","Cookies","Biscuits",
		"Granola Bar","Energy Bar","Trail Mix","Cornflakes",
		"Oats","Makhana","Cheese Balls","Potato Wafers",
		"Banana Chips","Fryums"};

		String frozenFoods[]={
		"Frozen Peas","Frozen Corn","Frozen French Fries","Frozen Pizza",
		"Frozen Paratha","Frozen Chapati","Frozen Idli","Frozen Dosa",
		"Frozen Nuggets","Frozen Momos","Frozen Samosa","Frozen Cutlet",
		"Frozen Fish","Frozen Prawns","Frozen Chicken",
		"Frozen Veg Burger","Frozen Paneer","Frozen Spring Roll",
		"Frozen Waffles","Frozen Garlic Bread","Frozen Cheese Cubes",
		"Frozen Ice Cream","Frozen Kulfi","Frozen Falooda","Frozen Berries"};

		String grains[]={
		"Rice","Basmati Rice","Brown Rice","Wheat","Atta","Maida","Rava",
		"Jowar","Bajra","Ragi","Barley","Oats","Quinoa","Millets",
		"Corn","Poha","Rice Flakes","Broken Wheat","Semolina",
		"Vermicelli","Sago","Puffed Rice","Maize Flour",
		"Wheat Bran","Multigrain Flour"};

		String pulses[]={
		"Toor Dal","Moong Dal","Masoor Dal","Chana Dal","Urad Dal",
		"Black Gram","Green Gram","Kabuli Chana","Kala Chana",
		"Rajma","White Peas","Green Peas","Soybeans","Lentils",
		"Red Lentils","Yellow Lentils","Horse Gram","Cow Peas",
		"Pigeon Peas","Field Beans","Dry Peas","Split Peas",
		"Chickpeas","Black Eyed Peas","Mixed Dal"};

		String spices[]={
		"Salt","Sugar","Turmeric","Red Chilli Powder","Coriander Powder",
		"Cumin Seeds","Mustard Seeds","Black Pepper","Cardamom","Cloves",
		"Cinnamon","Bay Leaf","Fennel Seeds","Fenugreek","Dry Ginger",
		"Nutmeg","Mace","Star Anise","Asafoetida","Chaat Masala",
		"Garam Masala","Sambar Powder","Rasam Powder",
		"Pav Bhaji Masala","Kitchen King"};

		String oils[]={
		"Sunflower Oil","Groundnut Oil","Mustard Oil","Coconut Oil",
		"Olive Oil","Palm Oil","Soybean Oil","Rice Bran Oil",
		"Sesame Oil","Corn Oil","Canola Oil","Vegetable Oil",
		"Ghee","Butter Oil","Flaxseed Oil","Walnut Oil",
		"Avocado Oil","Mustard Cold Pressed Oil",
		"Extra Virgin Olive Oil","Refined Oil",
		"Blended Oil","Organic Oil","Cooking Oil",
		"Light Oil","Heavy Oil"};

		String meat[]={
		"Chicken","Mutton","Fish","Prawns","Crab","Lobster","Beef",
		"Pork","Turkey","Duck","Chicken Breast","Chicken Wings",
		"Chicken Leg","Mutton Curry Cut","Fish Fillet",
		"Salmon","Tuna","Sardine","Anchovy","Shrimp",
		"Sausage","Bacon","Ham","Meat Balls","Minced Meat"};

		String personalCare[]={
		"Soap","Shampoo","Conditioner","Hair Oil","Face Wash",
		"Face Cream","Body Lotion","Hand Wash","Toothpaste","Toothbrush",
		"Mouthwash","Face Scrub","Face Mask","Deodorant","Perfume",
		"Talcum Powder","Shaving Cream","Razor","Hair Gel",
		"Hair Serum","Sunscreen","Lip Balm","Wet Wipes",
		"Hand Sanitizer","Cotton Pads"};

		String cleaningProducts[]={
		"Detergent Powder","Liquid Detergent","Dishwash Liquid","Dishwash Bar",
		"Floor Cleaner","Toilet Cleaner","Phenyl","Bleach","Glass Cleaner",
		"Room Freshener","Fabric Softener","Stain Remover",
		"Scrub Pad","Scrub Brush","Broom","Mop","Dustbin Bag",
		"Disinfectant Spray","Hand Gloves","Cleaning Cloth",
		"Toilet Brush","Drain Cleaner","Car Cleaner",
		"Surface Cleaner","Sanitizing Liquid"};

		String stationery[]={
		"Pen","Pencil","Eraser","Sharpener","Notebook","Diary",
		"Drawing Book","Sketch Pens","Crayons","Highlighter",
		"Marker","Glue","Stapler","Staple Pins","Paper Clips",
		"Sticky Notes","Calculator","Scissors","Scale",
		"Compass","Geometry Box","Whiteboard Marker",
		"File Folder","Clipboard","Envelope"};

		String babyCare[]={
		"Baby Diapers","Baby Wipes","Baby Soap","Baby Shampoo",
		"Baby Lotion","Baby Oil","Baby Powder","Baby Cream",
		"Baby Feeding Bottle","Baby Food","Baby Cereal",
		"Baby Teether","Baby Pacifier","Baby Towel",
		"Baby Napkin","Baby Blanket","Baby Pillow",
		"Baby Toothbrush","Baby Toothpaste",
		"Baby Nail Cutter","Baby Cotton Buds",
		"Baby Bib","Baby Water Bottle",
		"Baby Moisturizer","Baby Sunscreen"};

		String petSupplies[]={
		"Dog Food","Cat Food","Bird Food","Fish Food","Pet Shampoo",
		"Pet Soap","Pet Collar","Pet Leash","Pet Toy","Pet Bed",
		"Pet Bowl","Pet Treats","Pet Vitamins","Pet Litter",
		"Pet Cage","Pet Carrier","Pet Grooming Brush",
		"Pet Nail Cutter","Pet Training Pads",
		"Pet Chew Toy","Pet Harness","Pet Flea Spray",
		"Pet Toothbrush","Pet Toothpaste","Pet Blanket"};

		String householdItems[]={
		"Buckets","Mugs","Plates","Bowls","Cups","Spoons","Forks",
		"Knives","Pressure Cooker","Gas Stove","Tawa","Frying Pan",
		"Cooking Pot","Water Bottle","Lunch Box","Storage Containers",
		"Thermos Flask","Dustbin","Cloth Hanger","Laundry Basket",
		"Doormat","Curtains","Bedsheet","Pillow Cover","Table Cloth"};

		String confectionery[]={
		"Milk Chocolate","Dark Chocolate","White Chocolate",
		"Chocolate Bar","Chocolate Wafer","Chocolate Biscuit",
		"Candy","Toffee","Lollipop","Gum","Jelly Beans",
		"Marshmallow","Caramel","Chocolate Truffle",
		"Chocolate Spread","Nut Chocolate","Fruit Candy",
		"Mint Candy","Eclair","Fudge","Chocolate Cake",
		"Chocolate Pastry","Chocolate Donut",
		"Chocolate Brownie","Chocolate Muffin"};
		
		System.out.println("The types of fruits are "+ fruits.length);
	System.out.println("The list of fruits available are ");
	for(String fruit:fruits){
		System.out.println(fruit);
	}
	System.out.println("The Types vegetables are "+ vegetables.length);
	System.out.println("The list of vegetables available are ");
	for(String vegetable:vegetables){
		System.out.println(vegetables);
	}
	System.out.println("The types of dairy products are "+ dairyProducts.length);
	System.out.println("The list of dairy products available are ");
	for(String dairyProduct:dairyProducts){
		System.out.println(dairyProduct);
	}
	System.out.println("The types of bakery items are "+ bakeryItems.length);
	System.out.println("The list of bakery items available are ");
	for(String bakeryItem:bakeryItems){
		System.out.println(bakeryItem);
	}
	System.out.println("The types of beverages are "+ beverages.length);
	System.out.println("The list of beverages available are ");
	for(String beverage:beverages){
		System.out.println(beverage);
	}
	System.out.println("The types of snacks are "+ snacks.length);
	System.out.println("The list of snacks available are ");
	for(String snack:snacks){
		System.out.println(snack);
	}
	System.out.println("The types of frozen foods are "+ frozenFoods.length);
	System.out.println("The list of frozen foods available are ");
	for(String frozenFood:frozenFoods){
		System.out.println(frozenFood);
	}
	System.out.println("The types of grains are "+ grains.length);
	System.out.println("The list of grains available are ");
	for(String grain:grains){
		System.out.println(grain);
	}
	System.out.println("The types of pulses are "+ pulses.length);
	System.out.println("The list of pulses available are ");
	for(String pulse:pulses){
		System.out.println(pulse);
	}
	System.out.println("The types of spices are "+ spices.length);
	System.out.println("The list of spices available are ");
	for(String spice:spices){
		System.out.println(spice);
	}
	System.out.println("The types of oils are "+ oils.length);
	System.out.println("The list of oils available are ");
	for(String oil:oils){
		System.out.println(oil);
	}
	System.out.println("The types of meats are "+ meats.length);
	System.out.println("The list of meats available are ");
	for(String meat:meats){
		System.out.println(meat);
	}
	System.out.println("The types of personal cares are "+ personalCares.length);
	System.out.println("The list of personal cares available are ");
	for(String personalCare:personalCares){
		System.out.println(personalCare);
	}
	System.out.println("The types of cleaning products are "+ cleaningProducts.length);
	System.out.println("The list of cleaning products available are ");
	for(String cleaningProduct:cleaningProducts){
		System.out.println(cleaningProduct);
	}
	System.out.println("The types of stationery are "+ stationery.length);
	System.out.println("The list of stationery available are ");
	for(String stationer:stationery){
		System.out.println(stationer);
	}
	System.out.println("The types of baby cares are "+ babyCares.length);
	System.out.println("The list of baby cares available are ");
	for(String babyCare:babyCares){
		System.out.println(babyCare);
	}
	System.out.println("The types of pet supplies are "+ petSupplies.length);
	System.out.println("The list of pet supplies available are ");
	for(String petSupply:petSupplies){
		System.out.println(petSupply);
	}
	System.out.println("The types of household items are "+ householdItems.length);
	System.out.println("The list of household items available are ");
	for(String householdItem:householdItems){
		System.out.println(householdItem);
	}
	System.out.println("The types of confectionery are "+ confectionery.length);
	System.out.println("The list of confectionery available are ");
	for(String confectioner:confectionery){
		System.out.println(confectioner);
	}
	}
}
