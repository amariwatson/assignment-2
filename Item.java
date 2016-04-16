
/**
 * The item that holds the barcode.
 * 
 * @author Amari Watson 
 * @version 1.2
 */
public class Item
{
    private String barcode;
    private boolean valid;

    /**
     * Constructor for objects of class Item
     */
    public Item(String paramBarcode)//an 8 character string
    {
        if (paramBarcode.length() != 8)
        {
            System.out.println("Error: The barcode must be 8 characters long");
            valid = false;
        }
        else
        {
            barcode = paramBarcode;
            valid = true;
        }
    }
    
    public String getBarcode()
    {
        return barcode;
    }
    
    public boolean getValid()
    {
        return valid;
    }
}
