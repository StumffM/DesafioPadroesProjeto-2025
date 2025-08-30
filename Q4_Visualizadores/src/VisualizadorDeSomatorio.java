import java.util.*;

public class VisualizadorDeSomatorio implements Observador {
    private List<Integer> valores;
    private boolean ativo;

    public VisualizadorDeSomatorio(){
        this.valores = new ArrayList<>();
        this.ativo = true;
    }

    @Override
    public void atualizar(int novoValor) {
        if (ativo) {
            valores.add(novoValor);
        }
    }

    @Override
    public void exibir() {
        if(ativo) {
            int somatorio = valores.stream()
                .mapToInt(Integer :: intValue)
                .sum();
            System.out.println("Somatório dos valores: " + somatorio + "\nQuantidade de valores: " + valores.size());
        }
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
        if (!ativo) {
            valores.clear();
        }
    }

    public boolean isAtivo() {
        return ativo;
    }
}
