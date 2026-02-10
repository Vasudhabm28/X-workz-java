class LinkedInUserRegistration {

    static String email = "user@linkedin.com";
    static int location = 1;

    public static void main(String[] args) {

        // invoke method
        registerLinkedInUser("Bindu BE","Link@456","Email","linkToken77","ln_user_22");
    }

    static void registerLinkedInUser(String fullName,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Location: " + location);
        System.out.println("Full Name: " + fullName);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
