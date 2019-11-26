import java.util.HashMap;
import java.util.Map;

public class ValidParentheses_20 {
    public static boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (i == 0) {
                    return false;
                }

                if (map.get(s.charAt(i)) == s.charAt(i-1)){
                    if (s.length() == 2){
                        return  true;
                    } else {
                        return isValid(s.substring(0,i-1)+s.substring(i+1));
                    }
                }
            }
        }

        return false;
    }
}
