import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia();1
        var cs = new VisualizadorDeSomatorio();

        dados.registarObservador(cm);   
        dados.registarObservador(cs);

        Scanner s = new Scanner(System.in);
        int valor = 0;
        
        System.out.println("--- Sistema de Visualizadores ---");
        System.out.println("-- Menu --");
        System.out.println("0 - Sair");
        System.out.println("-1 - Ativar/Desativar Média");
        System.out.println("-2 - Ativar/Desativar Somatório");
        System.out.println("-3 - Adicionar novo visualizador de Média");
        System.out.println("-4 - Adicionar novo visualizador de Somatório");
        
        while(true){
            System.out.println("\nEntre um valor: ");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            }
            if (comandos(valor, dados, cm, cs)) {
                continue;
            }
            if ( valor > 0 ) {
                dados.add(valor);
                System.out.println("Resultados: ");
                cm.exibir();
                cs.exibir();
            }
        }
        System.out.println("Fim");
        s.close();
    }

    private static boolean comandos(int valor, FonteDeDados dados, VisualizadorDeMedia cm, VisualizadorDeSomatorio cs) {
        switch (valor) {
            case -1:
                cm.setAtivo(!cm.isAtivo());
                System.out.println("Visualizador de Média " + (cm.isAtivo() ? "Ativado" : "Desativado"));
                return true;
            case -2:
                cs.setAtivo(!cs.isAtivo());
                System.out.println("Visualizador de Somatório " + (cs.isAtivo() ? "Ativado" : "Desativado"));
                return true;
            case -3:
                var novoCm = new VisualizadorDeMedia();
                dados.registarObservador(novoCm);
                System.out.println("Novo Visualizador de Média Adicionado");
                return true;
            case -4:
                var novoCs = new VisualizadorDeSomatorio();
                dados.registarObservador(novoCs);
                System.out.println("Novo Visualizador de Somatório Adicionado");
                return true;
            default:
                return false;
        }
    }
}