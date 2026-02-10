class FacebookUserRegistration {

    static String email = "user@facebook.com";
    static int dataCenter = 3;

    public static void main(String[] args) {

        // invoke method
        createUserAccount("fb_user","Fb@12345","Email","fb98765token","fb_user_001");
    }

    static void createUserAccount(String username,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}

