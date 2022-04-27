
package homework;
public class Test_restaurante {
    
    public static void main(String[] args) {
        Restaurante r = new Restaurante("Chinesa", "10 Reais", "Restaurante Dos Sonhos", "Rua dos Sonhos", "Canindé", "Ceará", "62700000", "40028922");
        Restaurante c = new Restaurante();
        
        r.setCompany_address();
        r.printCompany_adress();
        
        
        r.print_company_information();
        
    }
}
