
public class Main {

	public static void main(String[] args) {
		
		int n = 10000000;
		
		double a = 0; // lo que mide la parsela de a hasta b
		double b = 10;
		double deltaX = (b-a)/n;
		double xi = a; // la x del proxima pedazo que voy a sumar.
		double sum = 0;
		
		for(int i=0; i < n; i++ ){
			double	averageHeight = ((xi*xi)+ (xi+deltaX)*(xi + deltaX))/2.0;// estamos modelando la playa como una parabola.
			double nextArea = deltaX*averageHeight;
			sum+=nextArea;
			xi+=deltaX;
			
		}
		System.out.println("Total area =" + sum);
	}
}
