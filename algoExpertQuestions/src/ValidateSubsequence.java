import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int icount = 0;

        for(int value : array){
            if(icount == sequence.size()){
                 break;
            }
            if(value == sequence.get(icount)){
                icount ++;
            }
        }
        return icount == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> seq  = List.of(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array,seq));
    }
}
