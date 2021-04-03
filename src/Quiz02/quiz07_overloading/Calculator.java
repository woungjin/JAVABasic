package Quiz02.quiz07_overloading;

public class Calculator {

	double result = 0 ;
	double pi = 3.14;
	
	double add(int arg) {
		return result +=arg;
	}
	
	double sub(int arg) {
		return result -=arg;
	}
	
	double multi(int arg) {
		return result *= arg;
	}
	
	double div(int arg) {
		return result /= arg;
	}
	
	double circle(int arg) {
		double r = arg/2.0;
		return r*r*3.14;
	}
	
}
 
