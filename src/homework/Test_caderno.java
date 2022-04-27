
package homework;

public class Test_caderno {
    
    public static void main(String[] args) {
            CadernoDeEnderecos a = new CadernoDeEnderecos();
            a.setName("Diego Farias Mesquita");
            a.setBirthday_date("09/07/2005");
            a.setAddress("Rua dos Sonhos");
            a.setEmail("diego.mesquita5@aluno.ce.gov.br");
            
            a.print_data_table();
            Scientific_Calculator c = new Scientific_Calculator();
            System.out.println(c.square_number(8));
       
        
    }
    
}
