class WaterHeater {
    static boolean isHeating;

    static boolean onoroff() {
        if (isHeating == false) {
            isHeating = true;
            System.out.println("The Water Heater is heating...");
        } else if (isHeating == true) {
            isHeating = false;
            System.out.println("The Water Heater is turned off...");
        }
        return isHeating;
    }
}

