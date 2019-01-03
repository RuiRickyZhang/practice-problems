public class Solution{
	public int lightbulb(int[] bulb){
		int len = bulb.length;
		int[] check = new int[len];
		for(int i = 0; i < len; i++){
			check[bulb[i]-1] = 1;
			if((bulb[i]-2>= 0) && ((check[bulb[i]-2] == 1)){
				return i;
			}
		}

		return -1;
	}

    public static void main(String[] arg){
        int[] test = [2,1,3,5,4];
        Solution res = new Solution();
        int want = res.lightbulb(test);
        System.out.println(want);
    }
}