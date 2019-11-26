public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {

        if(strs.length==0)return "";

        String solution = "";

        for (int i = 0; i < strs[0].length(); i++) {

            String s = strs[0].substring(i,i+1);

            for(int j = 1; j<strs.length; j++){

                if(strs[j].length()==i)return solution;

                String s2 = strs[j].substring(i,i+1);

                if(!s.equals(s2))return solution;
            }

            solution+=s;

        }

        return solution;
    }
}
