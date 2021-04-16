class Solution {
    public String reverseWords(String s) {
        if(s == " ")
            return "";
        String[] st=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i =st.length-1;i>=0;i--){
            if(st[i].length() != 0){
                sb.append(st[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}