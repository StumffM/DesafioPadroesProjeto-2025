public class App2 {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();

        log.log("Mensagem de FUDEU DE VEZ");

        for(String m:log){
            System.out.println(m);
        }
    }
}
