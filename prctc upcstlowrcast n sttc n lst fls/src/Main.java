public class Main {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c= new Child();
        ///////////////////////////////////////////////////////////////////////////// upcasting
        System.out.println("////////////////////////////Parent pc =new Child()//////upcasting");
        Parent pc =new Child();
        pc.greeting();
        pc.working();
        System.out.println("pc parent lol vrbl eqwls "+pc.pnonsttcage);
        System.out.println("pc parent age vrbl eqwls "+pc.pSTATICAGE);
        System.out.println("////////////////////////////now pc sees prnt vrbls , methds n ovrdn chld mehtods");
        System.out.println("\n");/////////////////////////////////////////////////// lower cast

        System.out.println("////////////////////////////Child c =(Child) pc////lowercasting");      //lowercasting smlr to inhrtnc
        Child cp =(Child) pc;
        cp.greeting();
        cp.playing();
        cp.working();
        System.out.println("c child fun vrbl eqwls "+cp.fun);
        System.out.println("c child fun vrbl from prnt eqwls "+cp.pnonsttcage);
        System.out.println("c child fun vrbl from prnt eqwls "+cp.pSTATICAGE);
        System.out.println("////////////////////////////now cp sees chld vrbls , methds n prnt mehtods");
        System.out.println("\n");/////////////////////////////////////////////////// static n nonsttc///////// sttc vrbl if chng in clss or obj will chng in all


        System.out.println("parent class sttc vrbl eqwls "+Parent.pSTATICAGE);
//      System.out.println("parent class non sttc vrbl eqwls "+Parent.lol);  //cant acces class non sttc vrbl in sttc mthod only objj
        System.out.println("parent objct sttc vrbl eqwls "+p.pSTATICAGE);
        System.out.println("parent objct sttc vrbl eqwls "+p.pnonsttcage);  //can acces obj non sttc vrbl in sttc mthod


        ////////////////////if chld extends prnt there must be cnstrctr and vrbls inshlztn in parent only and the chld cnstrctr must call the prnt cnstrctr usng super
        //two clss implmnt intrfc,n sttc mrthod take intrfc rfrnc as prmtr ,psasing 2 diff classes to mthod and having two diff implmntnts
        //(4 clss ;bird,hen,chick,plane,plane n chick implmnt flyable intrfce n hen n chick extend bird
    }
}