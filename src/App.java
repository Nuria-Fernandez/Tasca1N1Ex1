
public class App {

	public static void main(String[] args) {
	
		InstrumentoViento nuevoViento = new InstrumentoViento("trompeta", 250);
		nuevoViento.tocar();
		tocarInstrumento(nuevoViento);
		
		InstrumentoCuerda nuevoCuerda = new InstrumentoCuerda("Violín", 460);
		nuevoCuerda.tocar();
		tocarInstrumento(nuevoCuerda);
		
		InstrumentoPercusion nuevoPercu = new InstrumentoPercusion("Caja", 200);
		nuevoPercu.tocar();
		tocarInstrumento(nuevoPercu);
	}
	
	static void tocarInstrumento(Instrumento nuevoInstrumento) {
		nuevoInstrumento.tocar();		
	}

}
