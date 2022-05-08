package interviewQuestions6;

import java.util.*;

public class Q04_MapTask {
    public static void main(String[] args) {
        // PART 1
// create a map with groupName as key and groupMembers as value
// "Group1" = ["Member1", "Member2"]
// "Group2" = ["Member3", "Member4", "Member5"]
// BÖLÜM 1
// anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
// "Grup1" = ["Üye1", "Üye2"]
// "Grup2" = ["Üye3", "Üye4", "Üye5"]
        HashMap<String , ArrayList<String>> grupisimVeUyeler=new HashMap<>();
        ArrayList<String>devTeam=new ArrayList<>(Arrays.asList("Abdullah", "Kutay", "Selim"));
        ArrayList<String>QATeam =new ArrayList<>(Arrays.asList("Salih", "Selma", "Sema"));
        grupisimVeUyeler.put("Development Team", devTeam);
        grupisimVeUyeler.put("QA Team", QATeam);
        System.out.println(" 20 grupisimVeUyeler = " + grupisimVeUyeler);

// PART 2
// find how many members each group has
// BÖLÜM 2
// her grubun kaç üyesi olduğunu bul
        //Bolum2
        //1.yol -> value lardan giderek

        Collection<ArrayList<String>> values = grupisimVeUyeler.values();
        for (ArrayList<String> kisi:values
        ) {
            System.out.println(kisi.size()); // ikisi icin de 3

            System.out.println(" ");
        }

        //2.yol -> key lerden giderek
    // grupisimVeUyeler  = {QA Team=[Salih, Selma, Sema], Development Team=[Abdullah, Kutay, Selim]}
    // keys              = grupisimVeUyeler.keySet    = [QA Team, Development Team]
    // each              = keys                       = QA Team
    // value             = grupisimVeUyeler.get(each) = ([Salih, Selma, Sema])

        Set<String> keys = grupisimVeUyeler.keySet(); //keySet() key leri set olarak dondurur
        for (String each :keys
        ) {
            ArrayList<String> value =grupisimVeUyeler.get(each);
            System.out.println("gruptaki uye sayisi :" + each + " " + value.size());
            //                  gruptaki uye sayisi :   QA Team           3
            //                  gruptaki uye sayisi : Development Team    3
        }
    }
}
