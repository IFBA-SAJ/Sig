public class Morador {
    private String nome;
    private String bloco;
    private int numeroDoApartamento;
    private String email;

    
    public Morador(String nome, String bloco, int numeroDoApartamento, String email) {
        this.nome = nome;
        this.bloco = bloco;
        this.numeroDoApartamento = numeroDoApartamento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }


    public String getBloco() {
        return bloco;
    }


    public int getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public String getEmail() {
        return email;
    }



    

}
