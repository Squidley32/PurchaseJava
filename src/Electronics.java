public class Electronics extends Item
{
        public double taxRate = .07;
        public String descriptionPrompt = ("Enter a description of the Electronics item");

        public double CalculateItemCost(int quantity, double price)
        {
            double itemCost = quantity * price;
            return itemCost;
        }

        public double CalculateCostWithTaxes(double itemCost)
        {
            itemCostWithTax = (itemCost * taxRate) + itemCost;
            return itemCostWithTax;
        }

        public String DisplayItemDetails()
        {
            return "Electronics item(s) purchased." +
                    "\nItem Name: " + description +
                    "\nPrice before tax: $" + CalculateItemCost(quantity , price) +
                    "\nCost with tax: $" + CalculateCostWithTaxes(itemCost);
        }
    }

