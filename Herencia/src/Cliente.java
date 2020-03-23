
public class Cliente extends Persona {
	private int NumeroCliente;

	//constructor 
	public Cliente(String nombre, String apellido, int edad, int codigoCliente) {
		super(nombre,apellido,edad);
		this.NumeroCliente = codigoCliente;
	}
	
	public void Mostrar() {
		System.out.println("Datos Cliente");
		System.out.println("Nombre: " +getNombre());
		System.out.println("Apellido: " +getApellido());
		System.out.println("Edad: " +getEdad());
		System.out.println("Cod_Cliente: " +NumeroCliente);
	}
}