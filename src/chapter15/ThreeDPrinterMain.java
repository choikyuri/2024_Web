package chapter15;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		/*
		//���1
		ThreeDPrinter printerPowder=new ThreeDPrinter();
        Powder p1=new Powder();
        System.out.println(p1);
        printerPowder.setMaterial(p1);
        
        //���2
        Powder p2=(Powder)printerPowder.getMaterial();
        System.out.println(p2); 
        */
		
		//���1
		ThreeDPrinter printerPlastic=new ThreeDPrinter();
		Plastic p3=new Plastic();
        System.out.println(p3);
        printerPlastic.setMaterial(p3);
        
        //���2
        Plastic p4=(Plastic)printerPlastic.getMaterial();
        System.out.println(p4); 
		
		
	}

}
