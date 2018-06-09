
public class Test {
	public static void main(String[]args) {
		TableroMagico tablero = new TableroMagico(3);
		
		System.out.println(tablero.getSolucion(12, 22));
		
		imprimir_matriz(tablero.getMatriz());

	}



	public static void imprimir_matriz(int[][] mat) {
		for (int i = 0 ; i < mat.length; i++){

			for (int j = 0 ; j < mat.length; j++)

				System.out.print(" "+mat[i][j]);

			System.out.println("");

		}
	}
}
