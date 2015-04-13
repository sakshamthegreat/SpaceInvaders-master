
public abstract class Sprite {
	protected Location loc = new Location(5,5);
	protected int speed;
	public Location getLoc(){
		return loc;
	}
	public void move(){	}
	
	public void setSpeed(int x){
		speed = x;
	}

}
