package items;

import java.util.Random;
import items.tags.FSKRating;
import items.tags.MovieGenre;
/**
 * This class provides multiple Methods to borrow a BlueRay.
 * This class creats BlueRay's and reviws them by FSK rating and by genre.
 * 
 * @author Altin Nimanaj.
 * @version 2022 Mai 10.
 */
public class BlueRay extends Medium{
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
     * Is the percentage for borrow a BlueRay.
     * @author Altin Nimanaj
     */
    private static final int reduction = 20;
    /**
     * This is the constructor.
     * 
     * @author Altin Nimanaj
     * @param title is the title.
     * @param price is the price.
     */
    public BlueRay(String title, double price){
        super("BlueRay", title, price);
        super.sale_price = 0.0;
        super.on_sale = false;

        super.rented = false;
    }
    /**
     * 
     * 
     * @author Altin Nimanaj.
     * @return wether the price or the percentage price.
     */
    public double getPrice() {
        if (super.on_sale) {
            return buildReduce();
        } else {
            return super.price;
        }
    }
    /**
     * Helper function for getPrice.
     * This method calculates the sum from the percentage.
     * 
     * @author Altin Nimanaj.
     * @return reduced sum.
     */
    private double buildReduce(){
        double deduction = super.price / reduction;
        return super.price - deduction;
    }
    /**
     * Setter for the sale price.
     * 
     * @author Altin Nimanaj.
     */
    public void setSalePrice() {
        super.on_sale = true;
    }
    /**
     * Getter for rating.
     * 
     * @author Altin Nimanaj.
     * @return rating.
     */
    public FSKRating getRating() {
        return this.rating;
    }
    /**
     * Getter for genre.
     * 
     * @author Altin Nimanaj
     * @return
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
     * Creats the ID.
     * This method has a String array which is used 
     *  for making the URL random.
     * 
     * @auther Altin Nimanaj.
     * @return br.
     */
    public String id(){
        String arr[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","2","4","6","8","0"};
        int l = arr.length;
        String br = "bb.";
        Random rad = new Random();

        for(int i = 0; i < 20; i++){

                br += arr[rad.nextInt(l)];
        }
        return br;
    }
}
