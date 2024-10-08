public class Solution {

    public boolean isValid(String str) {
        // Write your code here
         str=str+".";
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c!='.')   sb.append(c);
            else if(sb.length()>0)
            {
                count++;
                int val=Integer.parseInt(sb.toString());
                if(val<0 || val>255) return false;
                if(sb.length()>1 && sb.charAt(0)=='0') return false;
                sb.setLength(0);
            }
            else return false;
        }
        return count==4?true:false;
    }
}
