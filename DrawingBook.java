    public static int pageCount(int n, int p) {
    // Write your code here
    int Flip_from_start = p/2;
    int Flip_from_end = (n/2) - (p/2);
    
    return Math.min(Flip_from_start,Flip_from_end);
    }
