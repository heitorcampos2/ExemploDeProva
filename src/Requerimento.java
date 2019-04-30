public class Requerimento {
    Data dataRequerimento;
    Aluno aluno;
    String tipo;
    String descricao;
    Data data;
    
    void mostra(){
        aluno.mostrarAluno();
        data.mostrar();
    }
    
    void informarTipo(String a){
        tipo = a;
        System.out.println("Tipo: "+tipo);
    }
    
}
