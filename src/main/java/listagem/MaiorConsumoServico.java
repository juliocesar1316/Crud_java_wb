package listagem;

import java.util.Comparator;

import com.wb.modelo.Servico;



public class MaiorConsumoServico implements Comparator<Servico>{
	@Override
	public int compare(Servico p1, Servico p2) {
		if(p1.getQuantidade() > p2.getQuantidade()) {
			return 1;
		}else if (p1.getQuantidade() < p2.getQuantidade()) {
			return -1;
		}else {
			return 0;
		}
	}
}
