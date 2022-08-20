//// ########## lesson_8 git exercise_1 ##########
// 1. Объединить улицу, парк (дом) в родителя Measurable, сделать универсальный расширяемый массив для Measurable
package lesson8.home.work.exercise1;

public class TownElement {

    public int townElementObjectLength;
    private Object[] townElement = null;

    public void addNewTownElement (Object townElement) {
        if (this.townElement == null) {
            Object[] newTownElement = new Object[1];
            newTownElement[0] = townElement;
            this.townElement = newTownElement;
        }
        else {
            Object[] newTownElement  = new Object[this.townElement.length + 1];
            for (int i = 0; i < this.townElement.length; i++) {
                newTownElement[i] = this.townElement[i];
            }
            newTownElement[this.townElement.length] = townElement;
            this.townElement = newTownElement;
        }
        this.townElementObjectLength++;
    }

    public float getTownElementsArea() {
        if (this.townElement == null){
            return 0;
        }
        else {
            float townElementsArea = 0;
            for(int i = 0; i < townElement.length; i++){
                Object townElement = this.townElement[i];
                if (townElement != null){
                    townElementsArea += this.townElement[i].getTownElementArea();
                }
            }
            return townElementsArea;
        }
    }

}