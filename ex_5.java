public class ex_5 {
    // Created by HARSH PATEL
    // ID NO 21CE090
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
class TestOverloading{
    public static void main(String[] args){
        System.out.println(ex_5.add(11,11));
        System.out.println(ex_5.add(12.3,12.6));
    }
}
