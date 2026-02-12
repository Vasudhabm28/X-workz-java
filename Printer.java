class Printer {
	    static String brand = "HP";
        static String model = "DeskJet 2723";
        static String type = "All-in-One Inkjet Printer";
        static boolean colorPrint = true;
        static boolean wifiEnabled = true;
        static int printSpeed = 7;
        static String paperSize = "A4";
        static int warranty = 1;
        static String color = "White";
        static int price = 6499;
        public static void main(String[] args) {\
		
        /*String brand = "HP";
        String model = "DeskJet 2723";
        String type = "All-in-One Inkjet Printer";
        boolean colorPrint = true;
        boolean wifiEnabled = true;
        int printSpeed = 7;
        String paperSize = "A4";
        int warranty = 1;
        String color = "White";
        int price = 6499;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Color Printing: " + colorPrint);
        System.out.println("Wi-Fi Enabled: " + wifiEnabled);
        System.out.println("Print Speed (ppm): " + printSpeed);
        System.out.println("Paper Size: " + paperSize);
        System.out.println("Warranty (years): " + warranty);
        System.out.println("Color: " + color);
        System.out.println("Price (INR): ₹" + price);
    }
}