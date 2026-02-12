class IronBox {
    static boolean isHeating;

    static boolean onoroff() {
        if (isHeating == false) {
            isHeating = true;
            System.out.println("The Iron Box is heating...");
        } else if (isHeating == true) {
            isHeating = false;
            System.out.println("The Iron Box is turned off...");
        }
        return isHeating;
    }
}

