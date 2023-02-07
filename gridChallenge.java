 public static String gridChallenge(List<String> grid) {
    // Write your code here
    List<String> l = new ArrayList<>();
    char [] arr;
    for(int i=0;i<grid.size();i++){
        arr = grid.get(i).toCharArray();
        Arrays.sort(arr);
        String s = new String(arr);
        l.add(s);
    }
    for(int i=1;i<l.get(0).length();i++){
        for(int j=0;j<l.size()-1;j++){
            if(l.get(j).charAt(i) > l.get(j+1).charAt(i)){
                return "NO";
            }
        }
    }
    return "YES";

    }
