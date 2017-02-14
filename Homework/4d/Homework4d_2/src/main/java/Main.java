/**
 * Created by Max on 12.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Create storage instance
        Storage storage = new Storage();

        //Create goods instances
        Product prod1 = new Product("Bananas", Category.FOOD);
        Product prod2 = new Product("Jeans", Category.CLOTHES);
        Product prod3 = new Product("Apple", Category.FOOD);

        //Add goods to storage
        storage.addProduct(prod1);
        storage.addProduct(prod2);
        storage.addProduct(prod3);

        //Save UNsorted order of one category into separate array (for verification of UNsorted order)
        Product[] filteredByCat = storage.getProducts(Category.FOOD);
        //Sort order of goods inside one category
        //Product[] sortedByCat = storage.sort(Category.FOOD);
        storage.sort(Category.FOOD);
        //Save sorted order of one category into separate array (for verification of sorted order)
        Product[] sortedByCat = storage.getProducts(Category.FOOD);

        //Print UNsorted order
        for (Product product : filteredByCat) {
            System.out.println(product.getName());
        }
        //Print sorted order
        for (Product product : sortedByCat) {
            System.out.println(product.getName());
        }

        //Create instances of goods at FURNITURE category
        Product prod4 = new Product("Cupboard", Category.FURNITURE);
        Product prod5 = new Product("Door", Category.FURNITURE);
        Product prod6 = new Product("Cabinet", Category.FURNITURE);
        //Add UNsorted order of goods to storage
        storage.addProduct(prod4);
        storage.addProduct(prod5);
        //Add goods to storage with sorting by name in all storage
        storage.addProductWithSorting(prod6);

/*
        //Verify that order in FURNITURE category is sorted
        for (Product product:storage.getProducts(Category.FURNITURE)){
            System.out.println(product.getName());
        }
*/

        //Instantiate goods and add to storage with sorting by name inside only one category
        Product prod7 = new Product("Cabinet Door Hinges", Category.FURNITURE);
        storage.addProductWithSorting(prod7, Category.FURNITURE);
        //Verify that order in FURNITURE category is sorted
        for (Product product : storage.getProducts(Category.FURNITURE)) {
            System.out.println(product.getName());
        }
        Product prod8 = new Product("Screw Driver", Category.TOOLS);
        storage.addProduct(prod8);
    }
}
