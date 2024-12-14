public static int camelcase(String s) {
    // Write your code here
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (Character.isUpperCase(c)) {
            count++;
        }
    }
    return count + 1;
}