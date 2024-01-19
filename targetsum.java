import java.util.*;

public class targetsum{
    //brute force approach
    public static boolean targetpair(ArrayList<Integer> nos,int target){
        for(int i=0;i<nos.size();i++){
            for(int j=i+1;j<nos.size();j++){
                if(nos.get(i)+nos.get(j)==target){
                    System.out.println(nos.get(i)+","+nos.get(j));
                    return true;
                }
            }
        }
        return false;
    }
    //2pointer approach..my work
    public static boolean targetjodi(ArrayList<Integer> nos,int target){
        int i=0;
        int j=nos.size()-1;
        while(j>i){
            if(nos.get(i)+nos.get(j)==target){
                System.out.println(nos.get(i)+","+nos.get(j));
                return true;
            }
            if(nos.get(j)>=target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static boolean targetcouple(ArrayList<Integer> nos,int target){
        int lp=0;
        int rp=nos.size()-1;
        while(rp>lp){
            if(nos.get(lp)+nos.get(rp)==target){
                System.out.println(nos.get(lp)+","+nos.get(rp));
                return true;
            }
            if(nos.get(lp)+nos.get(rp)<target){
                lp++;
            }
            if(nos.get(lp)+nos.get(rp)>target){
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> nos=new ArrayList<>();
        nos.add(1);
        nos.add(2);
        nos.add(3);
        nos.add(4);
        nos.add(5);
        nos.add(6);
        int target=11;
        System.out.println(targetcouple(nos, target));

    }
}