package homework;

public class CadernoDeEnderecos {
private String email;
private String name;
private String birthday_date;
private String address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday_date() {
        return birthday_date;
    }

    public void setBirthday_date(String birthday_date) {
        this.birthday_date = birthday_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void print_data_table(){
        System.out.println("Seu nome é: " + name);
        System.out.println("Seu endereço é: " + address);
        System.out.println("Sua data de aniversário é: " + birthday_date);
        System.out.println("Seu email é: " + email);
    
    }



    
}
