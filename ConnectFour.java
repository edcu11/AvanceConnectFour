import java.util.Scanner;

public class ConnectFour {
	public static void main(String[] args) {
		System.out.println("BIENVENIDO " + System.getProperty("user.name"));
		Scanner scan = new Scanner(System.in);

		String deli = System.getProperty("line.separator");
		scan.useDelimiter(deli);

		int opc, pts = 0;
		String user, pass, creauser, creanom, creapass;

		System.out.println("Bienvenido a ConnectFour!\n");
		System.out.println("Seleccione el numero de la opcion que quiere");
		System.out.println("1. Login\n2. Registrarse\n3. Salir");
		opc = scan.nextInt();

		switch (opc) {
			case 1:
			System.out.println("\nLOGIN");
			System.out.print("Ingrese su usuario: ");
			user = scan.next();
			System.out.print("Ingrese su contra: ");
			pass = scan.next();

				if (pass.equals("Honduras")) {
					System.out.println("1. Jugar\n2. Ranking\n3. Mi Perfil\n4. Cerar Sesion");
				} else {
					do {
						System.out.println("Ingrese la contra correcta: ");
						pass = scan.next();
					} while (!pass.equals("Honduras"));
				}
				break;

			case 2:
			System.out.println("\nREGISTRARSE");
			System.out.print("Ingrese su usuario UNICO: ");
			creauser = scan.next();
			System.out.print("Ingrese su contra: ");
			creapass = scan.next();
			System.out.print("Ingrese su nombre: ");
			creanom = scan.next();
			break;

			case 3:
			System.out.print("Deberias jugar :( ...");


		}
	}
}