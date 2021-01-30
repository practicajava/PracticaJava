/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.practica;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Representa un producto.
 *
 * @author jcpalma
 */
public class Product implements Comparable<Product> {

    private static final NumberFormat PRICE_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
    private static final NumberFormat STOCK_FORMAT = NumberFormat.getNumberInstance();

    private final int productId;
    private final String productName;
    private String branch = "TBD";
    private double price = 0.0;
    private int stock = 0;

    /**
     * Crea una instancia de Product.
     *
     * @param productId es el identificador del producto.
     * @param productName es el nombre del producto.
     */
    private Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    /**
     * Devuelve el identificador del producto.
     *
     * @return el identificador del productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Devuelve el nombre del producto.
     *
     * @return el nombre del producto.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Devuelve la marca del producto.
     *
     * @return la marca del producto.
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Establece la marca del producto.
     *
     * @param branch la marca del producto.
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return el precio del producto.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del producto.
     *
     * @param price es el precio del producto.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve la existencia del producto.
     *
     * @return la existencia del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece la existencia del producto.
     *
     * @param stock es la existencia del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Devuelve una cadena como la representación de un producto:
     * <pre>
     * {id: productId; name: productName; price: price; stock: stock}
     * </pre>
     * 
     * @return una cadena representando un producto.
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("{")
                .append("id: ").append(productId).append("; ")
                .append("name: ").append(productName).append("; ")
                .append("branch: ").append(branch).append("; ")
                .append("price: ").append(PRICE_FORMAT.format(price)).append("; ")
                .append("stock: ").append(STOCK_FORMAT.format(stock))
                .append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Product other = (Product) obj;
        return this.productId == other.productId;
    }

    @Override
    public int compareTo(Product product) {
        return Double.compare(this.price, product.price);
    }
    
    public int compareToByName(Product product) {
        return this.productName.compareTo(product.productName);
    }
    
    public int compareToById(Product product) {
        return this.productId - product.productId;
    }
    
    @Override
    public int hashCode() {
        return 31 * productId * productName.hashCode();
    }

    /**
     * Clase para crear un producto.
     */
    public static class Builder {

        private final Product product;

        /**
         * Crea una instancia de Builder.
         *
         * @param productId es el identificador del producto.
         * @param productName es el nombre del producto.
         */
        public Builder(int productId, String productName) {
            this.product = new Product(productId, productName);
        }

        /**
         * Establece la marca del producto.
         *
         * @param branch es la marca del producto.
         * @return Product.Builder que se encarga de crear un objeto producto.
         */
        public Builder setBranch(String branch) {
            this.product.branch = branch;
            return this;
        }

        /**
         * Establece el precio del producto.
         *
         * @param price es el precio del producto.
         * @return Product.Builder que se encarga de crear un objeto producto.
         */
        public Builder setPrice(double price) {
            this.product.price = price;
            return this;
        }

        /**
         * Establece la existencia del producto.
         *
         * @param stock es la existencia del producto.
         * @return Product.Builder que se encarga de crear un objeto producto.
         */
        public Builder setStock(int stock) {
            this.product.stock = stock;
            return this;
        }

        /**
         * Devuelve un producto.
         *
         * @return Product con los valores establecido en el Builder.
         */
        public Product build() {
            return product;
        }

    }

}
