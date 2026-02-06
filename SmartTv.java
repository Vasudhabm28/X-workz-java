class SmartTv {
	    static String brand = "Sony";
        static String model = "Bravia X80L";
        static float screenSize = 55.0F;
        static String resolution = "4K Ultra HD";
        static String displayType = "LED";
        static String os = "Google TV";
        static boolean voiceControl = true;
        static int hdmiPorts = 3;
        static int usbPorts = 2;
        static int price = 69999;
        public static void main(String[] args) {
			
        /*String brand = "Sony";
        String model = "Bravia X80L";
        float screenSize = 55.0F;
        String resolution = "4K Ultra HD";
        String displayType = "LED";
        String os = "Google TV";
        boolean voiceControl = true;
        int hdmiPorts = 3;
        int usbPorts = 2;
        int price = 69999;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size (inches): " + screenSize);
        System.out.println("Resolution: " + resolution);
        System.out.println("Display Type: " + displayType);
        System.out.println("Operating System: " + os);
        System.out.println("Voice Control: " + voiceControl);
        System.out.println("HDMI Ports: " + hdmiPorts);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Price (INR): ₹" + price);
    }
}