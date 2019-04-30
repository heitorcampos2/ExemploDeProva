public class Requerimento {
    Data dataRequerimento;
    Aluno aluno;
    String tipo;
    String descricao;
    Data data1;
    
    void mostraReq(){
        aluno.mostrarAluno();
        System.out.println("Descrição: "+descricao);
    }
    
    void informarTipo(String a){
        tipo = a;
        System.out.println("Tipo: "+tipo);
    }
    
}
