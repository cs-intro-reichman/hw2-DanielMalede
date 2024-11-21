// Computes an approximation of PI.
// public class CalcPi {
// 	public static void main(String [] args) { 
// 	    // Replace this comment with your code
// 		double rounds = Double.parseDouble(args[0]);
// 		double sum = 1;
// 		double divided = 1/3;
// 		for (int i = 0; i < rounds; i++) {
// 			if (i % 2==0) {

// 				sum -= (divided +=0.2);
// 				System.out.println(divided);

// 			}
// 			else{
// 				sum += (divided +=0.2);
// 				System.out.println(divided);
// 			}
// 		}
// 		System.out.println(sum);
// 		// System.out.println(divided);
// 	}
// }
public class CalcPi {
	public static void main(String[] args) {
		// Replace this comment with your code
		double rounds = Double.parseDouble(args[0]) - 1;
		double sum = 1;
		double num = 3;
		double increase = 2;
		for (int i = 0; i < rounds; i++) {
			double divided = 1 / num;
			if (i % 2 == 0) {
				sum -= divided;
				divided = 1.0 / (num += increase);
			} else {
				sum += divided;
				divided = 1.0 / (num += increase);
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:      " + (sum * 4));
		// System.out.println(divided);
	}
}

// public class CalcPi {
// public static void main(String[] args) {
// int num = Integer.parseInt(args[0]);
// double pi = 0.0;
// for (int i = 0; i < num; i++) {
// double sum = (1.0 / ((2 * i) + 1.0));
// if ((i % 2) == 0) {
// pi += sum;
// }
// else{
// pi -= sum;
// }

// }

// pi *= 4;
// System.out.println(pi);
// }
// }