public class TestaRequerimento {
    public static void main(String[] args){
        Requerimento b = new Requerimento();
        //     
        Aluno a = new Aluno();
        a.nome = "Fulaninho";
        a.cpf = "123.123.123-12";
        a.rg = "MG-11.000.000";
        
        b.descricao="dependencias";
        
        a.dataDeNascimento = new Data();
        a.dataDeNascimento.dia = "20";
        a.dataDeNascimento.mes = "12";
        a.dataDeNascimento.ano = "1995";
        //
        b.mostraReq();
        b.informarTipo("Burro");
    }
}
