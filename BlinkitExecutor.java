class BlinkitExecutor {
    public static void main(String[] args){
        String foodName = "pulavrice";
        double price = Blinkit.search(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
    }
}