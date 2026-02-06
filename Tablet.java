class Tablet {
	    static String brand = "Apple";
        static String model = "iPad Air (5th Gen)";
        static float displaySize = 10.9F;
        static String processor = "Apple M1 Chip";
        static int storage = 256;
        static String os = "iPadOS 17";
        static boolean wifi = true;
        static boolean cellular = false;
        static String color = "Starlight";
        static int price = 66900;
        public static void main(String[] args) {
			
        /*String brand = "Apple";
        String model = "iPad Air (5th Gen)";
        float displaySize = 10.9F;
        String processor = "Apple M1 Chip";
        int storage = 256;
        String os = "iPadOS 17";
        boolean wifi = true;
        boolean cellular = false;
        String color = "Starlight";
        int price = 66900;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Display Size (inches): " + displaySize);
        System.out.println("Processor: " + processor);
        System.out.println("Storage (GB): " + storage);
        System.out.println("Operating System: " + os);
        System.out.println("Wi-Fi Enabled: " + wifi);
        System.out.println("Cellular Enabled: " + cellular);
        System.out.println("Color: " + color);
        System.out.println("Price (INR): ₹" + price);
    }
}