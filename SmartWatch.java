class SmartWatch {
	    static String brand = "Apple";
        static String model = "Watch Series 9";
        static float displaySize = 1.9F;
        static String connectivity = "Bluetooth + Wi-Fi";
        static boolean gps = true;
        static boolean heartRateMonitor = true;
        static boolean waterResistant = true;
        static String color = "Midnight Aluminum";
        static int batteryLife = 18;
        static int price = 41900;
        public static void main(String[] args) {
			
        /*String brand = "Apple";
        String model = "Watch Series 9";
        float displaySize = 1.9F;
        String connectivity = "Bluetooth + Wi-Fi";
        boolean gps = true;
        boolean heartRateMonitor = true;
        boolean waterResistant = true;
        String color = "Midnight Aluminum";
        int batteryLife = 18;
        int price = 41900;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Display Size (inches): " + displaySize);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("GPS: " + gps);
        System.out.println("Heart Rate Monitor: " + heartRateMonitor);
        System.out.println("Water Resistant: " + waterResistant);
        System.out.println("Color: " + color);
        System.out.println("Battery Life (hours): " + batteryLife);
        System.out.println("Price (INR): ₹" + price);
    }
}