/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution1;

public class Solution1 {
    static final int Val =9;
    int minDist(int distance[], Boolean shortestPath[]){
        
        int minimum = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for(int mv=0; mv < Val; mv++)
            if(shortestPath[mv] == false && distance[mv] <= minimum){
                minimum=distance[mv];
                minIndex =mv;
            }
        return minIndex;
    }
    
    void display(int distance[]){
        System.out.println("Vertex \t\t Shortest Distance from Source");
        for(int i=0; i<Val;i++)
            System.out.println(i+" \t\t "+distance[i]);
    }
    void shortestPathFun(int graph[][], int source){
        int distance[]= new int[Val];
        Boolean shortestPath[]=new Boolean[Val];
        for(int i=0; i<Val;i++){
            distance[i] =Integer.MAX_VALUE;
            shortestPath[i]= false;
            }
        distance[source] =0;
        for(int j=0; j<Val-1; j++){
            int n=minDist(distance,shortestPath);
            shortestPath[n] = true; 
            for(int mv=0; mv<Val; mv++)
                if(!shortestPath[mv] && graph[n][mv] != 0 && distance[n] != Integer.MAX_VALUE
                        && distance[n] + graph[n][mv] < distance[mv])
                    distance[mv]=distance[n] + graph[n][mv];
        }
        display(distance);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int graph[][]= new int[][]{{0,4,0,0,0,0,0,8,0},
            {4,0,8,0,0,0,0,11,0},{0,8,0,7,0,4,0,0,2},
            {0,0,7,0,9,14,0,0,0},{0,0,0,9,0,10,0,0,0},
            {0,0,4,14,10,0,2,0,0},{0,0,0,0,0,2,0,1,6},
            {8,11,0,0,0,0,1,0,7},{0,0,2,0,0,0,6,7,0}};
        Solution1 ob= new Solution1();
        ob.shortestPathFun(graph, 0);
        }
    }
    

