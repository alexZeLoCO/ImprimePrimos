
public class ImprimeNumerosPrimosDe1A1000 {

	public static void main(String[] args) {
		
		for (int j=1;j<=1000;j++) {		//PARA TODOS LOS NÚMEROS (J) ENTRE 1 Y 1000
			int i = 2;		//I = 2
			while (i<=j/2 && j%i!=0) {		//MIENTRAS LA I SEA MENOR O IGUAL A LA MITAD DE J
				i++;		//SUMAR UNO A LA I
			}
			
			if (i>j/2) {		//SI LA I LLEGÓ AL FINAL DE LA SECUENCIA (LA MITAD DE J)
				System.out.printf("El número %d es primo.\n",j);		//ES PRIMO
			}  
		}
	}

}
