package empleados;

public class Vendedor extends Empleados implements ILista{

	private String inicioEmpresa;

	
	public Vendedor() {
		super();
	}



	public Vendedor(String nombre, String apellido, int edad, int salario,
			String inicioEmpresa) {
		super(nombre, apellido, edad, salario);
		this.inicioEmpresa = inicioEmpresa;
	}



	public String getInicioEmpresa() {
		return inicioEmpresa;
	}



	public void setInicioEmpresa(String inicioEmpresa) {
		this.inicioEmpresa = inicioEmpresa;
	}


	
	
	

	@Override
	public String toString() {
		
		salario=calcularSueldoTotal();
		
		return "Vendedor Inicio en Empresa = " + inicioEmpresa + ", Nombre = " 
				+ nombre + ", Apellido= " + apellido + ", Edad= "
				+ edad + ", Salario con Bono= " + salario ;
	}



	@Override
	public  int calcularSueldoTotal() {
		int totalSalario= 50000 ;
		totalSalario  = ( totalSalario + super.calcularSueldoTotal());
	return totalSalario;
	}

	


}