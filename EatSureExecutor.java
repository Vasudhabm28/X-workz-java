class EatSureExecutor {
    public static void main(String[] args){
        String foodName = "pulavrice";
        double price = UberEats.search(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
    }
}