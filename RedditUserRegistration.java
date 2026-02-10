class RedditUserRegistration {

    static String email = "user@reddit.com";
    static int serverZone = 3;

    public static void main(String[] args) {

        registerRedditUser("reddit_user","Red@789","Email","rdToken66","rd_606");
    }

    static void registerRedditUser(String username,String password,String authMethod,String token,String userId) {
        
		System.out.println("Email: " + email);
        System.out.println("Server Zone: " + serverZone);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
