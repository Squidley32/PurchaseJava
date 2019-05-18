//This program was proudly written by Sydnni Ahlheim, as her second complex program quickly written,
// all by hand, with no help whatsoever =)
// on 11/29/18
//It's purpose is to demonstrate the usage of abstract classes and arrays.
import java.util.Scanner;
public class PurchaseDemo
{
    public static void main(String[]args)
    {
        int choice;
        ShoppingCart cart = new ShoppingCart();

        Clothes clothingItem = new Clothes();
        Electronics electronicsItem = new Electronics();
        HouseholdGoods householdGoodsItem = new HouseholdGoods();
        Groceries groceryItem = new Groceries();
        Liquor liquorItem = new Liquor();
        cart.cartTotal = 0;
        cart.itemsInCart = 0;
        int i = 0;
        do
        {
            System.out.println("Please select the category for your purchase (select the category number - enter 0 to checkout):");
            System.out.println("1. Clothes \n2. Electronics \n3. Household goods \n4. Groceries \n5. Liquor");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if (choice == 1)
            {
                System.out.println(clothingItem.descriptionPrompt);
                clothingItem.description = input.next();
                System.out.println("Enter the price for the " + clothingItem.description);
                clothingItem.price = input.nextDouble();
                System.out.println("Enter the number of " + clothingItem.description + "(s) that you would like to buy");
                clothingItem.quantity = input.nextInt();
                clothingItem.itemCost = clothingItem.CalculateItemCost(clothingItem.quantity, clothingItem.price);
                clothingItem.itemCostWithTax = clothingItem.CalculateCostWithTaxes(clothingItem.itemCost);
                System.out.println(clothingItem.DisplayItemDetails());
                cart.itemsInCart = cart.itemsInCart + clothingItem.quantity;
                cart.cartTotal = cart.cartTotal + clothingItem.itemCostWithTax;
                cart.qtyItems[i] = clothingItem.quantity;
                cart.cartItems[i] = clothingItem.description;
                ++i;

            }
            if (choice == 2)
            {
                System.out.println(electronicsItem.descriptionPrompt);
                electronicsItem.description = input.next();
                System.out.println("Enter the price for the " + electronicsItem.description);
                electronicsItem.price = input.nextDouble();
                System.out.println("Enter the number of " + electronicsItem.description + "(s) that you would like to buy");
                electronicsItem.quantity = input.nextInt();
                electronicsItem.itemCost = electronicsItem.CalculateItemCost(electronicsItem.quantity, electronicsItem.price);
                electronicsItem.itemCostWithTax = electronicsItem.CalculateCostWithTaxes(electronicsItem.itemCost);
                System.out.println(electronicsItem.DisplayItemDetails());
                cart.itemsInCart = cart.itemsInCart + electronicsItem.quantity;
                cart.cartTotal = cart.cartTotal + electronicsItem.itemCostWithTax;
                cart.cartItems[i] = electronicsItem.description;
                cart.qtyItems[i] = electronicsItem.quantity;
                ++i;
            }
            if (choice == 3)
            {
                System.out.println(householdGoodsItem.descriptionPrompt);
                householdGoodsItem.description = input.next();
                System.out.println("Enter the price for the " + householdGoodsItem.description);
                householdGoodsItem.price = input.nextDouble();
                System.out.println("Enter the number of " + householdGoodsItem.description + "(s) that you would like to buy");
                householdGoodsItem.quantity = input.nextInt();
                householdGoodsItem.itemCost = householdGoodsItem.CalculateItemCost(householdGoodsItem.quantity, householdGoodsItem.price);
                householdGoodsItem.itemCostWithTax = householdGoodsItem.CalculateCostWithTaxes(householdGoodsItem.itemCost);
                System.out.println(householdGoodsItem.DisplayItemDetails());
                cart.itemsInCart = cart.itemsInCart + householdGoodsItem.quantity;
                cart.cartTotal = cart.cartTotal + householdGoodsItem.itemCostWithTax;
                cart.cartItems[i] = householdGoodsItem.description;
                cart.qtyItems[i] = householdGoodsItem.quantity;
                ++i;
            }
            if (choice == 4)
            {
                System.out.println(groceryItem.descriptionPrompt);
                groceryItem.description = input.next();
                System.out.println("Enter the price for the " + groceryItem.description);
                groceryItem.price = input.nextDouble();
                System.out.println("Enter the number of " + groceryItem.description + "(s) that you would like to buy");
                groceryItem.quantity = input.nextInt();
                groceryItem.itemCost = groceryItem.CalculateItemCost(groceryItem.quantity, groceryItem.price);
                groceryItem.itemCostWithTax = groceryItem.CalculateCostWithTaxes(groceryItem.itemCost);
                System.out.println(groceryItem.DisplayItemDetails());
                cart.itemsInCart = cart.itemsInCart + groceryItem.quantity;
                cart.cartTotal = cart.cartTotal + groceryItem.itemCostWithTax;
                cart.cartItems[i] = groceryItem.description;
                cart.qtyItems[i] = groceryItem.quantity;
                ++i;
            }
            if (choice == 5)
            {
                System.out.println(liquorItem.descriptionPrompt);
                liquorItem.description = input.next();
                System.out.println("Enter the price for the " + liquorItem.description);
                liquorItem.price = input.nextDouble();
                System.out.println("Enter the number of " + liquorItem.description + "(s) that you would like to buy");
                liquorItem.quantity = input.nextInt();
                liquorItem.itemCost = liquorItem.CalculateItemCost(liquorItem.quantity, liquorItem.price);
                liquorItem.itemCostWithTax = liquorItem.CalculateCostWithTaxes(liquorItem.itemCost);
                System.out.println(liquorItem.DisplayItemDetails());
                cart.itemsInCart = cart.itemsInCart + liquorItem.quantity;
                cart.cartTotal = cart.cartTotal + liquorItem.itemCostWithTax;
                cart.cartItems[i] = liquorItem.description;
                cart.qtyItems[i] = liquorItem.quantity;
                ++i;
            }
            if (choice > 5)
            {
                System.out.println("You have entered an invalid choice, my friend. Please try again. ");
            }
        }while(choice != 0);
        if (choice == 0)
        {
            System.out.println("You have checked out.");
            System.out.println("You have " + cart.itemsInCart + " items in your cart.");
            System.out.println("Your cart total is $" + cart.cartTotal);
            System.out.println("Here are your purchased items, and their quantities:");
            cart.forDisplay(cart.cartItems,cart.qtyItems);
        }


    }
}
