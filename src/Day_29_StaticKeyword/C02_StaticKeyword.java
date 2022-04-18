package Day_29_StaticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {
        // başka clastaki static class üyelerine ulaşabilmek için sadece
        // classIsmi.staticUyeIsmi yazmamız yeterli

        System.out.println(C01_Static.okulTelefonu);//3122553635
        C01_Static.okulTelefonu="31233344455";
        System.out.println(C01_Static.okulTelefonu);// 31233344455
 // Baska classdaki static olmayan class üyelerine
        // ancak o classdan obje oluşturarrak ulaşabiliriz.
        //ve obje ile yapılan atamalar sadece o obje için geçerli olur.
  C01_Static obj1= new C01_Static();
  C01_Static obj2= new C01_Static();
        System.out.println(obj2.okulIsmi); // yıldız kolaje
        obj2.okulIsmi="sabır Koleji";
        System.out.println(obj1.okulIsmi);// Yıldız Koleji

    }
        }
