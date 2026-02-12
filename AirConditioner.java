class AirConditioner {
    static boolean isCooling;

    static boolean onoroff() {
        if (isCooling == false) {
            isCooling = true;
            System.out.println("The Air Conditioner is cooling...");
        } else if (isCooling == true) {
            isCooling = false;
            System.out.println("The Air Conditioner is turned off...");
        }
        return isCooling;
    }
}

