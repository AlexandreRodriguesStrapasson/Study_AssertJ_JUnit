package br.ifsp.edu;

public class Lamp {
    int cont;

    boolean IA;
    boolean IB;
    boolean FA;
    boolean FB;

    public void switchStateOfLamps() {
        if (IB != FB){
            IB = !IB;
            IA = !IA;
            cont++;
        }
        if (IA != FA){
            IA = !IA;
            cont++;
        }
    }
}
