public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", 101, 8.0, 7.5);
        Aluno aluno2 = new Aluno("João", 102, 5.0, 6.0);

        System.out.println("📋 Dados dos alunos:");
        aluno1.mostrarDados();
        aluno2.mostrarDados();

        System.out.println("✏ Atualizando nota de João...");
        aluno2.setNotaAv2(8.5);

        aluno2.mostrarDados();

        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
    }

}
