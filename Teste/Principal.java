class Principal {
	public static void main(String[] args) {
        Casa minhaCasa = new Casa ();
	    
        minhaCasa.tipoChamine = "chaminĂ© do tipo XPTO";
	    minhaCasa.Janela = "Quadrada";
	
	    minhaCasa.abrirJanela();
        minhaCasa.fecharPorta();

        System.out.println (minhaCasa.tipoChamine);

    }
}
