class vari{
	static int x=10;
	int y=20;
	public static void main(String[] args){
		vari v1=new vari();
		vari v2=new vari();
		System.out.println("SINCE Y IS AN INSTANCE VARIABLE IT CANNOT BE ACCESSED DIRECTLY");
		System.out.println("v1.y = "+v1.y);
		System.out.println("v2.y = "+v2.y);
		System.out.println();
		System.out.println("X value can be accessed directly");
		System.out.println("x = "+x);
		System.out.println();
		System.out.println("INSTANCE VARIABLES CAN BE UPDAYED ONLY USING OBJECTS(INSTANCES)");
		System.out.println("SINCE IT CREATES DIFFERENT COPIES UPDATION USING ONE INSTANCE CANNOT AFFECT OTHER COPY");
		System.out.println("HERE WE UPDATED Y IN TWO COPIES LIKE : v1.y = 30 and v2.y = 40");
		v1.y=30;
		v2.y=40;
		System.out.println("v1.y = "+v1.y);
		System.out.println("v2.y = "+v2.y);
		System.out.println("statc variable can be updated directly, using class, using instances or objects");
		System.out.println();
		System.out.println("DIRECT UPDATION X=45");
		x=45;
		System.out.println("v1.x = "+v1.x);
		System.out.println("v2.x = "+v2.x);
		System.out.println();
		System.out.println("UPDATE USING CLASS vari.x=55");
		vari.x = 55;
		System.out.println("v1.x = "+v1.x);
		System.out.println("v2.x = "+v2.x);
		System.out.println();
		System.out.println("UPDATE USING OBJECTS OR INSTANCES v1.x=60 or v2.x=60");
		v1.x=60;
		System.out.println("v1.x = "+v1.x);
		System.out.println("v2.x = "+v2.x);
		
	}
}