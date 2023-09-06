package arrys.learning;

public class BreakStatement {

    /*
    optionalLabel -reference to head loop-    :      while (boolelanExpression){body & break optonalLabel;}
     check line 32 to 46*/

    public static void main(String[] args) {


//        myLabel:  // can not be in an assignation, only in custom BLOCK  defiend by curly bracest
//        int[] myArray = {1, 2, 3};   //not a statement It's a assing

        myLabel:
        {
            int[] myArray = {1, 2, 3};
        }







        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for(String animal : animals) {
            System.out.println(animal);  //all the list
        }

        MY_LOOP: for(String animal: animals) {
            if(animal.equals("Cat")) {
                break MY_LOOP;
            }

            System.out.println(animal);//dog
        }

        //------------------------------------------
        //confuse: label and local variable same name
        animal: for(String animal : animals) {
            if(animal.equals("Cat")) {
                break animal;
            }

            System.out.println(animal);
        }

        for(String animal : animals) {
            if(animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);  //dog; cat
        }

        //same as line 50
        int index = 0;  //define
        while(index < animals.length) {
            String animal = animals[index];

            if(animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);
            index++;// increment to avoid infinite loop
        }
    }
}
