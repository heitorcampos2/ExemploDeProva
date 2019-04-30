public class TestaAluno {
    public static void main(String[] args){
        Aluno a = new Aluno();
        a.nome = "Fulaninho";
        a.cpf = "123.123.123-12";
        a.rg = "MG-11.000.000";
        
        a.mostrarAluno();
                
        Data a1 = new Data();
        a1.dia = "29";
        a1.mes = "04";
        a1.ano = "2019";
        
        a1.mostrar();
    }
}
