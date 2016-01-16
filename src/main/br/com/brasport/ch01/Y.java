package br.com.brasport.ch01;

class Y extends X {
	
	public String validar(int a, int y){
		System.out.println("validar() da classe Filho");
		return new String("Retorno covariante da método sobreposto da classe Pai validar()");
	}
	
	public static void main(String[] args) {
		Y y = new Y();
		System.out.println(y.validar(10,20));
		
		X x = new X();
		System.out.println(x.validar(30,40));
		
		//Aqui é lançado um ClassCastException, pois o compilador sabe que "Y É-UM X"
		//Mas não pode garantir ao contrário. Como a variaável x referencia diretamente a
		//uma instância da classe X, não é possível realizar o downcast em tempo de execução.
		//y = (Y) x;
		//System.out.println(y.validar(50,60));
		
		//Aqui ocorre o cast implicito automático, pois atribuindo a referencia y a uma referencia
		//x, o cast passa no teste "É-UM", vê que a classe Y possui uma versão sobrecarregada do
		//método verificar e chama na referencia de X a versão declarada em Y
		x = y;
		System.out.println(x.validar(10,20));
	}
}