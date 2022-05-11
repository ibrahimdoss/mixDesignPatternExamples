package factoryDesignPattern;

class ExcelExporter implements FileExporter {

	@Override
	public String export(String content) {
		
		return "Excel -> " + content;
	}

}

//public kısmını silerek sadece bu pakette gizlemiş oluyoruz.
// kimsenin erişmesine izin vermiyoruz.