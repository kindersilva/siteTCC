/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
    	Conta conta = new Conta();
        // Inicializacao da conta
    	conta.inicializaConta(1000, "123","Eduardo", 123, 32);
        // Impressao dos dados da conta
    	conta.imprimeDados();
        // Saque da conta
    	conta.saque(1200);
        // Impressao dos dados da conta
    	conta.imprimeDados();
    	conta.saque(300);
    	conta.imprimeDados();
        // Deposito em conta
    	conta.deposito(800);
        // Impressao dos dados da conta
    	conta.imprimeDados();
    }
}
