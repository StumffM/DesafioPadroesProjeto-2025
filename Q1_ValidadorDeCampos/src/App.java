public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        var validador = new Validador();

        if (validador.validaEmail.valida( email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }

        String numero = "23200784-9";
        if (validador.valida(Validador.Tipo.INTEIRO, numero)){
            System.out.println(numero+" é um inteiro válido!");
        }else{
            System.out.println(numero+" não é um inteiro válido!");
        }

        if (validador.valida(Validador.Tipo.MATRICULA, numero)){
            System.out.println(numero+" é um matricula válido!");
        }else{
            System.out.println(numero+" não é um matricula válido!");
        }
    }

}
