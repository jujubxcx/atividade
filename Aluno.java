public class Aluno {
    // Atributos
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    // Construtor
    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNotaAv1() {
        return notaAv1;
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public double getNotaAv2() {
        return notaAv2;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }

    // Mostrar os dados do aluno
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
        System.out.println("Média: " + calcularMedia());
        System.out.println("----------------------");
    }

    // Calcular a média
    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;
    }

    // Verificar aprovação (Regra: média >= 7 está aprovado, senão reprovado)
    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("✅ O aluno " + nome + " foi APROVADO com média " + media);
        } else {
            System.out.println("❌ O aluno " + nome + " foi REPROVADO com média " + media);
        }
    }
}