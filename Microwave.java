class Microwave {
    static boolean isHeating;

    static boolean onoroff() {
        if (isHeating == false) {
            isHeating = true;
            System.out.println("The Microwave is heating...");
        } else if (isHeating == true) {
            isHeating = false;
            System.out.println("The Microwave is turned off...");
        }
        return isHeating;
    }
}


