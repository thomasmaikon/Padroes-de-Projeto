import java.util.HashMap;
import java.util.Map;

public class QuebradorPalavras {

	private Map<String,ContadorPalavras> contadores = new HashMap<>();
	
	/** os observadores 'ContadorPalavras' estao 
	 * sendo notificados de que uma frase foi quebrada,
	 * seu respectivo observador é quem faz sua respectiva operação 
	 * e
	 * evita que a classe 'Quebrador' fique fazendo verificações 
	 */ 
	
	public String[] quebrar(String frase) {
		// TODO Auto-generated method stub
		String[] palavras = frase.split(" ");
		
		for (String palavra: palavras) {
			for(ContadorPalavras c: contadores.values()) {
				c.contar(palavra);
			}
		}
		return palavras;
	}

	public void adicionaContador(String nome, ContadorPalavras contador) {
		contadores.put(nome, contador);
	}
	
	public int getContagem(String nome) {
		return contadores.get(nome).contagem();
	}

}
