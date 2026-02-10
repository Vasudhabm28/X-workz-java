class GoogleUserRegistration {

    static String email = "user@gmail.com";
    static int dataCenter = 6;

    public static void main(String[] args) {

        // invoke method
        registerGoogleUser("google_user","Goog@999","Gmail","googleToken55","g_user_09");
    }

    static void registerGoogleUser(
        String username,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}

