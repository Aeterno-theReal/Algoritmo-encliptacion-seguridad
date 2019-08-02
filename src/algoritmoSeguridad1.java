
public class algoritmoSeguridad1 {

	static String encriptacion(String cadena, int n)
	{
		String resultado="";
		int aux=-1;
		char nuevoCaracter;
		char[] a = cadena.toCharArray();
		
		if(n>26)
			n=n%26;
		
		for(int i=0; i<cadena.length(); i++)
		{
			aux=(int)a[i];
			if(aux+n>122)
			{
				aux=aux+n;
				aux=aux-26;
			}
			else
			{
				aux=aux+n;
			}
			nuevoCaracter=(char)aux;
			resultado=resultado + nuevoCaracter;
		}
		return resultado;
	}
	
	static String desencriptar(String cadena, int n)
	{
		String resultado="";
		int aux=-1;
		char nuevoCaracter;
		char[] a = cadena.toCharArray();
		
		if(n>26)
			n=n%26;
		
		for(int i=0; i<cadena.length(); i++)
		{
			aux=(int)a[i];
			if(aux-n<97)
			{
				aux=aux-n;
				aux=aux+26;
			}
			else
			{
				aux=aux-n;
			}
			nuevoCaracter=(char)aux;
			resultado=resultado + nuevoCaracter;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String cadena="";
			String encriptado="";
			int metodo=-1;
			
			cadena=args[0];
			metodo=Integer.parseInt(args[2]);
			
			System.out.println("Valor original de la cadena: " + args[0]);//nos muestra el valor original de la cadena
			
			if(args[1].equals("1"))
			{
				encriptado=encriptacion(cadena, metodo);
			}
			else
				if(args[1].equals("2"))
				{
					encriptado=desencriptar(cadena, metodo);
				}
				else
					System.out.println("Error!, se ha producido un error en los argumentos de entrada [CÓDIGO ENCRIPTAR/DESENCRIPTAR ERRÓNEO].");
			

			System.out.println("Valor encriptado: " + encriptado);//para mostrarnos la cadena encriptada
			System.out.println("Valor de tipo encriptacion: " + args[1]);
			System.out.println("Valor del modo de encriptar: " + args[2]);

	}

}
