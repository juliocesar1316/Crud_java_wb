package listagem;

import java.util.Comparator;

import com.wb.modelo.Produto;

public class MaiorConsumoProduto implements Comparator<Produto>{
	@Override
	public int compare(Produto p1, Produto p2) {
		if(p1.getQuantidade() > p2.getQuantidade()) {
			return 1;
		}else if (p1.getQuantidade() < p2.getQuantidade()) {
			return -1;
		}else {
			return 0;
		}
	}
}
