class eBayUserRegistration {

    static String email = "user@ebay.com";
    static int region = 4;

    public static void main(String[] args) {

        // invoke method
        registerEbayUser("ebay_user","Ebay@321","Email","ebToken88","eb_808");
    }

    static void registerEbayUser(String username,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Region: " + region);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
