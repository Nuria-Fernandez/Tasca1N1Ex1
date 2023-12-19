
public class InstrumentoPercusion extends Instrumento {
	
	public InstrumentoPercusion(String nombre, int precio) {
		super(nombre, precio);
	}
	
	public void tocar() {
		System.out.println("El instrumento que suena es de percusión");
	}

}
