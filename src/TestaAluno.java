public class TestaAluno {
    public static void main(String[] args){
        Aluno a = new Aluno();
        a.nome = "Fulaninho";
        a.cpf = "123.123.123-12";
        a.rg = "MG-11.000.000";
        
        a.dataDeNascimento = new Data();
        a.dataDeNascimento.dia = "20";
        a.dataDeNascimento.mes = "12";
        a.dataDeNascimento.ano = "1995";
        
        a.mostrarAluno();
        
    }
}
