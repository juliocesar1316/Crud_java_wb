package listagem;

import java.util.Comparator;

import com.wb.modelo.Cliente;

public class MaiorValorProduto implements Comparator<Cliente> {
	@Override
	public int compare (Cliente o1, Cliente o2) {
		if(o1.valorConsumoProduto() > o2.valorConsumoProduto()) {
			return 1;
		}else if (o1.valorConsumoProduto() < o2.valorConsumoProduto()) {
			return -1;
		}else {
			return 0;
		}
	}
};
