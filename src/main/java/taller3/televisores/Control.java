package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	public void turnOn() {
		tv.turnOn();
		
	}
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv= tv;
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public void volumenDown() {
		tv.volumenDown();
	}


}
