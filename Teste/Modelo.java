public class Modelo {
		public static void main(String[] args) {
			
			long i = 1, j = 0, aux, z;

			for(z = 1; z < 100; z++) {
				aux = i + j;
				i = j;
				j = aux;
				if (j  > 0 && j <100) {
					System.out.println (j);
				}
			}
		}
	}

