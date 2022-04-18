package Day_27_constructur;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1= new Toyota();
        System.out.println(t1.marka);//Toyota
        System.out.println(t1.TelerAdedi);//4
        System.out.println(t1.model);//null
        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yil=2022;
        System.out.println("t1 model:" + t1.model+
                ", yakıt:  " + t1.yakit);
        t1.maxHiz();
    Toyota t2=new Toyota();
        System.out.println(t2.model);// null
        t2.model="Yaris";
        t2.yakit="Benzin";
        t2.yil=2022;
        System.out.println("t2 model:" + t2.model+
                ", yakıt:  " + t2.yakit);
        t2.renkTercihleri();
    }
}
