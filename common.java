public class common {
    public static String longestCommonPrefix(String[] strs) {
        String common = "";
        for (int i = 0; i < strs[0].length(); i++) {
            // System.out.println(strs[0]);
             /*  if(strs[0].charAt(i) == strs[1].charAt(i) == strs[2].charAt(i))
              {
              common += strs[0].charAt(i);
              }*/
              char c = strs[0].charAt(i);
              for (int j = 1; j < strs.length; j++) {
              if (i >= strs[j].length() || strs[j].charAt(i) != c) {
              return common;
              }
              }
              common += c;
            // if (strs[0] == "flower") {
            //     common = "fl";
            // }
        }
        return common;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String op = longestCommonPrefix(strs);
        System.out.println(op);
    }
}
