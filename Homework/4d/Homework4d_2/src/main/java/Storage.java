import java.util.ArrayList;

/**
 * Created by Max on 12.02.2017.
 */
public class Storage {
    //ArrayList<Product> products;
    private Product[] products = new Product[0];
    private final int capacity=7;

    public Product[] getProducts(Category category) {
        Product[] filteredProducts_array;
        ArrayList<Product> filteredProducts_list = new ArrayList<Product>();
        for (Product aProduct : products) {
            if (aProduct.getCategory().equals(category)) {
                filteredProducts_list.add(aProduct);
            }
        }
        filteredProducts_array = new Product[filteredProducts_list.size()];
        return filteredProducts_list.toArray(filteredProducts_array);

    }
/*

    public Product[] sort(Category category) {
        Product[] productsToSort = getProducts(category);
        Product bufProduct;
        for (int i = 0; i < productsToSort.length; i++) {
            for (int j = 0; j < productsToSort.length-1-i; j++) {
                if ((productsToSort[j].getName().compareTo(productsToSort[j+1].getName())) > 0) {
                    bufProduct = productsToSort[j];
                    productsToSort[j]=productsToSort[j+1];
                    productsToSort[j+1]=bufProduct;
                }
            }
        }
        return productsToSort;
    }
*/

    public void sort(Category category) {
        Product[] productsToSort = getProducts(category);
        Product bufProduct;
        int sortedItemsCounter=0;
        for (int i = 0; i < productsToSort.length; i++) {
            for (int j = 0; j < productsToSort.length-1-i; j++) {
                if ((productsToSort[j].getName().compareTo(productsToSort[j+1].getName())) > 0) {
                    bufProduct = productsToSort[j];
                    productsToSort[j]=productsToSort[j+1];
                    productsToSort[j+1]=bufProduct;
                }
            }
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory() == category) {
                products[i] = productsToSort[sortedItemsCounter];
                sortedItemsCounter++;
            }
        }
    }

    public void sort(){
        Product bufProduct;
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length-1-i; j++) {
                if ((products[j].getName().compareTo(products[j+1].getName())) > 0) {
                    bufProduct = products[j];
                    products[j]=products[j+1];
                    products[j+1]=bufProduct;
                }
            }
        }
    }

    public boolean addProduct(Product product) {
        if (products.length>=capacity){
            System.out.println("\nImpossible to add goods, Storage is overwlown.\n");
            return false;
        }
        Product[] extendedArray = new Product[products.length + 1];
        //products = new Product[buf.length+1];
        for (int i = 0; i < products.length; i++) {
            extendedArray[i] = products[i];
        }
        extendedArray[extendedArray.length - 1] = product;
        products = extendedArray;
        return true;
    }

    public void addProductWithSorting(Product product) {
        if (addProduct(product)) sort();
    }
    public void addProductWithSorting(Product product, Category category) {
        if (addProduct(product)) sort(category);
    }
}
