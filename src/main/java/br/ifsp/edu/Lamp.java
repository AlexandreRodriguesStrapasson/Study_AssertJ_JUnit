package br.ifsp.edu;

public class Lamp {
    int cont;

    boolean initialStateOfLampA;
    boolean initialStateOfLampB;
    boolean finalStateOfLampA;
    boolean finalStateOfLampB;

    public void switchStateOfLamps() {
        if (initialStateOfLampB != finalStateOfLampB){
            swtichStateOfAandB();
            cont++;
        }
        if (initialStateOfLampA != finalStateOfLampA){
            switchStateOfA(initialStateOfLampA);
            cont++;
        }
    }

    private void swtichStateOfAandB() {
        initialStateOfLampB = !initialStateOfLampB;
        initialStateOfLampA = !initialStateOfLampA;
    }

    private void switchStateOfA(boolean initialStateOfLampA) {

        initialStateOfLampA = !initialStateOfLampA;
    }
}
