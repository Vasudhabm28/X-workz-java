class MixerGrinder {
    static boolean isRunning;

    static boolean onoroff() {
        if (isRunning == false) {
            isRunning = true;
            System.out.println("The Mixer Grinder is running...");
        } else if (isRunning == true) {
            isRunning = false;
            System.out.println("The Mixer Grinder is stopped...");
        }
        return isRunning;
    }
}


