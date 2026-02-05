class CompanyInfo {
    public static void main(String[] args) {

        String companyName = "TechSoft Solutions";
        String ceo = "Mr. Arjun";
        String location = "Bangalore";

        String[] teams = {"Development", "Testing", "HR"};
        String[] employees = {"Amit", "Neha", "Rahul"};

        System.out.println("Company Information:");
        System.out.println("Name: " + companyName);
        System.out.println("CEO: " + ceo);
        System.out.println("Location: " + location);

        System.out.println("Teams: " + teams.length);
        for (String team : teams) {
            System.out.println(team);
        }

        System.out.println("Employees: " + employees.length);
        for (String emp : employees) {
            System.out.println(emp);
        }
    }
}
