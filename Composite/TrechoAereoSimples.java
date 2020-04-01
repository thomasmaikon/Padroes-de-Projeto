
public class TrechoAereoSimples implements TrechoAereo {
	private String origem;
	private String destino;
	private int custo;
	private int distancia;
	
	
	public TrechoAereoSimples(String origem, String destino, int custo, int distancia) {
		this.origem=origem;
		this.destino=destino;
		this.custo=custo;
		this.distancia=distancia;
	}
	
	
	@Override
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	@Override
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	@Override
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	@Override
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
}
