import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestObserver {

	@Test
	void quebraPalavras() {
		String frase = "o rato roeu a roupa do rei";
		QuebradorPalavras quebra = new QuebradorPalavras();
		String[] palavras = quebra.quebrar(frase);
		assertEquals(7,palavras.length);
	}

	@Test
	void contadorSimples() {
		String frase = "nao sei o que colocar";
		QuebradorPalavras quebra = new QuebradorPalavras();
		quebra.adicionaContador("SIMPLES",new ContadorSimples());
		quebra.quebrar(frase);
		assertEquals(5,quebra.getContagem("SIMPLES"));
	}
	
	@Test
	void contadorMaiuscula() {
		String frase = "Nao sei O que Colocar";
		QuebradorPalavras quebra = new QuebradorPalavras();
		quebra.adicionaContador("MAIUSCULA",new ContadorMaiuscula());
		quebra.quebrar(frase);
		assertEquals(3,quebra.getContagem("MAIUSCULA"));
	}
	
}
