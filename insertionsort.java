public class insertionsort {	
	public static void main (String[] arguments) {
        int[] zusortieren = {2,9,11,3,1,6,8,4,5,7};
        int temp = 0;
        
        for(int i=1;i<zusortieren.length;i++){
            for(int j=i;j>0;j--){
                if(zusortieren[j-1]>zusortieren[j]){
                    temp = zusortieren[j];
                    zusortieren[j-1] =zusortieren[j];
                    zusortieren[j] = temp;
                }
                else{
                    j = 0;
                }
            }
        }
        for(int i=0;i<zusortieren.length;i++){
            System.out.print(zusortieren[i] + " ");
        }
	}
}