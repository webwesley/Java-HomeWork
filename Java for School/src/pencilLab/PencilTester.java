package pencilLab;

public class PencilTester {

	public static void main(String args[]){
		Pencil bluePencil = new Pencil("blue", true);
		Pencil redPencil = new Pencil("red", false);
		bluePencil.write();
		bluePencil.infoSharp();
		redPencil.infoSharp();
		bluePencil.sharpen();
		bluePencil.write();
		bluePencil.sharpen();
		redPencil.write();
		bluePencil.setColor("green");
		bluePencil.write();
		System.out.println(bluePencil.toString());
		System.out.println(redPencil.toString());
		bluePencil.sharpen();
		redPencil.write();
		bluePencil.sharpen();
		bluePencil.write();
		bluePencil.sharpen();
		redPencil.infoSharp();
		bluePencil.write();
		bluePencil.sharpen();
		System.out.println(bluePencil.toString());
		System.out.println(redPencil.toString());
		
		
	}
}
