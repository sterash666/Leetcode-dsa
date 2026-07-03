class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sHm=new HashMap<>();
        HashMap<Character,Character> tHm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sCh=s.charAt(i);
            char tCh=t.charAt(i);
            if(sHm.containsKey(sCh)){
                if(sHm.get(sCh)!=tCh)return false;

            }
            else sHm.put(sCh,tCh);
            if(tHm.containsKey(tCh)){
                if(tHm.get(tCh)!=sCh)return false;

            }
            else tHm.put(tCh,sCh);


        }
        return true;
            }
}