
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account Xhoni = new Account();
        Account User= new Account( 100, 900, "mido", "mido123.it", "0788342343");
        int accountNumber;
        int balance;
        System.out.println("Vendos numrin e accountit : ");
        accountNumber=input.nextInt();
        Xhoni.setNumberId(accountNumber);
        System.out.println("Vendos balancen qe zoteroni : ");
        balance=input.nextInt();
        Xhoni.setBalance(balance);
        String user="";

        System.out.println("Vendos emrin e userit : ");
        user=input.next();
        Xhoni.setCostumerName(user);
        String email="";
        System.out.println("Vendos emailin e klientit : ");
        email=input.next();

        Xhoni.setEmail(email);
        String phoneNumber;
        System.out.println();
        System.out.println("Vendos numrin e perdoruesit ");
        phoneNumber=input.next();
        Xhoni.setPhoneNumber(phoneNumber);

        int value;
        System.out.println("Menu");
        System.out.println("Vendos 1 nese do shtosh ne llogari : ");
        System.out.println("Vendos 2 nese do marresh nga llogaria : ");
        value=input.nextInt();
        int vlera;
        if(value == 1){

            System.out.println("Vendos shumen qe do vendosesh : ");
            vlera=input.nextInt();
            Xhoni.deposit(vlera);
        }else if (value == 2 ){
            System.out.println("Vendos shumen qe do marresh : ");
            vlera=input.nextInt();
            Xhoni.withdraw(vlera);
        }else
        {
            System.out.println("Ju nuk keni bere nje zgjedhje qe suportohet nga ne ....");
        }





        Xhoni.print();
        System.out.println();
        System.out.println();
        System.out.println();


        User.print();


    }
}