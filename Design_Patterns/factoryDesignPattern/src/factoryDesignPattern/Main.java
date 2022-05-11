package factoryDesignPattern;


public class Main {

	public static void main(String[] args) {
		
		String file =FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL).export("Test Content");
		System.out.println(file);
	}

}
// birden fazla noktada kullanmak yerine factory method ile buradaki base kısım oluşturup(FileExporterFactory)
// bunun içinde oluşturuyoruz base kısmı ve artık tek yerden  kullanım işimizi kolaylaştırıyor.
// farklı value değerleri alsa bile tek yerden düzenleme yapılarak entegre rahat şekilde yapılabilir.

//pdfexporter ya da excelexporter kullanmaya çalışıldığı durumda çalışmaz direkt factory üzerinden kullanabilir 
//sadece onun üzerinden çağırabiliriz.