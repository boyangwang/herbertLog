package boyang.PS3.Qn2;

public class DocumentDistanceMain 
{

	public static void main(String[] args) {
		VectorTextFile3 A = null;
		VectorTextFile3 B = null;
		try {
			A = new VectorTextFile3("hamlet.txt");
			B = new VectorTextFile3("metamorphosis.txt");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		double theta = VectorTextFile3.Angle(A,B);

		System.out.println("The angle between A and B is: " + theta + "\n");
	}
}
