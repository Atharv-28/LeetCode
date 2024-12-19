public class romanToInt {
    // This function returns the value of a Roman symbol
    public static int getValue(char r) {
        switch (r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1;
    }

    public static int romanToInt(String s) {
        int val1 = 0, val2 = 0, sum = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            val1 = getValue(s.charAt(i));
            if (i + 1 < len) {
                val2 = getValue(s.charAt(i + 1));
                if (val1 >= val2) {
                    sum += val1;
                } else {
                    sum += (val2 - val1);
                    i++; // Skip the next character
                }
            } else {
                sum += val1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "LVIII";
        System.out.println(romanToInt(str));
    }
}