
/**
 * The register that scans items.
 *
 * @author Amari Watson
 * @version 1.2
 */
public class Machine
{
    private Item item1;
    private Item item2;
    private Item item3;
    private Item item4;
    private Item item5;
    private Item item6;
    private double discount;

    public Machine()
    {

    }

    public void clearItems()
    {
        item1 = null;
        item2 = null;
        item3 = null;
        item4 = null;
        item5 = null;
        item6 = null;
    }

    public void applyDiscount(double discountPercentage)
    {
        if (discountPercentage >= 1 || discountPercentage < 0)
        {
            System.out.println("Error: Discounts need to be a value between 0 and 1, not inclusive of 1");
        }
        else
        {
            discount = discountPercentage;
        }
    }

    public void startScan()
    {
        clearItems();
    }

    public void scanItem(Item item)
    {
        if (item.getValid() == true)
        {
            if (ItemTable.getPrice(item) != 0)
            {
                if (item1 == null)
                {
                    item1 = item;
                }
                else if (item2 == null)
                {
                    item2 = item;
                }
                else if (item3 == null)
                {
                    item3 = item;
                }
                else if (item4 == null)
                {
                    item4 = item;
                }
                else if (item5 == null)
                {
                    item5 = item;
                }
                else if (item6 == null)
                {
                    item6 = item;
                }
                else
                {
                    System.out.println("" + item1 + item2 + item3 + item4 + item5 + item6);
                    System.out.println("Warning: You can only scan six (6) items");
                }
            }
            else
            {
                System.out.println("Error: Your item is not in the system");
            }
        }
        else
        {
            System.out.println("Error: Your item has an invalid barcode");
        }
    }

    public void finishScan()
    {
        System.out.println("Your transaction");
        printItem(item1);
        printItem(item2);
        printItem(item3);
        printItem(item4);
        printItem(item5);
        printItem(item6);
        System.out.printf("%-16s$%.2f ($%.2f before your %.2f%% discount)\n", "Final Balance:", getBalance() * (1 - discount), getBalance(), discount * 100);
        clearItems();
    }

    public void printItem(Item item)
    {
        if (item != null)
        {
            System.out.printf("%-16s$%.2f\n", ItemTable.getName(item), ItemTable.getPrice(item));
        }
    }

    public void removeLastItem()
    {
        if (item6 != null)
        {
            item6 = null;
        }
        else if (item5 != null)
        {
            item5 = null;
        }
        else if (item4 != null)
        {
            item4 = null;
        }
        else if (item3 != null)
        {
            item3 = null;
        }
        else if (item2 != null)
        {
            item2 = null;
        }
        else if (item1 != null)
        {
            item1 = null;
        }
        else
        {
            System.out.println("There are no scanned items");
        }
    }

    public double getBalance()
    {
        double balance = 0;
        if (item1 != null)
        {
            balance += ItemTable.getPrice(item1);
        }

        if (item2 != null)
        {
            balance += ItemTable.getPrice(item2);
        }

        if (item3 != null)
        {
            balance += ItemTable.getPrice(item3);
        }

        if (item4 != null)
        {
            balance += ItemTable.getPrice(item4);
        }

        if (item5 != null)
        {
            balance += ItemTable.getPrice(item5);
        }

        if (item6 != null)
        {
            balance += ItemTable.getPrice(item6);
        }
        return balance;
    }

}
