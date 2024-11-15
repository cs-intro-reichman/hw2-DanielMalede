// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Replace this comment with your code
                String str = args[0].toUpperCase();
                int roundsPrints = Integer.parseInt(args[1]);
                char[] checkChars = { 'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X' };
                for (int i = 0; i < str.length(); i++) {
                        Boolean bool = true;

                        for (int j = 0; j < checkChars.length; j++) {

                                if (str.indexOf(checkChars[j], i) == i) {
                                        System.out.println(
                                                        "Give me an " + str.charAt(i) + ": " + str.charAt(i) + "!");
                                        bool = false;
                                }
                        }
                        if (bool == true) {
                                System.out.println("Give me a  " + str.charAt(i) + ": " + str.charAt(i) + "!");
                        }
                }
                System.out.println("What does that spell?");
                for (int i = 0; i < roundsPrints; i++) {
                        System.out.println(str +"!!!");
                }
        }
}
