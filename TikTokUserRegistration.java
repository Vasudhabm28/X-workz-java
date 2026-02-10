class TikTokUserRegistration {

    static String email = "user@tiktok.com";
    static int region = 5;

    public static void main(String[] args) {

        registerTikTokUser("tiktok_star","Tik@2026","Email","ttToken44","tt_202");
    }

    static void registerTikTokUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Region: " + region);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
