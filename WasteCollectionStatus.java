import java.util.Scanner;
public class WasteCollectionStatus {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter waste collected in kg : ");
    double wasteCollected = sc.nextDouble();

    if (wasteCollected >=200) {
        System.out.println("Waste  collection Archived");

    }else{
        System.out.println("More waste collection reduced");
    }     
 }
}