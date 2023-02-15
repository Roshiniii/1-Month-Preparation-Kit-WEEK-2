class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
    // Write your code here
    int temp = findSum(n)*k;
    
    if(temp > 9){
        temp = findSum(String.valueOf(temp));
    }
    return temp;
    }
    
    static int findSum(String num){
        if(num.length() == 1){
            return Integer.parseInt(num);
        }
        
        int s = 0;
        for(int i=0;i<num.length();i++){
            s += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        return findSum(String.valueOf(s));
    }

}
