
public abstract class Instrumento {
	
	{
		System.out.println("Bloque de inicialización");
	}
	
	protected String nombre;
	protected int precio;
	
	public Instrumento(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	

	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "El instrumento se llama " + nombre +
				" y cuesta " + precio + " euros.";
	}
	
	public abstract void tocar();
	
	

}
