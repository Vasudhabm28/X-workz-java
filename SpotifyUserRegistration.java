class SpotifyUserRegistration {

    static String email = "user@spotify.com";
    static int musicRegion = 8;

    public static void main(String[] args) {

        // invoke method
        registerSpotifyUser("music_lover","Spot@777","Email","spotToken21","sp_321");
    }

    static void registerSpotifyUser(String username,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Music Region: " + musicRegion);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
