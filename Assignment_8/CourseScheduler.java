/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author palak
 */
public class CourseScheduler {
    
public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) 
            return true;
        
        List<List<Integer>> noOfCourses = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            noOfCourses.add(new ArrayList<>());
        }
        
        for (int[] p : prerequisites) {
        noOfCourses.get(p[1]).add(p[0]);
        }
        
        int[] visited = new int[numCourses];
             
        for(int i = 0; i < numCourses; i++) {
            if(!dfs(noOfCourses, visited, i)) return false;
        }
        
        return true;
    }
    
    public boolean dfs(List<List<Integer>> courses, int[] visited, int course) {
        visited[course] = 1;         
        List<Integer> eligibleCourses = courses.get(course);
        
        for(int i = 0; i < eligibleCourses.size(); i++) {
            int eligibleCourse = eligibleCourses.get(i);
            
            if(visited[eligibleCourse] == 1) return false;
            
            if(visited[eligibleCourse] == 0) {
                if(!dfs(courses, visited, eligibleCourse)) return false;
            }
        }
        
        visited[course] = 2;
        return true;
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        CourseScheduler ob= new CourseScheduler();
        int courses = 2;
        int[][] test_prereq1= {{1,0}};
        boolean cF1 = ob.canFinish(courses, test_prereq1);
        System.out.println("Check if can finish?: " +cF1);
        
        int[][] test_prereq2= {{1,0},{0,1}};
        boolean cF2 = ob.canFinish(courses, test_prereq2);
        System.out.println("Check if can finish?: " +cF2);
    }
    
}
