class HotelDetails {
    public static void main(String[] args) {

        String hotelName = "Udupi Restaurant";
        String hotelOwner = "Ram";
        String hotelAddress = "Bangalore";

        String[] branches = {"Majestic", "RR Nagar", "Vijayanagar"};
        String[] managers = {"Abc", "Def", "Xyz"};

        System.out.println("Hotel Information:");
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Owner: " + hotelOwner);
        System.out.println("Address: " + hotelAddress);

        System.out.println("\nTotal Branches: " + branches.length);
        System.out.println("Branches List:");
        for (String branch : branches) {
            System.out.println(branch);
        }

        System.out.println("\nTotal Managers: " + managers.length);
        System.out.println("Managers List:");
        for (String manager : managers) {
            System.out.println(manager);
        }
    }
}
