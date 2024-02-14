import java.time.LocalDate;
import java.util.List;

public class Chamado{
    private int ordemDeSERVICO;
    private LocalDate data;
    private String descricao;
    private StatusChamado tipoChamado;
    private List<Morador> moradores;

    public Chamado(int ordemDeSERVICO, String descricao) {
        this.ordemDeSERVICO = ordemDeSERVICO;
        this.data = LocalDate.now();
        this.descricao = descricao;
        this.tipoChamado = tipoChamado.ABERTO;
        this.moradores = moradores;
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
    public List<Morador> getMoradores() {
        return moradores;
    }
    public void adicionarMorador(Morador morador) {
        moradores.add(morador);
    }
    public void removerMorador(Morador morador) {
        moradores.remove(morador);
    }

    public int getQuantidadeMoradores() {
        return moradores.size();
    }

    public boolean isChamadoAberto() {
        return tipoChamado == StatusChamado.ABERTO;
    }

    public void finalizarChamado() throws ChamadoFechadoException {
        if (tipoChamado == StatusChamado.ABERTO) {
            tipoChamado = StatusChamado.RESOLVIDO;
        } else {
            throw new ChamadoFechadoException("O chamado já está fechado.");
        }
    }

   
    
}