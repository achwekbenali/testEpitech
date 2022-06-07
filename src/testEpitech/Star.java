package testEpitech;

public class Star {

	
// eol end of line 
	private static String eol = "\n";

	public static void main(String[] args) {

		int nombre = 10;
		try {
			nombre = Integer.parseInt(args[0]);
		} catch (Exception e) {
			return;
		}
		if (args.length > 1 && "e".equals(args[1]))
			eol = "$" + eol;
		if (nombre == 1) {
			System.out.println("   *" + eol + "*** ***" + eol + " *   *" + eol + "*** ***" + eol + "   *");
		} else if (nombre > 1) {
			int i;
			int j;
			for (i = 1; i <= nombre + 1; i++) {
				if (i <= nombre) {
					for (j = nombre * 3 - 1; j > 0; j--) {
						System.out.print(" ");
						if (j == i)
							System.out.print("*");
					}
					if (i != 1) {
						for (j = 0; j < nombre * 3 - 1; j++) {
							if (j != 0) {
								if (j == i - 1) {
									System.out.print("*");
									break;
								} else
									System.out.print(" ");
							}
						}
					}
				} else {
					for (j = 0; j < nombre * 2 + 1; j++)
						System.out.print("*");
					for (j = 0; j < nombre * 2 - 3; j++)
						System.out.print(" ");
					for (j = 0; j < nombre * 2 + 1; j++)
						System.out.print("*");
				}
				System.out.print(eol);
			}

			for (i = 0; i <= nombre - 1; i++) {
				for (j = 0; j <= i; j++)
					System.out.print(" ");
				System.out.print("*");
				for (j = i; j <= (nombre - 1) * 6 - i; j++)
					System.out.print(" ");
				System.out.print("*");
				System.out.print(eol);
			}

			for (i = nombre - 2; i >= 0; i--) {
				for (j = 0; j <= i; j++)
					System.out.print(" ");
				System.out.print("*");
				for (j = i; j <= (nombre - 1) * 6 - i; j++)
					System.out.print(" ");
				System.out.print("*");
				System.out.print(eol);
			}

			for (i = nombre + 1; i >= 1; i--) {
				if (i <= nombre) {
					for (j = nombre * 3 - 1; j > 0; j--) {
						System.out.print(" ");
						if (j == i) {
							System.out.print("*");
						}
					}
					if (i != 1) {
						for (j = 0; j < nombre * 3 - 1; j++) {
							if (j != 0) {
								if (j == i - 1) {
									System.out.print("*");
									break;
								} else {
									System.out.print(" ");
								}
							}
						}
					}
				} else {
					for (j = 0; j < nombre * 2 + 1; j++)
						System.out.print("*");
					for (j = 0; j < nombre * 2 - 3; j++)
						System.out.print(" ");
					for (j = 0; j < nombre * 2 + 1; j++)
						System.out.print("*");
				}
				System.out.print(eol);
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
}
