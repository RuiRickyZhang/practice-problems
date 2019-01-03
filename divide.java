package Leetcode;

public class divide {
    public int calculate_divide(String S){
        int ans = 0;
        int remain = 0;
        for(int i = 0; i < S.length(); i++){
            remain = remain*2 + S.charAt(i)-'0';
        }

        while(remain > 0){
            if(remain%2 == 0){
                remain = remain/2;
            }

            else {
                remain = remain - 1;
            }
            ans++;

        }

        return ans;
    }

    public static void main(String[] arg){
        String S = "0010";
        divide res = new divide();
        int want = res.calculate_divide(S);
        System.out.println(want);
    }
}
