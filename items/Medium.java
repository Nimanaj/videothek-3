package items;

import java.util.Random;
/**
 * This class provides multiple Methods for classes.
 * 
 * @author Altin Nimanaj.
 * @version 2022 Mai 10.
 */
public class Medium {
    /**
     * Stors a string.
     * 
     * @autor Altin Nimanaj.
     */
    protected String title;
    /**
     * Stors a double.
     * 
     * @autor Altin Nimanaj.
     */
    protected double price;
    /**
     * Stors a double.
     * 
     * @autor Altin Nimanaj.
     */
    protected double sale_price;
    /**
     * Stors a boolean.
     * 
     * @autor Altin Nimanaj.
     */
    protected boolean on_sale;
    /**
     * Stors a boolean.
     * 
     * @autor Altin Nimanaj.
     */
    protected boolean rented;
    /**
     * Stors a String.
     * 
     * @autor Altin Nimanaj.
     */
    private String type = "";
    /**
     * Is the cunstructor.
     * 
     * @author Altin Nimanaj.
     * @param type is the medium type.
     * @param title is the title.
     * @param price is the price.
     */
    public Medium(String type,String title, double price) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.sale_price = 0.0;
        this.on_sale = false;

        this.rented = false;
    }
    /**
     * Getter for the title.
     * 
     * @author Altin Nimanaj.
     * @return title.
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Getter for the price.
     * 
     * @author Altin Nimanaj.
     * @return price wether is sale or not.
     */
    public double getPrice() {
        if (this.on_sale) {
            return this.sale_price;
        } else {
            return this.price;
        }
    }
    /**
     * Setter for title.
     * 
     * @author Altin Nimanaj.
     * @param title title of the Medium.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * This method givs the ranted back.
     * 
     * @author Altin Nimanaj.
     * @return rented.
     */
    public boolean isRented() {
        return this.rented;
    }
    /**
     * Set ranted on true.
     * 
     * @author Altin Nimanaj.
     */
    public void rent() {
        this.rented = true;
    }
    /**
     * Set rented on false.
     * 
     * @author Altin Nimanaj.
     */
    public void ret() {
        this.rented = false;
    }
    /**
     * Setter for price.
     * 
     * @author Altin Nimanaj.
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * Setter for sale price.
     * This method set the on_sale on true and set the sale_price.
     * 
     * @author Altin Nimanaj.
     * @param sale_price
     */
    public void setSalePrice(double sale_price) {
        this.sale_price = sale_price;
        this.on_sale = true;
    }
    /**
     * Remover for sale price.
     * 
     * @author Altin Nimanaj.
     */
    public void removeSalePrice() {
        this.sale_price = 0.0;
        this.on_sale = false;
    }
    /**
     * Geter for age.
     * 
     * @author Altin Nimanaj.
     * @param age
     * @return fasle.
     */
    public boolean ageValid(int age) {
        return false;
    }
    /**
     * Setter for type.
     * 
     * @author Altin Nimanaj.
     * @return type.
     */
    public String getType(){
        return this.type;
    }
    /**
     * This method creats a format string for Medium.
     * 
     * @author Altin Nimanaj.
     */
    public String toString() {
        return String.format("[%s: %s, %f EUR]", getType(), getTitle(), getPrice());
    }
    /**
     * This method creats a ID.
     * 
     * 
     * @author Altin Nimanaj.
     * @return mm.
     */
    public String id(){
        String arr[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","2","4","6","8","0"};
        int l = arr.length;
        String mm = "bb.";
        Random rad = new Random();

        for(int i = 0; i < 20; i++){

                mm += arr[rad.nextInt(l)];
        }
        return mm;
    }

}
