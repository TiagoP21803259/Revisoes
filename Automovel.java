public class Automovel {
    String marca;
    String modelo;
    String matricula;
    int cilindrada;

    public Automovel(){

    }

    public Automovel (String marca, String modelo, String matricula, int cilindrada){
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.cilindrada=cilindrada;
    }

    public String toString (){
        return "Marca: " + marca + "/ Modelo: " + modelo + "/ Matricula: " + matricula + "/ Cilindrada: " + cilindrada;
    }
}
