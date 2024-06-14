public class Main {

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Meaverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        System.out.println("Nota do file: " + notaDoFilme);

        // Média calculada pelas três notas
        /*
        Esse é uma outra forma de comentar dentro do código
         */
        double media = (9.8 + 6.3 + 8.0)/ 3;
        System.out.println(media);

        String  sinopse;
        sinopse = """
                Filme de aventura com galã dos anos 80
                """;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);
    }

}