public class Main {
    public static void main(String[] Args){
        Funcionario f1 = new Funcionario("Lucas", 3000.0, Cargo.GERENTE);
        Funcionario f2 = new Funcionario("Carla", 5000.5, Cargo.DIRETOR);

        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        double salarioBonus = f1.calculaSalarioBonus();
        System.out.println(salarioBonus);

        System.out.println(f2.getNome());
        System.out.println(f2.getSalario());
        double salarioBonus2 = f2.calculaSalarioBonus();
        System.out.println(salarioBonus2);
    }
}
