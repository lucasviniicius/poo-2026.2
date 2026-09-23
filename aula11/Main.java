package aula11;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("Vinicius");

        System.out.println(nomes);
        System.out.println(nomes.get(0));
    }
}