import java.util.*;

public class VisualizadorDeMedia implements Observador {
    private List<Integer> valores;
    private boolean ativo;

    public VisualizadorDeMedia(){
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
            double media = valores.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0);
            System.out.println("Média dos valores: " + media + "\nQuantidade de valores: " + valores.size());
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
