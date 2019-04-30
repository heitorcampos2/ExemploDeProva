public class TestaContador {
    public static void main(String[] args){
        Contador a = new Contador();
        a.contador = 0;
        a.i = true;
        
        a.incrementar();
        
        a.incrementar();
        
        a.desfazer();
    }
    
}
