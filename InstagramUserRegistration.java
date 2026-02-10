class InstagramUserRegistration {

    static String email = "user@instagram.com";
    static int region = 4;

    public static void main(String[] args) {

        // invoke method
        registerInstagramUser("insta_user","Insta@321","Mobile","instaToken88","insta_123");
    }

    static void registerInstagramUser(String username,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Region: " + region);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
