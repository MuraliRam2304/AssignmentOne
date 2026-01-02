public class FindHCFandLCM {
    static void main(String[] args) {
        int a=12;
        int b=20;
        int HCF=FindHCF(a,b);
        int LCM=(a*b)/HCF;
        System.out.println(HCF);
        System.out.println(LCM);
    }
    public static int FindHCF(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
