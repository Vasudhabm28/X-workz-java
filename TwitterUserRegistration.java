class TwitterUserRegistration {

    static String email = "user@twitter.com";
    static int serverZone = 2;

    public static void main(String[] args) {

        // invoke method
        registerTwitterUser("@tweetuser","Tw@98765","Username","twtoken123","tw_user_007");
    }

    static void registerTwitterUser(String handle,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Server Zone: " + serverZone);
        System.out.println("Handle: " + handle);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
