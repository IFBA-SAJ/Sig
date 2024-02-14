import java.util.ArrayList;

public class BancoDeDados{
    private static Administrador adm;
    private static ArrayList<Chamado> BancoChamados;
    private static ArrayList<Morador> BancoDeMoradores;
    
    public static Administrador getAdministrador() {
        return adm;
    }

    public static void setAdministrador(Administrador administrador) {
        adm = administrador;
    }
    
    public static void adicionarChamado(Chamado chamado) {
        if (BancoChamados == null) {
            BancoChamados = new ArrayList<>();
        }
        
       
        boolean jaCadastrado = false;
        for (Chamado c : BancoChamados) {
            if (c == chamado) {
                jaCadastrado = true;
                break;
            }
        }
        
       
        if (!jaCadastrado) {
            BancoChamados.add(chamado);
        } else {
            System.out.println("Chamado já cadastrado.");
        }
    }
    
    public static void adicionarMorador(Morador morador) {
        if (BancoDeMoradores == null) {
            BancoDeMoradores = new ArrayList<>();
        }
        
      
        boolean jaCadastrado = false;
        for (Morador m : BancoDeMoradores) {
            if (m.getEmail().equals(morador.getEmail())) {
                jaCadastrado = true;
                break;
            }
        }
        
       
        if (!jaCadastrado) {
            BancoDeMoradores.add(morador);
        } else {
            System.out.println("Morador já cadastrado.");
        }
    }
}
