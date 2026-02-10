class PinterestUserRegistration {

    static String email = "user@pinterest.com";
    static int region = 9;

    public static void main(String[] args) {

        registerPinterestUser("pin_user","Pin@456","Email","pinToken55","pin_505");
    }

    static void registerPinterestUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Region: " + region);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
