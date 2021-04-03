package Quiz02.quiz07_overloading;

public class Computer extends Calculator {

	double circle(int arg) {
		double r = arg / 2.0;
		return r * r * Math.PI;
	}

	double rect(double n1) {
		return (n1 * n1);
	}

	double rect(double n1, double n2) {
		return (n1 * n2);
	}
	
	double rect(double n1, double n2, double n3) {
		return (n1*n2)*2 + (n1 * n3)*2 + (n2 * n3)*2 ;
	}

}
 
