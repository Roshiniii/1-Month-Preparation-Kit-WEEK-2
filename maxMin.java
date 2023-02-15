class Result {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
    int min;
    int n= arr.size();
    Collections.sort(arr);
    min = Integer.MAX_VALUE;
    for(int i=0;i<n-k+1;i++)
    min = Math.min(min, arr.get(i+k-1)-arr.get(i));
    return min;
    }

}
