public class Morador {
    private String nome;
    private String bloco;
    private int numeroDoApartamento;
    private String numeroDeTelefone;

    
    public Morador(String nome, String bloco, int numeroDoApartamento, String numeroDeTelefone) {
        this.nome = nome;
        this.bloco = bloco;
        this.numeroDoApartamento = numeroDoApartamento;
        this.numeroDeTelefone = numeroDeTelefone;
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


    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }
    

}
