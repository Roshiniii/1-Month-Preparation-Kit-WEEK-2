    public static String balancedSums(List<Integer> arr) {
    // Write your code here
    
    int size = arr.size();
    int sum=0;
    
    for(int i=0;i<size;i++){
        sum += arr.get(i);
    }
    int cur = 0;
    for(int j=0;j<size;j++){
    if(cur == sum-arr.get(j)-cur){
       return "YES";   
    }
    cur += arr.get(j);
    }
    return "NO";
    }
