
public class Generador {

	PrimoUtil primoUtil;

	public Generador(PrimoUtil primoUtil) {
		this.primoUtil = primoUtil;
	}

	public String getNumberValues(int n) {
		int res = 0;
		boolean prime;
		for (int i = 0; i < n; i++) {
			if (i % n == 0) {
				prime = primoUtil.esPrimo(i);
				res++;
			}
		}
		prime = res > 2;
		if (res > 2) {
			res = 0;
		}
		String aux = null;
		if (prime) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0)
					aux = aux + " " + Integer.toString(i);
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (i % 2 != 0)
					aux = aux + " " + Integer.toString(i);
			}

		}
		return aux;
	}
}
