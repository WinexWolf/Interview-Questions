class Solution {
    public String convert(String s, int numRows) {
        String[] arr = new String[numRows];
        String ans = "";

        if(numRows==1){
            return s;
        }
        for(int i = 0; i < numRows; i++){
            arr[i] = "";
        }

        int c = 0;
        int d = 0;
        for(int i = 0; i < s.length(); i++){
            if(c == numRows - 1) {
                d = 1;
            }
            if(c == 0) {
                d = 0;
            }
            arr[c] += s.charAt(i);
            if (d == 0) {
                c += 1;
                } else {
                c -= 1;
                }
        }

        for(int i = 0; i < numRows; i++){
            ans += arr[i];
        }
        return ans;
    }
}
