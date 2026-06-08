public class Pessoa {
    // criando as propriedades / atributos
    String nome;
    float peso, altura;

    // métodos (funcionalidade)
    public void Respirar() {
        System.out.println("A pessoa " + this.nome + " está respirando");
    }

    public void Comer() {
        System.out.println("A pessoa " + this.nome + " está comendo!");
    }

    public void Falar() {
        System.out.println("A pessoa " + this.nome + " está falando!");
    }
}
