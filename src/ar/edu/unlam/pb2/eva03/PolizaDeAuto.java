package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends SegurosGenerales {
	
	private Auto auto;

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sUMA_ASEGURADA, Double premio) {
		super(numeroDePoliza, asegurado, sUMA_ASEGURADA, premio);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void agregarBienAsegurado(Auto auto) {
		
		
	}

	@Override
	protected void agregarBienAsegurado(typOf Auto) {
		
		
	}



}
