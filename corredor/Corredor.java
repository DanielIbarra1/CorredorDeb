package corredor;


public class Corredor {
    
    private int energia;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public int verificarEnergia(){
        if(energia <= 0){
            energia = 0;
        }
        else if(energia >=100){
            energia = 100;
        }
        return energia;
    }
    
    public void energiaCero(){
        if(energia ==0){
            System.out.println("La energia es de 0, tomo 220V :) .");
        }
    }
    
    public int recargarEnergia(int recarga){
        energia += recarga;
        if(energia <= 0){
            energia = 0;
        }
        else if(energia >=100){
            energia = 100;
        }
        return energia;
    }
    
    public int correr(){
        energia-=9;
       if(energia <= 0){
           energia =0;
       }
        return energia;
    }
    
    public int entrenar(){
        energia+=15;
        if(energia <= 0){
            energia = 0;
        }
        else if(energia >=100){
            energia = 100;
        }
        return energia;
    }
    public int energiaAgotada(){
        if(energia < 10){
            energia =0;
            return energia;
        }
        else{
            return energia;
        }
    }
}