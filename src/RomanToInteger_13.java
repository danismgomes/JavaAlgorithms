import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public static int romanToInt(String s) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int i = s.length() -  1;
        int j = s.length() -  2;

        char c = s.charAt(i);
        int aInt = map.get(c);

        int solution = map.get(s.charAt(i));

        if (i == 0) {
            return solution;
        }

        while (j >= 0 && solution > map.get(s.charAt(j))){
            solution = solution - map.get(s.charAt(j));
            j--;
        }

        j++;

        if (j == 0){
            return solution;
        }

        return romanToInt(s.substring(0,j)) + solution;
    }
}
