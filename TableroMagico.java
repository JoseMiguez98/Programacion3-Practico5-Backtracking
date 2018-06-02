import java.util.ArrayList;
import java.util.List;

public class TableroMagico {
	private int n;
	private int mat[][];

	public TableroMagico(int _n) {
		this.n = _n;
		this.mat = new int[n][n];

		for(int i = 0 ; i<this.n ; i++) {
			for(int j = 0 ; i<this.n; i++) {
				this.mat[i][j] = 0;
			}
		}
	}

	public int[][] getMatriz(){
		return this.mat;
	}
	
	
	
	public boolean getSolucion(Integer _k, Integer _s) {
		if(_s != 0) {
			if(_k > (n*n)) {
				boolean[]usados = new boolean[_k+1];
				return getSolucion(_k, _s, 0, usados);
			}
			System.out.println("El rango de numeros debe se mayor a: "+(n*n));
			return false;
		}
		System.out.println("La solucion no puede ser cero");
		return false;
	}

private boolean getSolucion(Integer _k, Integer _s, int _c, boolean[] _u) {
		if(_c == (n*n)) {
			return this.solucion(_s);
		}
		else {
			for(int i = _c ; i<(n*n) ; i++) {
				for(int v = 0 ; v<=_k ; v++) {
					if(!_u[v]) {
						_u[v] = true;
						this.mat[i/n][i%n] = v;
						if(getSolucion(_k, _s, i+1, _u)) {
							return true;
						}
						_u[v]  = false;
						this.mat[i/n][i%n] = 0;
					}
				}
			}
		}
		return false;
	}
	
	private boolean solucion(Integer _s) {
		Integer suma;
		for(int i = 0 ; i<n ; i++) {
			suma = 0;
			for(int j = 0 ; j<n ; j++) {
				suma += mat[i][j];
			}
			if(suma != _s) {
				return false;
			}
		}
		
		for(int i = 0 ; i<n ; i++) {
			suma = 0;
			for(int j = 0 ; j<n ; j++) {
				suma += mat[j][i];
			}
			if(suma != _s) {
				return false;
			}
		}
		
		return true;
	}
	
//	private boolean solucion(Integer[] _sf, Integer[] _sc, Integer _s) {
//		for(int i = 0; i<n ; i++) {
//			if(_sf[i] != _s || _sc[i] != _s) {
//				return false;
//			}
//		}
//		
//		return true;
//	}
}