

public class Vendedor extends Persona {
	private int codigoVendedor;

	//constructor 
	public Vendedor(String nombre, String apellido, int edad, int codigoCliente) {
		super(nombre,apellido,edad);
		this.codigoVendedor = codigoCliente;
	}
	
	public void Mostrar() {
		System.out.println("======================");
		System.out.println("Datos Vendedor");
		System.out.println("Nombre: " +getNombre());
		System.out.println("Apellido: " +getApellido());
		System.out.println("Edad: " +getEdad());
		System.out.println("Cod_Vendedor: " +codigoVendedor);
	}
}