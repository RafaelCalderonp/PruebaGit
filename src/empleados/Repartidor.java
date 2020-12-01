package empleados;

public class Repartidor extends Empleados implements ILista{

	private String disponibilidad;



	public Repartidor() {
		super();
	}

	public Repartidor(String nombre, String apellido, int edad,
			int salario, String disponibilidad) {
		super(nombre, apellido, edad, salario);
		this.disponibilidad = disponibilidad;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}


	@Override
	public String toString() {
		
		salario=calcularSueltoTotal();
		
		return "Repartidor disponibilidad= " + disponibilidad + ", Nombre= " 
				+ nombre + ", Apellido= " + apellido + ", Edad= " + edad 
				+ ", salario con Bono= " + salario;
	}

	public int calcularSueltoTotal() {
		int totalSalario= 0;
		
		if (edad < 30) 
			totalSalario = 15000 + super.calcularSueldoTotal();
		else 
			totalSalario = super.calcularSueldoTotal();
		
		return totalSalario;


	}
}
