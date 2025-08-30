public interface Observavel {
    void registarObservador(Observador obs);
    void removerObservador(Observador obs);
    void notificarObservadores(int novoValor);
}
