class Hello {
	public static void main(string[] args) {
		string name = System.getenv("USERNAME_VAR");
		if (name != null) {
			system.out.println("Hello",+ " "+name);
		}else {
			system.out.println("Environment variable not set!");
		}
	}
}

