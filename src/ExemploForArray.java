public class ExemploForArray {
    public static void main(String[] args){
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //variavel inicializada em 0 porque o array começa em 0!
        for (int x=0; x <alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        //forma eficiente
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
