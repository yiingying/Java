
public class TypeConversion {
	public static final double MY_CONST=6.89;
	public void operate() {
		char mychar='h';
		byte mybyte=6;
		int myint=100;
		long mylong=89L;
		float myfloat=8.77f;
		double mydouble=6.99;
		int tcint=mychar+myint;//mychar�Զ�ת��Ϊint���ͺ�������
		long tclong=mylong-tcint;//tcint�Զ�ת��Ϊlong���ͺ�������
		float tcfloat=mybyte*myfloat;//mybyte�Զ�ת��Ϊfloat��������
		//tcint�Զ�ת��Ϊfloat���ͺ�����tcfloat/tcint�����Ϊfloat����
		//tcfloat/tcint�Ľ���Զ�ת��Ϊdouble���ͺ�������
		double tcdouble=tcfloat/tcint+mydouble;
		System.out.println("tcint="+tcint);
		System.out.println("tclong="+tclong);
		System.out.println("tcfloat="+tcfloat);
		System.out.println("tcdouble="+tcdouble);
		tcint=(int)tcdouble;//��tcdoubleǿ��ת��Ϊint���ͺ�������
		System.out.println("tcint="+tcint);
		//��MY_CONST��mycharǿ��ת��Ϊint���ͺ�������
		tcint=(int)MY_CONST+(int)mychar;
		System.out.println("tcint="+tcint);
		
	}
}
