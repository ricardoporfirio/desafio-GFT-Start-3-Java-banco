package dominio.cliente;

public class Email {

    private String email;

    public Email(String email) {
        
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Endereço de Email inválido");
        }

        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
}
