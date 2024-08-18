// Product array puzzle
// 

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long product=1;
        long[] product_Array=new long[nums.length];
        int zeroes=0;
        int i=0;
        int j=0;
        
        //calculate zeroes and product
        while(zeroes<2 && j<nums.length) {
            if(nums[j] ==0 ) {
                zeroes++;
                i=j;
                
            } else { product= product*nums[j];}
            
            j++;
        }
        
        //case-I: more than 1 zeroes
        if (zeroes==2) { Arrays.fill(product_Array, 0);}
        
        //case-II: exactly 1 zero
        else if(zeroes==1) {
            
            Arrays.fill(product_Array, 0);
            product_Array[i]=product;
            
        } else {   //case-III: no zero present
            for(int k=0; k< nums.length; k++) {
                product_Array[k]=(product/nums[k]);
            }
        }
        
        return product_Array;
    }
}