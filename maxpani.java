import java.util.*;
public class maxpani{
    public static int storewater(ArrayList<Integer> waterlvl){
        int maxwater=0;
        for(int i=0;i<waterlvl.size();i++){
            for(int j=i+1;j<waterlvl.size();j++){
                int height=Math.min(waterlvl.get(i), waterlvl.get(j));
                int width=j-i;
                int currwater=height*width;
                maxwater=Math.max(maxwater, currwater);
            }
        }
        return maxwater;
    }
    public static int storpani(ArrayList<Integer> waterlvl){
        int maxwater=0;
        int lp=0;
        int rp=waterlvl.size()-1;
        while(lp<rp){
            int height=Math.min(waterlvl.get(rp), waterlvl.get(lp));
            int width=rp-lp;
            int currwater=height*width;
            maxwater=Math.max(maxwater, currwater);
            if(waterlvl.get(lp)>waterlvl.get(rp)){
                rp--;
            }
            else{
                lp++;
            }
        }
        return maxwater;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> waterlvl=new ArrayList<>();
        waterlvl.add(1);
        waterlvl.add(8);
        waterlvl.add(6);
        waterlvl.add(2);
        waterlvl.add(5);
        waterlvl.add(4);
        waterlvl.add(8);
        waterlvl.add(3);
        waterlvl.add(7);
        System.out.println("max quantity of water="+storpani(waterlvl));
    }
       
}