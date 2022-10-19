/*
//(Bir tablo yazdırın) Aşağıdaki tabloyu görüntüleyen bir program yazın. Kayan nokta sayılarını tam sayılara dönüştürün.
//a^b sonucunu verecek biçimde tablo oluşturun. (1`den 5`e kadar olan sayıların 2'den 6'ya kadar olacak biçimde üstleri alınacak.)


a 		b 		pow(a, b)
1 		2 		1
2 		3 		8
3 		4 		81
4 		5 		1024
5 		6 		15625

*/

public class Exercise_02_18 

{
	
	public static void main(String[] args) {
	//MertUp	
		int a, b;
		System.out.println("a        b        pow(a, b)");
		a = 1;
		b = 2;
					//burada bırakılan boşluk tablo biçimi oluşturmak içindir
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		a++;
		b++;
					//burada bırakılan boşluk tablo biçimi oluşturmak içindir
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		a++;
		b++;
					//burada bırakılan boşluk tablo biçimi oluşturmak içindir
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		a++;
		b++;
					//burada bırakılan boşluk tablo biçimi oluşturmak içindir
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		a++;
		b++;
					//burada bırakılan boşluk tablo biçimi oluşturmak içindir
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		
	}
}
