class SnapchatUserRegistration {

    static String email = "user@snapchat.com";
    static int region = 7;

    public static void main(String[] args) {

        registerSnapchatUser("snap_user","Snap@123","Email","scToken77","sc_303");
    }

    static void registerSnapchatUser(String username,String password,String authMethod,String token,String userId) {
        
		System.out.println("Email: " + email);
        System.out.println("Region: " + region);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
