class Hospital {
    public static void main(String[] args) {

        String hospitalName = "City Care Hospital";
        String hospitalHead = "Dr. Suresh";
        String hospitalAddress = "Bangalore";

        String[] departments = {"Cardiology", "Neurology", "Orthopedics"};
        String[] doctors = {"Dr. Anil", "Dr. Meena", "Dr. Ravi"};

        System.out.println("Hospital Information:");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Head: " + hospitalHead);
        System.out.println("Address: " + hospitalAddress);

        System.out.println("\nNumber of Departments: " + departments.length);
        System.out.println("Departments Available:");
        for (String department : departments) {
            System.out.println(department);
        }

        System.out.println("\nNumber of Doctors: " + doctors.length);
        System.out.println("Doctors Available:");
        for (String doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
