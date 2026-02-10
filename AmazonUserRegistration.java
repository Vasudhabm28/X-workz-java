class AmazonUserRegistration {

    static String email = "user@amazon.com";
    static int warehouse = 10;

    public static void main(String[] args) {

        // invoke method
        registerAmazonUser("amazon_user","Ama@123","OTP","amazonToken33","amz_456");
    }

    static void registerAmazonUser(String username,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Warehouse: " + warehouse);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}

