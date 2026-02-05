class PoliceStation {
    public static void main(String[] args) {

        String stationName = "Central Police Station";
        String inspectorName = "Ramesh";
        String stationAddress = "Bangalore";

        String[] areasCovered = {"Majestic", "MG Road", "Vijayanagar"};
        String[] officers = {"Arun", "Suresh", "Mahesh"};

        System.out.println("Police Station Information:");
        System.out.println("Station Name: " + stationName);
        System.out.println("Inspector Name: " + inspectorName);
        System.out.println("Address: " + stationAddress);

        System.out.println("\nNumber of Areas Covered: " + areasCovered.length);
        System.out.println("Areas Covered:");
        for (String area : areasCovered) {
            System.out.println(area);
        }

        System.out.println("\nNumber of Officers: " + officers.length);
        System.out.println("Officers List:");
        for (String officer : officers) {
            System.out.println(officer);
        }
    }
}
