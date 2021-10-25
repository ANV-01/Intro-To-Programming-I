public class HW02P01 {
    public static void main(String[] args){
      System.out.println("Powers:  Results:");
        for(int x =0;x<=7;x++){
          int y = (int) Math.pow(2,x);
          System.out.print("2^"+x+"      ");
          System.out.println(y);
        }
    }
}