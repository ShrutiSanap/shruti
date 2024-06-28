package Project3;

public class executor {
	
	public static void main(String[] args) {
		
		Base b1 =new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		
		b1.methodPrivate();
		
		b1.varProtected=21;
		b1.methodProtected();
		
		b1.varPublic=345;
		b1.methodPublic();
		
		System.out.println(b1 instanceof Base);
		
		Person p=new Person();
		System.out.println(p instanceof Person );
	}

}
