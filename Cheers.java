// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Replace this comment with your code
                String str = args[0];
                char[] checkChars = { 'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X' };
                for (int i = 0; i < str.length(); i++) {
                        Boolean bool= true;

                        for (int j = 0; j < checkChars.length; j++) {
                                if (str.indexOf(checkChars[j], i) == i) {
                                        System.out.println(
                                                        "Give me an " + str.charAt(i) + ": " + str.charAt(i) + "!");
                                                        bool = false;
                                                }
                        }
                        if (bool != false) {
                                System.out.println("Give me a " + str.charAt(i) + ": " + str.charAt(i) + "!");
                        }



                }
        }
}
