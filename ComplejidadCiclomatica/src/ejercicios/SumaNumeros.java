package ejercicios;

public class SumaNumeros {

	int num;

	public SumaNumeros(int num) {
		this.num = num;
	}
	
	public int sumaNumeros(int num) {
		int suma = 0;
		for (int i = 0; i <=num; i++) {
			if(i%2==1) {
				suma ++;
			}
		}
		return suma;
	}
}
