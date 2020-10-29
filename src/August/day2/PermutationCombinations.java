package August.day2;
public class PermutationCombinations {
    public static void main(String[] args) {
      stringPermutation("fan");
    }
    static public void stringPermutation(String input){
        permutation("", input);

    }
    private static void permutation (String permutation, String input){
        if (input.length()==0){
            System.out.println(permutation);
        } else {
            for (int i = 0; i < input.length(); i++) {
                permutation(permutation+input.charAt(i),
                        input.substring(0,i) +input.substring(i+1,input.length()));

            }
        }
    }


}
