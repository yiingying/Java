public class Bitmanipulation{
    public void operate(int aint,int bint){
        System.out.println("左操作数为："+aint);
        System.out.println("左操作数的负数为："+(-aint));
        System.out.println("左操作数按位取反："+(~aint));
        System.out.println("右操作数为："+bint);
        System.out.println("右操作数的负数："+(-bint));
        System.out.println("右操作数按位取反："+(~bint));
        System.out.println("按位与操作op1&op2:"+(aint&bint));
        System.out.println("按位或操作op1|op2:"+(aint|bint));
        System.out.println("按位异或操作op1^op2:"+(aint^bint));
        System.out.println("带符号左移op2位为："+(aint<<bint));
        System.out.println("带符号右移op2位为："+(aint>>bint));
        System.out.println("无符号右移op2位为："+(aint>>>bint));
        System.out.println("(~op1)无符号右移op2位位："+((~aint)>>>bint));
    }
}