
public class TrechoAereoComEscala implements TrechoAereo {

	private TrechoAereo inicio;
	private TrechoAereo fim;
	
	public TrechoAereoComEscala(TrechoAereo t1, TrechoAereo t2) {
		// TODO Auto-generated constructor stub
		if (!t1.getDestino().equals(t2.getOrigem()))
			throw new RuntimeException();
		
		this.inicio = t1;
		this.fim = t2;
	}

	@Override
	public String getOrigem() {
		// TODO Auto-generated method stub
		return inicio.getOrigem();
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return fim.getDestino();
	}

	@Override
	public int getDistancia() {
		// TODO Auto-generated method stub
		return inicio.getDistancia() + fim.getDistancia();
	}

	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return inicio.getCusto()+fim.getCusto();
	}

}
