package currency;
import java.util.Scanner;

public class concurrency_converter {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner scan= new Scanner(System.in);
            double amount;
            double finamount;
            String from;
            String to;
            System.out.print("Enter the  current currency  :");
            from=scan.nextLine().toUpperCase();
            System.out.print("Enter the target currency to convert into: ");
            to=scan.nextLine().toUpperCase();
            System.out.print("Enter the amount :");
            amount=scan.nextDouble();
            switch(from+"="+to) {
                case "USD=IND","USD=RUPPES" -> {
                    finamount=amount*87;
                    System.out.printf("\"the %s of %.2f is %s of %.2f.",from,amount,to,finamount);
                }
                case "IND=USD","RUPPES=USD" ->
                { finamount=amount*0.012;
                    System.out.printf("the %s of %.2f is %s of %.2f.",from,amount,to,finamount);
                }
                default -> {
                    System.out.println("enter The Valid currency And Amount ");
                }
            }
            scan.close();
        }

    }


