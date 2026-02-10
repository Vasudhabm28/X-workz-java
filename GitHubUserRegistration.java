class GitHubUserRegistration {

    static String email = "user@github.com";
    static int repoLimit = 100;

    public static void main(String[] args) {

        // invoke method
        registerGitHubUser("dev_user","Git@123","SSH","gitToken99","gh_654");
    }

    static void registerGitHubUser(String username,String password,String authMethod,String token,String userId) {

        System.out.println("Email: " + email);
        System.out.println("Repo Limit: " + repoLimit);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
