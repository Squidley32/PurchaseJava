public abstract class Item
{
    public String description;
    public double price;
    public double itemCost;
    public double itemCostWithTax;
    public int quantity;
abstract public double CalculateItemCost(int quantity, double cost);
abstract public double CalculateCostWithTaxes(double cost);
abstract public String DisplayItemDetails();
}
