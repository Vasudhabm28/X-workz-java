class Printer1 {
    static boolean isOn;

    static boolean onoroff() {
        if (isOn == false) {
            isOn = true;
            System.out.println("The Printer1 is turned on...");
        } else if (isOn == true) {
            isOn = false;
            System.out.println("The Printer1 is turned off...");
        }
        return isOn;
    }
}

