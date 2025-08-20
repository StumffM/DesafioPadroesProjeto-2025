public class Validador{
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    public interface Ivalidador{
        boolean valida(String valor);
    }

    public class validaEmail implements Ivalidador{
        public static boolean valida(String valor){
            int posA = valor.indexOf('@');
                int posPt = valor.indexOf('.');
                if (posA <= 0 || posPt <= 0) return false;
                return true;
        }
    }

    public class validaInteiro implements Ivalidador{
        public boolean valida(String valor){
            for(int i=0;i<valor.length();i++){
                    if (!Character.isDigit(valor.charAt(i))){
                        return false;
                    }
                }
                return true;
        }
    }

    public class validaMatricula implements Ivalidador{
        public boolean valida(String valor){
            int sum = 0;
                for(int i=0;i<valor.length()-1;i++){
                        sum += Character.getNumericValue(valor.charAt(i));
                    }
                    int verificador = sum%10;
                    if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                        return true;
                    }
                return false;
        }

    }

    /*
    public boolean valida(Tipo tipo,String valor){
        switch(tipo){
            case INTEIRO:
                for(int i=0;i<valor.length();i++){
                    if (!Character.isDigit(valor.charAt(i))){
                        return false;
                    }
                }
                return true;
            case MATRICULA:
                if (!valida(Tipo.INTEIRO,valor)){
                    return false;
                }else{
                    int sum = 0;
                    for(int i=0;i<valor.length()-1;i++){
                        sum += Character.getNumericValue(valor.charAt(i));
                    }
                    int verificador = sum%10;
                    if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                        return true;
                    }
                }
                return false;
            case EMAIL:
                int posA = valor.indexOf('@');
                int posPt = valor.indexOf('.');
                if (posA <= 0 || posPt <= 0) return false;
                return true;
            default:
                return false;
        }
    }
        */
}