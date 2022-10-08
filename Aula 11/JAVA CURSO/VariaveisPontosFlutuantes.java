public class VariaveisPontosFlutuantes{

    public static void main (String [] args){

        double valorDaPassagem = 2.90;
        float valorDoTomate = 6.34F;
        // Sempre usar o F no final do flouat
        System.out.println ("Valor da Passagem = " + valorDaPassagem);
        System.out.println ("Valor do Tomate = " + valorDoTomate);
        // mesmo valor que d1, mas em notação científica para o double

    }
}

//*int decVal = 26;
//int hexVal = 0x1a;
//int octVal - 032;
//int binVal = 0b11010; // JDK 7

// Curiosidade: sempre usar
//long creditCardNumber = 1234_5678_9012_3456L;
//long cpf: 101_134_156_68L;
//float pi = 3.14_15F;
//long hexBytes = 0xFF_EC_DE_5E;
//long hexWords = 0XCAFE_BABE;
//long maxLong = 0x7fff_ffff_ffff_ffffL;
//nybbles = 0b0010_0101;
//long bytes = 0b11010010_01101001_10010100_10010010;
// Não pode colocar underscore perto de ponto
//float pi1 = 3_.1415F;
// não pode colocar underscore perto de ponto 
//float pi2 = 3.1415F;
// não pode colocar underscore perto de sufixos (L)
//long cpf = 101_134_156_68_L;
// indentificador, não é literal
//int x1 = _52;
// OK (decimal literal)
//int x2 = 5_2;
// Não pode colocar underscore no final de um literal 
//int x3 = 52_;
// OK (decimal literal)
//int x4 = 5____2;
//  Não pode colocar underscore perto de prefixos (0x)
//int  x5 = 0_x52;
// Não pode colocar underscore no começo de números
//int  x6  =  0x_52;
// OK (hexacimal literal)
//int x7 = 0x5_2;
// Não pode colocar underscore no final de números 
//*int x8 = 0x52




