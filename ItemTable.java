
/**
 * Holds the prices and names of items
 * 
 * @author Amari Watson 
 * @version 1.0
 */
public class ItemTable
{
    static String barcode1 = "12345678";
    static String barcode2 = "22222222";
    static String barcode3 = "65463218";
    static String barcode4 = "83497258";
    static String barcode5 = "96541852";
    static String barcode6 = "QWERTYUI";
    static String barcode7 = "ASDFGHJK";
    static String barcode8 = "ZXCVVVVV";
    static String barcode9 = "PAIF52EN";
    static String barcode10 = "UENF836E";
    
    public ItemTable()
    {
        
    }

    public static String getName(Item item)
    {
        String name = "INVALID ITEM";
        String barcode = item.getBarcode();
        if (barcode.equals(barcode1))
        {
            name = "Bread";
        }
        else if (barcode.equals(barcode2))
        {
            name = "Fish";
        }
        else if (barcode.equals(barcode3))
        {
            name = "Milk";
        }
        else if (barcode.equals(barcode4))
        {
            name = "Milo";
        }
        else if (barcode.equals(barcode5))
        {
            name = "Steak";
        }
        else if (barcode.equals(barcode6))
        {
            name = "Cheese";
        }
        else if (barcode.equals(barcode7))
        {
            name = "Ramen";
        }
        else if (barcode.equals(barcode8))
        {
            name = "Chips";
        }
        else if (barcode.equals(barcode9))
        {
            name = "Tea";
        }
        else if (barcode.equals(barcode10))
        {
            name = "Pepsi";
        }
        else
        {
            System.out.println("Error: Your item is not in the system");
        }
        return name;
    }
    
    public static double getPrice(Item item)
    {
        double price = 0;
        String barcode = item.getBarcode();
        if (barcode.equals(barcode1))
        {
            price = 2.72;
        }
        else if (barcode.equals(barcode2))
        {
            price = 10.65;
        }
        else if (barcode.equals(barcode3))
        {
            price = 4.85;
        }
        else if (barcode.equals(barcode4))
        {
            price = 3.16;
        }
        else if (barcode.equals(barcode5))
        {
            price = 9.92;
        }
        else if (barcode.equals(barcode6))
        {
            price = 4.72;
        }
        else if (barcode.equals(barcode7))
        {
            price = 0.57;
        }
        else if (barcode.equals(barcode8))
        {
            price = 1.84;
        }
        else if (barcode.equals(barcode9))
        {
            price = 6.74;
        }
        else if (barcode.equals(barcode10))
        {
            price = 2.39;
        }
        else
        {
            System.out.println("Error: Your item is not in the system");
            price = 0;
        }
        return price;
    }
}
