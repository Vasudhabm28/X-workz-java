class GitHubUserRegistration {

	static String email = "user@github.com";
	static int repoLimit = 100;

	public static void main(String[] args) {
		String username = "dev_user";
		String password = "Git@123";
		String authMethod = "SSH";
		String token = "gitToken99";
		String userId = "gh_654";

		System.out.println("Repo Limit: " + repoLimit);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("Auth Method: " + authMethod);
		System.out.println("Token: " + token);
		System.out.println("User ID: " + userId);
	}
}
