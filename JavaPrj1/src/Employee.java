
public class Employee {
   private int Eno;
   private String Ename;
   private String Edesg;
   private String Edept;
   
   public Employee()
   {
	   Eno=101;
	   Ename=new String("Sasi");
	   Edesg=new String("Dev");
	   Edept=new String("Prod");
   }
   public void dispEmp()
   {
	   System.out.print("Eno =" + Eno);
	   System.out.println("Ename ="+ Ename);
	   System.out.println("Desg ="+ Edesg);
   }
   public static void main(String[] s)
   {
	   Employee e1=new Employee();
	   e1.dispEmp();
   }
}
