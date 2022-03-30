package taller3.televisores;

public class TV {
	//Los atributos: marca (Marca), canal(int), precio(int), estado(boolean), volumen(int) y
		//control (Control).
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1 ;
	Control control;
     public static  int  numTV;
	
	
	
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
	}
	public void  setMarca(Marca marca){
		this.marca =marca;
	}
	public void setControl(Control control) {
		this.control=control;
		
	}
	public void setPrecio(int precio) {
		this.precio=precio;		
	}
	public void setVolumen(int volumen)
	{if (estado== true && volumen<=7 && volumen>=0)
		
		
		this.volumen=volumen;
		
	}
	public void setCanal(int canal) {
		if(estado = true && canal <= 119 && canal > 1)
			this.canal=canal;
	}
	 public static void setNumTV( int numero) {
		numTV=numero;
		
	}
	
	
	public Marca getMarca(){
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio()
	{
		return precio;
		
	}
	public int getVolumen() {
		return volumen;
		
	}
	public int getCanal() {
		return canal;
		
	}
	public static int getNumTV() {
		return numTV;
		
	}
	public void turnOn() {
		estado=true;
		
	}
	public void turnOff() {
		estado=false;
		
	}
	public boolean getEstado() {
		return estado;	
	}
	public void canalUp() {
		if (canal < 120)
			canal++;
	}
	public void canalDown() {
		if(estado==true && canal>1)
		canal--;
	}
	public void volumenUp() {
		if(estado==true && volumen <=6)
		volumen++;
		}
	public void volumenDown(){ 
		if (estado==true && volumen>=1)
			
		volumen--;}
	
		
	
		
	
	
	
	
}
