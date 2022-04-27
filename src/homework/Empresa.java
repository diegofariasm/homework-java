
package homework;

import java.util.Scanner;

public class Empresa {
    String company_name;
    String company_address;
    String company_city;
    String company_state;
    String company_cep;
    String company_telephone;
    Scanner tcl = new Scanner(System.in);

    public Empresa(){
        System.out.println("No arguments");
    }
    public Empresa(String name, String address, String city, String state, String cep, String telephone){
        this.company_address = address;
        this.company_name = name;
        this.company_cep = cep;
        this.company_telephone = telephone;
        this.company_city = city;
        this.company_state = state;
    
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name() {
        this.company_name = tcl.nextLine();
    }
    public void printCompany_name(){
        System.out.println(this.company_name);
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address() {
        this.company_address = tcl.nextLine();
    }
    public void printCompany_adress(){
        System.out.println(this.company_address);
    }

    public String getCompany_city() {
        return company_city;
    }

    public void setCompany_city() {
        this.company_city = tcl.nextLine();
    }
    public void printCompany_city(){
        System.out.println(this.company_city);
    }

    public String getCompany_state() {
        return company_state;
    }

    public void setCompany_state() {
        this.company_state = tcl.nextLine();
    }
    public void printCompany_state(){
        System.out.println(company_state);
    }
   

    public String getCompany_cep() {
        return company_cep;
    }

    public void setCompany_cep() {
        this.company_cep = tcl.nextLine();
    }
    public void printCompany_cep(){
        System.out.println(this.company_cep);
    }


    public String getCompany_telephone() {
        return company_telephone;
    }

    public void setCompany_telephone() {
        this.company_telephone = tcl.nextLine();
    }
    public void printCompany_tel(){
        System.out.println(this.company_telephone);
    }
    public void print_company_information(){
        
        
        System.out.println("Nome: " + company_name);
        System.out.println("Telefone: " + company_telephone);
        System.out.println("Endereço: " + company_address);
        System.out.println("Estado em que é localizada: " + company_state);
        System.out.println("Cidade em que é localizada: " + company_city);
        System.out.println("CEP:" + company_cep);
        
    
    
    }

    
    
}
