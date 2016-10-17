package pencilLab;

public class PencilTester {

	public static void main(String args[]){
		Pencil bluePencil = new Pencil("blue", true);
		Pencil redPencil = new Pencil("red", false);
		bluePencil.write();
		bluePencil.infoSharp();
		redPencil.infoSharp();
		
	}
}
