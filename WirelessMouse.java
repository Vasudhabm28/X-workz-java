class WirelessMouse {
	    static String brand = "Logitech";
        static String model = "M331 Silent Plus";
        static String connectivity = "2.4GHz Wireless";
        static String color = "Red";
        static int dpi = 1000;
        static boolean silentClick = true;
        static boolean batteryIncluded = true;
        static String batteryType = "AA";
        static int warranty = 1;
        static int price = 999;
        public static void main(String[] args) {
			
        /*String brand = "Logitech";
        String model = "M331 Silent Plus";
        String connectivity = "2.4GHz Wireless";
        String color = "Red";
        int dpi = 1000;
        boolean silentClick = true;
        boolean batteryIncluded = true;
        String batteryType = "AA";
        int warranty = 1;
        int price = 999;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Color: " + color);
        System.out.println("DPI: " + dpi);
        System.out.println("Silent Click: " + silentClick);
        System.out.println("Battery Included: " + batteryIncluded);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Warranty (years): " + warranty);
        System.out.println("Price (INR): ₹" + price);
    }
}