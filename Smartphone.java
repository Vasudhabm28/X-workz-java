class Smartphone {
	    static String brand = "Samsung";
        static String model = "Galaxy S24";
        static int ram = 8;
        static int storage = 256;
        static String processor = "Exynos 2400";
        static float displaySize = 6.2F;
        static int battery = 4000;
        static String color = "Phantom Black";
        static String os = "Android 14";
        static int price = 79999;
        public static void main(String[] args) {
			
        /*String brand = "Samsung";
        String model = "Galaxy S24";
        int ram = 8;
        int storage = 256;
        String processor = "Exynos 2400";
        float displaySize = 6.2F;
        int battery = 4000;
        String color = "Phantom Black";
        String os = "Android 14";
        int price = 79999;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM (GB): " + ram);
        System.out.println("Storage (GB): " + storage);
        System.out.println("Processor: " + processor);
        System.out.println("Display Size (inches): " + displaySize);
        System.out.println("Battery (mAh): " + battery);
        System.out.println("Color: " + color);
        System.out.println("Operating System: " + os);
        System.out.println("Price (INR): ₹" + price);
    }
}