
public class ArithmaticOperator {
	public void operate() {
		float afloat=2.0f,bfloat=10.0f;
		double adouble=5.2;
		int mint=20,nint=10;
		byte xbyte=3,ybyte=4;
		long rlong=80L;
		System.out.println(afloat+bfloat);
		//��������������float���ͣ�������Ҳ��float����
		System.out.println(afloat-mint);
		//������afloat��float���ͣ�mint��int���ͣ������float����
		System.out.println(xbyte*ybyte);
		//��������������byte���ͣ������int����
		System.out.println(rlong/ybyte);
		//������rlong��long���ͣ�ybyte��byte���ͣ������long����
		System.out.println(mint/afloat);
		//������mint��int���ͣ�afloat��float���ͣ������float����
		System.out.println(mint%nint);
		//��������������int���ͣ������int����
		System.out.println(adouble%afloat);
		//������adouble��double���ͣ�afloat��float���ͣ������double����
		System.out.println((++afloat)+(bfloat--));
		//������afloat��ǰ������1��bfloat�Ǻ����Լ�1�������float����
		System.out.println((mint++)*(nint--));
		//mint�Ǻ�������1��nint��ǰ���Լ�1�������int����
	}
}
