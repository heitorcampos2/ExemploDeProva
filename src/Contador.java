public class Contador {
    int contador;
    boolean i;
  //  *************  
    void incrementar(){
        contador++;
        i = true;
        System.out.println("Contador = "+contador);
    }
  //  *************
    void desfazer(){
        if(i){
            contador--;
            i = false;
            System.out.println("Contador -1 = "+contador);
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
