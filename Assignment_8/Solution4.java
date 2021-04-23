/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution4;

/**
 *
 * @author palak
 */
public class Solution4 {
    public int numberOfIslands(char[][] grid){
        int cnt =0;
        for(int i =0; i < grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    cnt++;
                    bfsFun(grid, i, j);
                }
            }
        }
        return cnt;
    }
    
    private void bfsFun(char[][] grid, int i, int j){
        if(i < 0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] =='0'){
            return;
        }
            grid[i][j] = '0';
            bfsFun(grid, i+1, j);
            bfsFun(grid, i-1, j);
            bfsFun(grid, i, j+1);
            bfsFun(grid, i, j-1);
        }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solution4 ob= new Solution4();
        
        char[][] gr_test1={{'1','1','1','1','0'},{'1','1','0','1','0'},
            {'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println("Number of Islands in Grid1: " +ob.numberOfIslands(gr_test1));
        
        char[][] gr_test2={{'1','1','0','0','0'},{'1','1','0','0','0'},
            {'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println("Number of Islands in Grid2: " +ob.numberOfIslands(gr_test2));
    }
    
}
