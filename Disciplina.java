public class Disciplina{
    private IClassMedia CalcMedia;
    private double Media;
    private String Nome;
    private double P1;
    private double P2;
    private String Situacao;

    public void setP1(double P1){
        this.P1 = P1;
    }

    public void setP2(double P2){
        this.P2 = P2;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public double getP1(){
        return this.P1;
    }

    public double getP2(){
        return this.P2;
    }

    public double getMedia(){
        return this.Media;
    }

    public String getSituacao(){
        return this.Situacao;
    }

    public Disciplina(IClassMedia oper){
        this.CalcMedia = oper;
    }

    public void CalcularMedia(){
        this.Media = CalcMedia.CalculaMedia(this.P1, this.P2);
        this.Situacao = CalcMedia.Situacao(this.Media);
    }
}