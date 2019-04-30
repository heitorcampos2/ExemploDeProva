public class Contador {
    int contador;
    boolean i;
  //  *************  
    void incrementar(){
        contador++;
        i = true;
    }
  //  *************
    void desfazer(){
        if(i){
            contador--;
            i = false;
        }else{
            System.out.println("Erro");
        }
    }
  //  *************  
    int getvalor(){
        return contador;
    }
  //  *************  
}
