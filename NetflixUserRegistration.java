class NetflixUserRegistration {

    static String email = "user@netflix.com";
    static int regionCode = 91;

    public static void main(String[] args) {

        // invoke method
        registerNetflixUser("Premium","Net@flix","Email","netflixToken66","nf_789");
    }

    static void registerNetflixUser(String plan,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Region Code: " + regionCode);
        System.out.println("Plan: " + plan);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}

