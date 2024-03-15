import java.util.HashMap;

public class SortingSentence {
    public String sortSentence(String s) {
        String[] input = s.split(" ");
        HashMap<Integer, String> temp = new HashMap<>();

        for(int i=0; i<input.length; i++){
            String a = input[i].substring(0,input[i].length()-1);
            int index = Character.getNumericValue(input[i].charAt(input[i].length()-1));
            temp.put(index, a);
        }

        String out = "";

        for(int i=1; i<=input.length; i++){
            out += temp.get(i);
        }
        return out;
    }
}
