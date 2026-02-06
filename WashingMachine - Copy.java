class WashingMachine {
	    static String brand = "Samsung";
        static String model = "WW80T504DAN";
        static int capacity = 8;
        static String type = "Front Load";
        static String energyRating = "5 Star";
        static String washTechnology = "EcoBubble";
        static int spinSpeed = 1200;
        static String color = "Silver";
        static boolean inverterMotor = true;
        static int price = 44990;
        public static void main(String[] args) {
			
        /*String brand = "Samsung";
        String model = "WW80T504DAN";
        int capacity = 8;
        String type = "Front Load";
        String energyRating = "5 Star";
        String washTechnology = "EcoBubble";
        int spinSpeed = 1200;
        String color = "Silver";
        boolean inverterMotor = true;
        int price = 44990;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity (kg): " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Wash Technology: " + washTechnology);
        System.out.println("Spin Speed (RPM): " + spinSpeed);
        System.out.println("Color: " + color);
        System.out.println("Inverter Motor: " + inverterMotor);
        System.out.println("Price (INR): ₹" + price);
    }
}