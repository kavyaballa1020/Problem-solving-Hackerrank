class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        int n=a.size();
        List<Integer> b=new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--){
            b.add(a.get(i));
        }
        return b;
    }

}