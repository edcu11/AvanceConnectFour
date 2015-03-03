import java.util.Scanner;

public class ConnectFour {
	public static void main(String[] args) {
		System.out.println("BIENVENIDO " + System.getProperty("user.name")+"\n");
		Scanner scan = new Scanner(System.in);

		String deli = System.getProperty("line.separator");
		scan.useDelimiter(deli);

		int opcinic, opcmenuprin, pts = 0;
		String[] user, pass, creauser, creanom, creapass;


		System.out.println("++++++++++++++>>Bienvenido a ConnectFour<<++++++++++++++\n");
		System.out.println("Seleccione el numero de la opcion que quiere");
		System.out.println("1. Login\n2. Registrarse\n3. Salir");
		opcinic = scan.nextInt();

		switch (opcinic) {
			case 1:
			System.out.println("\nLOGIN");
			String[] opcsLog = {"Ingrese su usuario", "Ingrese su contra"};

			//System.out.print("Ingrese su usuario: ");
			//user = new String[scan.next()];
			//System.out.print("Ingrese su contra: ");
			//pass = new String[scan.next()];

				if (opcsLog[1].equals("Hond")) {
					System.out.println("1. Jugar\n2. Ranking\n3. Mi Perfil\n4. Cerrar Sesion");
					opcmenuprin = scan.nextInt();
					switch (opcmenuprin) {
						case 1:
							System.out.print("Aqui va el tablero... lol... Esperando a Edgar...\n.......................... lol");
						break;
							
						case 2:
							System.out.printf("%s%10s%18s%15s", "Pos.", "Nombre", " Username", "Puntos\n");
							System.out.printf("%s%18s%17s%6s", "1", "Alejandro V", "Avalladaresm", "9\n");
							System.out.printf("%s%15s%18s%8s", "2", "Derick A", "Derickarzu", "9\n");
							System.out.printf("%s%14s%15s%12s", "3", "Edgar C", "Edcu11", "9\n");
						break;
							
						case 3: 
							System.out.print("Mi perfil...... despues lo agrego.........");
						break;
							
						case 4:
							System.out.println("Seleccione el numero de la opcion que quiere");
							System.out.println("1. Login\n2. Registrarse\n3. Salir");
							opcinic = scan.nextInt();
						break;
					}

				} else {
					do {
						System.out.println("Ingrese la contra correcta: ");
						//pass = scan.next();
					} while (!opcsLog[1].equals("Honduras"));
				}


				break;

			case 2:
			System.out.println("\nREGISTRARSE");
			String[] opcsReg = {"Ingrese su nombre completo: ", "Cree su usuario: ", "Cree su contra: "};
			break;

			case 3:
			System.out.print("Deberias jugar :( ...");


		}
	}
}