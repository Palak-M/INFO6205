class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> result = new ArrayList<>();
        if(n <= 0)
            return result;
        generateParenthesis(n, n, "", result);
        return result;
    }
    
    private void generateParenthesis(int open, int close, String current, List<String> result){
        if(open == 0){
            while(close-- != 0){
                current += ")";
            }
            result.add(current);
            return;
        }
        if(open == close){
            current += "(";
            generateParenthesis(open - 1, close, new String(current), result);
        }else{
            String openCurrent = current +"(";
            generateParenthesis(open - 1, close, openCurrent, result);
            String closeCurrent = current +")";
            generateParenthesis(open, close-1, closeCurrent, result);
    }
  }
}