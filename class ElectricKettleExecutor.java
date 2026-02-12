class ElectricKettle {
    static boolean isBoiling;

    static boolean onoroff() {
        if (isBoiling == false) {
            isBoiling = true;
            System.out.println("The Electric Kettle is boiling...");
        } else if (isBoiling == true) {
            isBoiling = false;
            System.out.println("The Electric Kettle is turned off...");
        }
        return isBoiling;
    }
}

class ElectricKettleExecutor {
    public static void main(String[] args) {
        boolean ref = ElectricKettle.onoroff();
        System.out.println("The Electric Kettle is boiling " + ref);
    }
}
