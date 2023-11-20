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
            for(int i=0;i<travel.length;i++){
                if(i<m) min+=travel[i];
                if(i<g) min+=travel[i];
                if(i<p) min+=travel[i];
                
            }
            return min;
    }
}