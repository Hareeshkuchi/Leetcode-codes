class Solution {
    
    
        
        
    
    public int garbageCollection(String[] garbage, int[] travel) {
        int m=-1,g=-1,p=-1;
        int min=0;
        for(int i=0;i<garbage.length;i++){
            if(garbage[i].contains("M")) m=i;
            if(garbage[i].contains("P")) p=i;
            if(garbage[i].contains("G")) g=i;
            min+=garbage[i].length();
        }
        for(int i=0;i<m;i++) min+=travel[i];
            for(int i=0;i<g;i++) min+=travel[i];
            for(int i=0;i<p;i++) min+=travel[i];
            return min;
    }
}