package chapter15;

public class GenericPrinterMain {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> printerPowder=new GenericPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		Powder powder=printerPowder.getMaterial();
		System.out.println(powder);
		powder.doprinting();
		
		System.out.println();
		
		GenericPrinter<Plastic> printerPlastic=new GenericPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic=printerPlastic.getMaterial();
		System.out.println(plastic);
		plastic.doprinting();
		
		System.out.println();
		/*
		GenericPrinter<Water> printerWater=new GenericPrinter<Water>();
		printerWater.setMaterial(new Water());
		Water water=printerWater.getMaterial();
		System.out.println(water);
		*/
		
		Water water=new Water();
		water.doprinting();
		

	}

}
