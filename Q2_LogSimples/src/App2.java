public class App2 {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();

        log.log("Mensagem de CADA UM POR SI");

        for(String m:log){
            System.out.println(m);
        }
    }
}
