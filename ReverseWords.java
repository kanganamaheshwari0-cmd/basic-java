
public class ReverseWords {
    public static void main(String[] args) {

        String s = "the sky is blue";

        String[] words = s.trim().split("\\s+");//string lo alag alag words me divide krke array me strre krna 

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {

            result = result + words[i];

            if (i > 0) {
                result = result + " ";
            }
        }

        System.out.println(result);
    }
}
