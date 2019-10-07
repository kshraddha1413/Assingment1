
public class GravityCalculatorPart2 {

	public static void main(String[] args) {
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0;
		double fallingTime = 10.0;
		double initialPosition = 0;
		double time=10;
		
		//x(t)=0.5*at^2=vt+x
		
		double x=0.5*(gravity*(fallingTime*fallingTime))+(initialVelocity*fallingTime)+initialPosition;
		
		System.out.println("The object's position after " + fallingTime +
				" seconds is " + x + " m.");
		}

}
