import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestComposite {

	@Test
	void TrechoComEscala() {
		TrechoAereo t1 = new TrechoAereoSimples("Guarulhos", "Fortaleza", 200, 600);
		TrechoAereo t2 = new TrechoAereoSimples("Fortaleza", "Mossoro", 750, 250);
		TrechoAereo escala = new TrechoAereoComEscala(t1,t2);
		
		assertEquals("Guarulhos",t1.getOrigem());
		assertEquals("Mossoro",t2.getDestino());
		assertEquals(950,escala.getCusto());
		assertEquals(850,escala.getDistancia());
	}
	
	@Test(expected=RuntimeException.class)
	void TrechoComEscalaAeroportosDiferentes() {
		TrechoAereo t1 = new TrechoAereoSimples("Guarulhos", "Fortaleza", 200, 600);
		TrechoAereo t2 = new TrechoAereoSimples("Natal", "Mossoro", 750, 250);
		new TrechoAereoComEscala(t1,t2);
	}
	
	@Test
	void TrechoComConexao() {
		TrechoAereo t1 = new TrechoAereoSimples("Guarulhos", "Fortaleza", 200, 600);
		TrechoAereo t2 = new TrechoAereoSimples("Fortaleza", "Mossoro", 750, 250);
		TrechoAereo conexao = new TrechoAereoComConexao(t1,t2,10);
		
		assertEquals("Guarulhos",conexao.getOrigem());
		assertEquals("Mossoro",conexao.getDestino());
		assertEquals(960,conexao.getCusto());
		assertEquals(850,conexao.getDistancia());
	}
	

	@Test
	void TrechoComEscalaComConexao() {
		TrechoAereo t1 = new TrechoAereoSimples("Guarulhos", "Fortaleza", 200, 600);
		TrechoAereo t2 = new TrechoAereoSimples("Fortaleza", "Mossoro", 750, 250);
		TrechoAereo escala = new TrechoAereoComEscala(t1,t2);
		TrechoAereo t3 = new TrechoAereoSimples("Mossoro", "Natal", 500, 400);
		TrechoAereo conexao = new TrechoAereoComConexao(escala,t3, 10);
		assertEquals("Guarulhos",conexao.getOrigem());
		assertEquals("Mossoro",conexao.getDestino());
		assertEquals(1460,conexao.getCusto());
		assertEquals(1250,conexao.getDistancia());
	}
}
