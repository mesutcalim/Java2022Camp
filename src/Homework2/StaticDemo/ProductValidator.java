package Homework2.StaticDemo;

public class ProductValidator {

    static {
        System.out.println("Statik Yapıcı blok çalıştı.");
    }

    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı.");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public void bisey(){

    }
    public static class BaskaBirClass{
        public static void sil(){

        }
    }
}
