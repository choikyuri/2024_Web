package chapter15;

public class ThreeDPrinter {
	
	private Object material;

	//���
	public Object getMaterial() {
		return material;
	}
    //�Է�
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "ThreeDPrinter [material=" + material + "]";
	}
	
	
	
	

}
