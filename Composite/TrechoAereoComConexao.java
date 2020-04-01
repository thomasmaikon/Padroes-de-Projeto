
public class TrechoAereoComConexao extends TrechoAereoComEscala {

	private int tarifa;
	
	public TrechoAereoComConexao(TrechoAereo t1, TrechoAereo t2,int tarifa) {
		super(t1, t2);
		this.tarifa = tarifa;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return super.getCusto()+tarifa;
	}
	
	

}
