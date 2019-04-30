public class Aluno {
    String nome;
    String cpf;
    String rg;
    Data dataDeNascimento;
    
    void mostrarAluno(){
        System.out.println("Nome: "+nome);
        System.out.println("cpf: "+cpf);
        System.out.println("RG: "+rg);
        System.out.println("Data: "+dataDeNascimento);
    }
}
