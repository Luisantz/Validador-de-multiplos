void main() {

    var scanner = new Scanner(System.in);

    //titulo
    System.out.println("Validador de multiplos");

    //Solicita um numero
    System.out.println("\nInforme um número:");
    var numero1 = scanner.nextInt();

    //Solicita o segundo número - ignora numeros menores que o primeiro - verifica se é multiplo
    while (true){
        System.out.println("\nInforme outro número:");
        var numero2 = scanner.nextInt();

        if (numero2 < numero1){
            System.out.println("Número ignorado (Digite um numero maior que o primeiro!)");
            continue;
        }
        if (numero2 % numero1 != 0){
            System.out.printf("O número %s não é multiplo de %s.",numero2,numero1);
            break;
        }
         else {
            System.out.printf("Número válido! o %s é multiplo de %s.",numero2,numero1);
        }
    }
    scanner.close();
}

