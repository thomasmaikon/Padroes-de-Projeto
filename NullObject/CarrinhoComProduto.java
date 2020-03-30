import java.util.ArrayList;

public class CarrinhoComProduto {
	private ArrayList<Produto> elementos = new ArrayList<Produto>();
	private int qtdElementos;
	
	public int getQtdElementos() {
		return qtdElementos;
	}
	
	public ArrayList<Produto> ListaDeProdutos(){
		return elementos;
	}
	
	public void adicionarProduto(Produto p) {
		elementos.add(p);
	}
}
