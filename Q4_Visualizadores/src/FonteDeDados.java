import java.util.*;

public class FonteDeDados implements Observavel {
    private List<Integer> lst;
    private List<Observador> observadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new ArrayList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificarObservadores(value);
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }

    @Override
    public void registarObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificarObservadores(int novoValor) {
        for(Observador obs : observadores){
            obs.atualizar(novoValor);
        }
    }
}