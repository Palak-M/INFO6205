class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> s = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int a = asteroids[i];
            while(s.size()>0 && s.peek()>0 && a<0){
                int b = s.pop();
                if(b == -a){
                    a = 0;
                    break;
                }
                if(b >- a){
                    a = b;
                }
            }
            if(a != 0)
                s.push(a);
        }
        int result[] = new int[s.size()];
        for(int i=s.size()-1;i>=0;i--){
            int a = s.pop();
            result[i] = a;
        }
        return result;
    }
}