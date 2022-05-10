public class Solution_Reorganise {

    int numChar=26;
    public String reorganizeString(String s) {
        int num=s.length();
        int[] count=new int[numChar];

        for(int i=0;i<num;i++)
            count[s.charAt(i)-'a']++;

        PriorityQueue<Pair1> pq=new PriorityQueue<>(new PairComparator());
        for(char ch='a';ch<='z';ch++){
            int data=ch-'a';
            if(count[data]>0)
                pq.add(new Pair1(count[data],ch));
        }
        s="";
        Pair1 previous=new Pair1(-1,'#');
        while(pq.size()!=0){
            Pair1 p=pq.peek();
            pq.poll();
            s=s+p.c;
            if(previous.val>0)
                pq.add(previous);
            (p.val)--;
            previous=p;
        }
        if(num != s.length()) {
            return "";
        }
        return s;
    }
}
class PairComparator implements Comparator<Pair1> {
    public int compare(Pair1 p1, Pair1 p2){
        if(p1.val < p2.val)
            return 1;
        else if(p1.val>p2.val)
            return -1;
        return 0;
    }
}

class Pair1 {
    int val;
    char c;
    Pair1(int val,char c){
        this.val=val;
        this.c=c;
    }
}

