package items;

import java.util.Random;
import items.tags.MusicGenre;

/**
 * This class provides multiple Methods to borrow a CD.
 * This class creats Cd's and reviws them by Explicit Label and by genre.
 * 
 * @author Altin Nimanaj.
 * @version 2022 Mai 10.
 */
public class CD extends Medium{
    /**
     * Says whether the CD has a label or not.
     * @autor Altin Nimanaj.
     */
    private boolean rating;
    /**
     * Stors an element. 
     * @autor Altin Nimanaj.
     */
    private MusicGenre genre;
    /**
     * Is the constructor.
     * Crats a CD
     * 
     * @author Altin Nimanaj.
     * @param musicArtist is the name from the artist.
     * @param title is the title.
     * @param price is the price.
     * @param isExplicit is the label.
     * @param genre is the music genre.
     */
    public CD(String musicArtist, String title, double price, boolean isExplicit, MusicGenre genre) {

        super("CD", musicArtist + " - " + title, price);
        super.sale_price = 0.0;
        super.on_sale = false;

        this.rating = isExplicit;
        this.genre = genre;

        super.rented = false;
    }
    /**
     * Getter for price.
     * This method asks for the offer and decides back on the price.
     * 
     * @autor Altin Nimanaj.
     * @return the price.
     */
    public double getPrice() {
        if (super.on_sale) {
            return super.sale_price;
        } else {
            return super.price;
        }
    }
    /**
     * Checks by bool.
     * Checks the bool for true or false.
     * 
     * @autor Altin Nimanaj.
     * @return true if bool is true otherwise false.
     */
    public boolean isExplicit() {
        return this.rating;
    }
    /**
     * Getter for the genre.
     * 
     * @author Altin Nimanaj
     * @return
     */
    public MusicGenre getGenre() {
        return this.genre;
    }
    /**
     * Returns true or false based on age.
     * 
     * @author Altin niamanaj
     * @return a boolean.
     */
    public boolean ageValid(int age) {
        if (this.rating) {
            return age >= 18;
        } else {
            return true;
        }
    }
    /**
     * Creats the IMDb ID.
     * This method has a String array wich creats the ID random.
     * 
     * @author Altin Nimanaj.
     * @return mbi.
     */
    public String id(){
        String arr[] = {"1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",};
        String mbi = "";
        int l = arr.length;

        Random rad = new Random();

        for(int i = 0; i < 36; i++){
            if(i == 8 || i == 13 || i == 18 || i == 23){
                mbi += "-";
            } else {
                mbi += arr[rad.nextInt(l)];
            }
        }
        return mbi;
    }

}