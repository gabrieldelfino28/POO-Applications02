package view;

import controller.ContrataIntegral;
import controller.ContrataParcial;
import controller.ContrataTemp;
import controller.IContratacao;

public class Main {

    public static void main(String[] args) {
        IContratacao cIntegral = new ContrataIntegral();
        IContratacao cParcial = new ContrataParcial();
        IContratacao cTemp = new ContrataTemp();

        System.out.println(cIntegral.contratarFunc());
        System.out.println(cParcial.contratarFunc());
        System.out.println(cTemp.contratarFunc());
    }
}
