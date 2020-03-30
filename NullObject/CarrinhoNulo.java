import java.util.ArrayList;

public class CarrinhoNulo implements Carrinho{

	@Override
	public ArrayList<Produto> ListaDeProdutos() {
		// TODO Auto-generated method stub
		return new ArrayList<Produto>();
	}

	public int getQtdElementos() {
		return 0;
	}
}
