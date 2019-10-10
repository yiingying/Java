
public class ArithmaticOperator {
	public void operate() {
		float afloat=2.0f,bfloat=10.0f;
		double adouble=5.2;
		int mint=20,nint=10;
		byte xbyte=3,ybyte=4;
		long rlong=80L;
		System.out.println(afloat+bfloat);
		//两个操作数都是float类型，结果结果也是float类型
		System.out.println(afloat-mint);
		//操作数afloat是float类型，mint是int类型，结果是float类型
		System.out.println(xbyte*ybyte);
		//两个操作数都是byte类型，结果是int类型
		System.out.println(rlong/ybyte);
		//操作数rlong是long类型，ybyte是byte类型，结果是long类型
		System.out.println(mint/afloat);
		//操作数mint是int类型，afloat是float类型，结果是float类型
		System.out.println(mint%nint);
		//两个操作数都是int类型，结果是int类型
		System.out.println(adouble%afloat);
		//操作数adouble是double类型，afloat是float类型，结果是double类型
		System.out.println((++afloat)+(bfloat--));
		//操作数afloat是前置自增1，bfloat是后置自减1，结果是float类型
		System.out.println((mint++)*(nint--));
		//mint是后置自增1，nint是前置自减1，结果是int类型
	}
}
