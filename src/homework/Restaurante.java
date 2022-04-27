
package homework;


public class Restaurante extends Empresa{
    String food_type;
    String food_price;

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }
    public void printFood_type(){
        System.out.println("O tipo de comida é: " + food_type);
    }

    public String getFood_price() {
        return food_price;
    }

    public void setFood_price(String food_price) {
        this.food_price = food_price;
    }
    public void printFood_price(){
        System.out.println("O preço médio é:" + food_price);
    }
    
   public Restaurante(){
       super();
   }
    
    public Restaurante(String food_type, String food_price, String name, String address, String city, String state, String cep, String telephone) {
        super(name, address, city, state, cep, telephone);
        this.food_type = food_type;
        this.food_price = food_price;
    }
    
    
    
}
