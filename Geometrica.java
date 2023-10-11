import java.lang.Math;

public class Geometrica implements IClassMedia{
    public double CalculaMedia(double a, double b){
        return Math.sqrt(a*b);
    }
    
    public String Situacao(double m){
        if (m > 7){
            return "APROVADO!!!";
        }
        return "REPROVADO!!!";
    }
}