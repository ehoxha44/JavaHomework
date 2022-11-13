import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Drejtimet drejtimi1 = new Drejtimet("FIEK", "Kompjuterike");
        Drejtimet drejtimi2 = new Drejtimet("FNA", "Arkitekture");
        Drejtimet drejtimi3 = new Drejtimet("FIEK", "TIK");
        Drejtimet drejtimi4 = new Drejtimet("FIEK", "Robotike");

        ArrayList<Drejtimet> drejtimet = new ArrayList<Drejtimet>();
        drejtimet.add(drejtimi1);
        drejtimet.add(drejtimi2);
        drejtimet.add(drejtimi3);
        drejtimet.add(drejtimi4);

//        drejtimi1.shtypDrejtimin();
//        drejtimi2.shtypDrejtimin();

        Fakulteti fakulteti = new Fakulteti(12345, "FIEK", drejtimet);
        Fakulteti fakulteti1 = new Fakulteti(12346, "FNA" , drejtimet);

//        fakulteti.shtypDetajet();
//        fakulteti1.shtypDetajet();

        fakulteti.drejtimetNeFakultet("FNA");
        fakulteti.gjejFakultetinNeBazeTeDrejtimit("Arkitekture");

        fakulteti1.drejtimetNeFakultet("FIEK");
        fakulteti1.gjejFakultetinNeBazeTeDrejtimit("Kompjuterike");
    }
}

class Fakulteti {
    int id;
    String emri;
    ArrayList<Drejtimet> drejtimet;

    public Fakulteti (int id, String emri, ArrayList<Drejtimet> drejtimet){
        this.id = id;
        this.emri = emri;
        this.drejtimet = drejtimet;
    }

    public void shtypDetajet(){
        System.out.println(this.id + "-" + this.emri + ", drejtimet: ");
        for (Drejtimet drejtimet: this.drejtimet){
            drejtimet.shtypDrejtimin();
        }
    }

    public void gjejFakultetinNeBazeTeDrejtimit(String drejtimi) {
        for (Drejtimet drejtimet: this.drejtimet) {
            if (drejtimet.drejtimi.equals(drejtimi)){
                drejtimet.shtypFakultetin();
            }
        }
    }

    public void drejtimetNeFakultet(String emri) {
        for (Drejtimet drejtimet: this.drejtimet){
            if (drejtimet.emri.equals(emri)){
                drejtimet.shtypDrejtimin();
            }
        }
    }
}

class Drejtimet {
    String emri;
    String drejtimi;

    public Drejtimet (String emri, String drejtimi){
        this.emri = emri;
        this.drejtimi = drejtimi;
    }

    public void shtypDrejtimin(){
        System.out.printf("%s - %s \n", this.emri, this.drejtimi);
    }

    public void shtypFakultetin(){
        System.out.println(this.emri);
    }
}

//class MenaxhoListenFakulteteve {
//    ArrayList<Drejtimet> drejtimet;
//
//    public MenaxhoListenFakulteteve(){
//        this.drejtimet = new ArrayList<Drejtimet>();
//    }
//
//    public Drejtimet drejtimetNeFakultet(String emri){
//        for (Drejtimet drejtimet: this.drejtimet){
//            if (drejtimet.emri.equals(emri)) {
//                return drejtimet;
//            }
//        }
//        return null;
//    }
//
//    public Drejtimet gjejeFakultetinNeBazeTeDrejtimit(String drejtimi){
//        for (Drejtimet emri: this.drejtimet){
//            if (emri.drejtimi.equals(drejtimi)){
//                return emri;
//            }
//        }
//        return null;
//    }
//}


//class Drejtimet {
//    String drejtimi;
//    String fakulteti;
//
//    public Drejtimet(String drejtimi, String fakulteti){
//        this.drejtimi = drejtimi;
//        this.fakulteti = fakulteti;
//    }
//
//    public void shtypFakultetDrejtim(){
//        System.out.printf("%s - %s \n", this.fakulteti, this.drejtimi);
//    }
//}
//
//class Fakulteti {
//    String id;
//    String emri;
//    ArrayList<Drejtimet> drejtimi;
//
//    public Fakulteti (String id, String emri, ArrayList<Drejtimet> drejtimi) {
//        this.id = id;
//        this.emri = emri;
//        this.drejtimi = drejtimi;
//    }
//
//    public Drejtimet drejtimetNeFakultet(String emri){
//        for (Drejtimet emri: )
//    }
//
//    public void shtypDetajet(){
//        System.out.printf("%s - %s - %s \n", this.id, this.emri, this.drejtimi);
//    }
//
//    public Drejtimet gjejeFakultetinNeBazeTeDrejtimit(String drejtimi){
//        for (Drejtimet fakulteti: this.drejtimi) {
//            if (fakulteti.drejtimi.equals(drejtimi)) {
//                return fakulteti;
//            }
//        }
//        return null;
//    }
//}
