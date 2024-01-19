public class shortestdistance{
public static float shortestpath(String path){
    int m=0,n=0;
    for(int i=0;i<path.length();i++){
        if(path.charAt(i)=='W'){
            m--;
        }else if(path.charAt(i)=='E'){
            m++;
        }
        else if(path.charAt(i)=='N'){
            n++;
        }
        else if(path.charAt(i)=='S'){
            n--;
        }


    }
    int x=m*m;
    int y=n*n;
    return(float)Math.sqrt(x+y);

}
public static String compressstr(String str){
    Integer x=0,y=0,z=0,l=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a'){
            x++;
        }
        else if(str.charAt(i)=='b'){
            y++;
        }
        else if(str.charAt(i)=='c'){
            z++;
        }
        else if(str.charAt(i)=='d'){
            l++;
        }
    }
    x.toString();
    y.toString();
    z.toString();
    l.toString();
    String answer="a"+x+"b"+y+"c"+z+"d"+l;
    return answer;
}
public static void main(String args[]){
    //String str="WNEENESENNN";
    //System.out.println(shortestpath(str));
    //StringBuilder sb=new StringBuilder("");
    //for(char ch='a';ch<='z';ch++){
    //    sb.append(ch);
    //}
    //System.out.println(sb);
    //System.out.println(sb.length());
    //System.out.println(sb.charAt(1));
    String str="aaabbcccccdddddabcd";
    System.out.println(compressstr(str));
    
    System.out.println(Character.toUpperCase(str.charAt(0)));
}
}