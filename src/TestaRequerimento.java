public class TestaRequerimento {
    public static void main(String[] args){
        Requerimento b = new Requerimento();
        //        
        Data b1 = new Data();
        b1.dia = "01";
        b1.mes = "05";
        b1.ano = "2019";
        //
        Aluno a2 = new Aluno();
        a2.nome = "Zeca Silva";
        a2.cpf = "023.123.123-12";
        a2.rg = "MG-00.010.000";
        //
        b.mostra();
        b.informarTipo("Burro");
    }
}
