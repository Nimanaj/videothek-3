import items.*;
import items.tags.*;
import rental_store.*;
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Customer customer = new Customer("Max", "Mustermann", 18);

        System.out.println("**********");
        System.out.println("Keine Normale Medie");
        inventory.addMedium(new Medium("Buch", "Percy Jackson", 10));
        System.out.println(inventory.getMedium()[0]);

        System.out.println("**********");
        System.out.println("CD");
        inventory.addCD(new CD("Radiohead","OK Computer", 1.49, false, MusicGenre.ALTERNATIVE));
        inventory.addCD(new CD("Radiohead","Moon Shaped Pool", 1.49, false, MusicGenre.ALTERNATIVE));
        System.out.println(inventory.getCds()[1].getTitle());

        System.out.println("**********");
        System.out.println("DVD");
        inventory.addDVD(new DVD("Inglorious Basterds", 2.99, FSKRating.FSK18, MovieGenre.ACTION));
        inventory.addDVD(new DVD("Spiderman 1", 2.99, FSKRating.FSK12, MovieGenre.ACTION));
        inventory.addDVD(new DVD("IRON MEN 3", 5.99, FSKRating.FSK12, MovieGenre.ACTION));
        inventory.getDvds()[1].setSalePrice(1.99); // set sale price for "Spiderman 1"
        
        System.out.println(inventory.getDvds()[2].getTitle());
        System.out.println(inventory.getDvds()[2].getPrice());
        System.out.println(inventory.getDvds()[2].id());

        System.out.println("**********");
        System.out.println("BlueRay");
        inventory.addBlueRay(new BlueRay("Spider-Man: No Way Home", 10));
        System.out.println(inventory.getBlueRays()[0]);

        System.out.println("**********");
        System.out.println(inventory);
        customer.rentDVD(inventory.getDvds()[0]);
        customer.rentCD(inventory.getCds()[0]);
        System.out.println(customer);
    }
}