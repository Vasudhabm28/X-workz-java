class WhatsAppUserRegistration {

    static String mobile = "+9740164456";
    static int countryCode = 91;

    public static void main(String[] args) {

        // invoke method
        registerWhatsAppUser("whatsapp_user","456789","Mobile OTP","waToken11","wa_101");
    }

    static void registerWhatsAppUser(String username,String otp,String authMethod,String token,String userId) {

        System.out.println("Mobile: " + mobile);
        System.out.println("Country Code: " + countryCode);
        System.out.println("Username: " + username);
        System.out.println("OTP: " + otp);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
