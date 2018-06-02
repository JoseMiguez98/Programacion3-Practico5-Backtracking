
public class Test {
	public static void main(String[]args) {
		TableroMagico tablero = new TableroMagico(4);
		
		System.out.println(tablero.getSolucion(12, 15));
		
		imprimir_matriz(tablero.getMatriz());

	}



	public static void imprimir_matriz(int[][] mat) {
		for (int i = 0 ; i < 3; i++){

			for (int j = 0 ; j < 3; j++)

				System.out.print(" "+mat[i][j]);

			System.out.println("");

		}
	}
}
