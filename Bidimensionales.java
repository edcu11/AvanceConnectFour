import java.util.Scanner;

public class Bidimensionales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		TipoDeDato id[][] =  new TipoDeDato[cfilas][ccolumnas];
		*/
		String tablero[][] = new String[4][3];

		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("tablero[%d][%d]: ", f, c);
				tablero[f][c] = scan.next();
			}
		}

		//truquito con el foreach
		for (String fila[] : tablero) {
			for (String casilla : fila) {
				System.out.print(casilla + "\t\t");
			}
			System.out.println();
		}	

	}
}