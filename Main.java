public class Main {
    public static void main(String[] args) {
        // Criando dois alunos
        Aluno aluno1 = new Aluno("Maria", 101, 8.0, 7.5);
        Aluno aluno2 = new Aluno("João", 102, 5.0, 6.0);

        // Mostrando os dados iniciais
        System.out.println("📋 Dados dos alunos:");
        aluno1.mostrarDados();
        aluno2.mostrarDados();

        // Atualizando a nota de João
        System.out.println("✏ Atualizando nota de João...");
        aluno2.setNotaAv2(8.5);

        // Mostrando dados atualizados
        aluno2.mostrarDados();

        // Verificando aprovação
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
    }
}