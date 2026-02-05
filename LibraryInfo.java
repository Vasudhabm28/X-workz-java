class LibraryInfo {
    public static void main(String[] args) {

        String libraryName = "City Public Library";
        String librarian = "Ms. Rekha";
        String area = "Jayanagar";

        String[] sections = {"Science", "Literature", "Technology"};
        String[] staff = {"Anand", "Kavya", "Prasad"};

        System.out.println("Library Information:");
        System.out.println("Name: " + libraryName);
        System.out.println("Librarian: " + librarian);
        System.out.println("Area: " + area);

        System.out.println("Sections: " + sections.length);
        for (String sec : sections) {
            System.out.println(sec);
        }

        System.out.println("Staff: " + staff.length);
        for (String s : staff) {
            System.out.println(s);
        }
    }
}
