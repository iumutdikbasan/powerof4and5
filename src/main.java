import java.util.Scanner;
public class main {
    public static void main(String[] args){

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the limit number: ");
        n = scan.nextInt();

        for(int dort = 1 ; dort<=n;dort*=4 ){
            System.out.println("Dordun katlari: "+dort);
        }
        for(int bes = 1 ; bes<=n;bes*=5 ){
            System.out.println("Besin katlari: "+bes);
        }
    }
}
