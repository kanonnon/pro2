public class MyPointNew {
	private int x;
	private int y;

	void setPoint(int xpos, int ypos) {
		x = xpos;
		y = ypos;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	double getDistanceFrom(MyPointNew q) {
		return Math.sqrt((x - q.x) * (x - q.x) + (y - q.y) + (y - q.y));
	}
}
