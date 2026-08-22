class Hello {
	public static void main(string[] args) {
		String name = System.getenv("USERNAME_VAR");
		if (name != null) {
			System.out.println("Hello,"+ " "+name);
		}else {
			System.out.println("Environment variable not set!");
		}
	}
}

