
public class Recursiva {

	int sumatoria(int iNumero) {
		if(iNumero == 0) {
			return 0;
		}
		return iNumero + sumatoria(iNumero-1);
	}
}
