public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;
  
    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }
  
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

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
        System.out.println("Média: " + calcularMedia());
        System.out.println("----------------------");
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("✅ O aluno " + nome + " foi APROVADO com média " + media);
        } else {
            System.out.println("❌ O aluno " + nome + " foi REPROVADO com média " + media);
        }
    }
}
