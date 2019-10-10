
public class TypeConversion {
	public static final double MY_CONST=6.89;
	public void operate() {
		char mychar='h';
		byte mybyte=6;
		int myint=100;
		long mylong=89L;
		float myfloat=8.77f;
		double mydouble=6.99;
		int tcint=mychar+myint;//mychar自动转化为int类型后再运算
		long tclong=mylong-tcint;//tcint自动转化为long类型后再运算
		float tcfloat=mybyte*myfloat;//mybyte自动转化为float后再运算
		//tcint自动转化为float类型后运算tcfloat/tcint，结果为float类型
		//tcfloat/tcint的结果自动转化为double类型后再运算
		double tcdouble=tcfloat/tcint+mydouble;
		System.out.println("tcint="+tcint);
		System.out.println("tclong="+tclong);
		System.out.println("tcfloat="+tcfloat);
		System.out.println("tcdouble="+tcdouble);
		tcint=(int)tcdouble;//将tcdouble强制转化为int类型后再运算
		System.out.println("tcint="+tcint);
		//将MY_CONST和mychar强制转化为int类型后再运算
		tcint=(int)MY_CONST+(int)mychar;
		System.out.println("tcint="+tcint);
		
	}
}
