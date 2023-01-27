// 1 - Pacote
package intro;

// 2 - Referencia as bibliotecas


// 3 - Classes

;

public class Medidas {
  // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        //Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software.

       String opcao = "ifSimples";

       switch (opcao){
            case "IfSimples":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "curto":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "extenso":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
        }





    }
}


