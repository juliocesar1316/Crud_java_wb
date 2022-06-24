package listagem;

import java.util.Comparator;

import com.wb.modelo.Cliente;

public class MaiorValorServico implements Comparator<Cliente> {
	@Override
	public int compare (Cliente o1, Cliente o2) {
		if(o1.valorConsumoServico() > o2.valorConsumoServico()) {
			return 1;
		}else if (o1.valorConsumoServico() < o2.valorConsumoServico()) {
			return -1;
		}else {
			return 0;
		}
	}
};