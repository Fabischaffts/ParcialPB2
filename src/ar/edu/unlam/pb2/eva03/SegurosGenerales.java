package ar.edu.unlam.pb2.eva03;

abstract public class SegurosGenerales {
	
	private Integer numeroDePoliza;
	private Persona asegurado;
	private Double premio;
	private Double sUMA_ASEGURADA;
	private Auto auto;
	
	
	public SegurosGenerales(Integer numeroDePoliza, Persona asegurado,Double sUMA_ASEGURADA, Double premio) {
		
		this.numeroDePoliza = numeroDePoliza;
		this.asegurado = asegurado;
		this.premio = premio;
		this.sUMA_ASEGURADA = sUMA_ASEGURADA;
		
	}
	
	protected abstract void agregarBienAsegurado(Auto auto);
	protected abstract void agregarBienAsegurado(typOf Auto);


	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}


	public void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}

	public Double getPremio() {
		return premio;
	}


	public void setPremio(Double premio) {
		this.premio = premio;
	}


	public Persona getAsegurado() {
		return asegurado;
	}


	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}


	public Double getsUMA_ASEGURADA() {
		return sUMA_ASEGURADA;
	}


	public void setsUMA_ASEGURADA(Double sUMA_ASEGURADA) {
		this.sUMA_ASEGURADA = sUMA_ASEGURADA;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}


}



