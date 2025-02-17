/**
 * This class represents a complex number <code>z = x + y*i</code>
 */
public class Complex {
	private double mX;
	private double mY;
	public Complex(double x, double y){
		mX = x;
		mY = y;
	}
	/**
	 * Calculate the magnitude of the complex number. For number <code>z = x + y*i</code>, 
	 * <code>|z| = sqrt(x*x + y*y)</code>.
	 * @param x 
	 * @param y
	 * @return the magnitude value.
	 */
	public double getMagnitude() {
		return Math.sqrt(mX*mX + mY*mY);
	}
	public double getX() {
		return mX;
	}
	public double getY() {
		return mY;
	}
	public void setX(double x) {
		mX = x;
	}
	
	public void setY(double y) {
		mY = y;
	}
	
	@Override
	public String toString() {
		return String.format("C{%f,%f}", mX, mY);
	}
}
