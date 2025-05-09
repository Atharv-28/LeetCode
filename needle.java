class needle {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; 
        }
        if (haystack.length() < needle.length()) {
            return -1; 
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int count = 0;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    count++;
                } else {
                    break; 
                }
            }
            if (count == needle.length()) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        needle n = new needle();
        int ind = n.strStr("a", "a");
        System.out.println(ind); 
    }
}