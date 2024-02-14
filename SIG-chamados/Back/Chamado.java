import java.time.LocalDate;

public class Chamado{
    private int ordemDeSERVICO;
    private LocalDate data;
    private String descricao;
    private StatusChamado tipoChamado;

    public Chamado(int ordemDeSERVICO, String descricao) {
        this.ordemDeSERVICO = ordemDeSERVICO;
        this.data = LocalDate.now();
        this.descricao = descricao;
        this.tipoChamado = tipoChamado.ABERTO;
    }

    public int getOrdemDeSERVICO() {
        return ordemDeSERVICO;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusChamado getTipoChamado() {
        return tipoChamado;
    }

    public void finalizarChamado() throws ChamadoFechadoException {
        if (tipoChamado == StatusChamado.ABERTO) {
            tipoChamado = StatusChamado.RESOLVIDO;
        } else {
            throw new ChamadoFechadoException("O chamado já está fechado.");
        }
    }
    
}