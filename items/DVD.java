package items;

import java.util.Random;
import items.tags.FSKRating;
import items.tags.MovieGenre;

/**
 * This class provides multiple Methods to borrow a DVD.
 * This class creats DVD's and reviws them by FSK rating and by genre.
 * 
 * @author Altin Nimanaj.
 * @version 2022 Mai 10.
 */
public class DVD extends Medium{
    
    /**
     * Stors an element. 
     * @autor Altin Nimanaj.
     */
    private FSKRating rating;
    /**
     * Stors an element of MovieGenre for the Method strGenreDVD().
     * @autor Altin Nimanaj.
     */
    private MovieGenre genre;
    /**
     * Is the constructor.
     * Creats a DVD.
     * 
     * @autor Altin Nimanaj.
     * @param title is the title.
     * @param price is the price.
     * @param rating is the sale price.
     * @param genre is the movi genre.
     */
    public DVD(String title, double price, FSKRating rating, MovieGenre genre) {
        super("DVD", title, price);
        super.sale_price = 0.0;
        super.on_sale = false;

        this.rating = rating;
        this.genre = genre;

        super.rented = false;
    }
    /**
     * Getter for the FSK-rating.
     * 
     * @auther Altin Nimanaj.
     * @return rating.
     */
    public FSKRating getRating() {
        return this.rating;
    }
    /**
     * Getter for the genre.
     * 
     * @auther Altin Nimanaj.
     * @return genre.
     */
    public MovieGenre getGenre() {
        return this.genre;
    }
    /**
     * Returns a boolean based on the age and the Medium.
     * 
     * @auther Altin Nimanaj.
     * @return boolean.
     */
    public boolean ageValid(int age) {
        return this.rating.ageValid(age);
    }
    /**
     * Creats the IMDb URL.
     * This method has a String array which is used 
     *  for making the URL random.
     * 
     * @auther Altin Nimanaj.
     * @return imb.
     */
    public String id(){
        String arr[] = {"1","2","3","4","5","6","7","8","9","0"};
        int l = arr.length;
        String imb = "tt";
        Random rad = new Random();

        for(int i = 0; i < 7; i++){
                imb += arr[rad.nextInt(l)];
        }
        return imb;
    }

}