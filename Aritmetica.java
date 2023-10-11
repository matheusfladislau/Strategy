public class Aritmetica implements IClassMedia{
    public double CalculaMedia(double a, double b){
        return (a+b)/2;
    }

    public String Situacao(double m){
        if (m > 5){
            return "APROVADO!!!";
        }
        return "REPROVADO!!!";
    }
}