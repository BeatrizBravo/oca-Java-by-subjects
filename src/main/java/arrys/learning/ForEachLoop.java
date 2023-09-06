package arrys.learning;

public class ForEachLoop {
    public static void main(String[] args) {
        // for(DATATYPE VaribleName : COLLECTION){BODY}
        String[] names = {"Jimmy", "John", "Tom", "Anthony"};

        for(int i = 0; i < names.length; i++) {
            System.out.println("name= " + names[i]);
        }

        for(String name : names) {
            System.out.println("name= " + name);
        }

        for(String name : names) {
            name = name + " " + name; // never use, out of scope.
        }

        for(String name : names) {
            System.out.println("name= " + name);
        }

        StringBuilder[] builders = {   //no inmutable
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };

        for(StringBuilder builder : builders) {
            System.out.println(builder);         //For ;   Loop
        }

        for(StringBuilder builder : builders) {
            builder.append("123");
        }

        for(StringBuilder builder : builders) {
            System.out.println(builder);           //For123 ;  Loop123. Each builder get append 123
        }

        String pets = "Parrot";

//        for(String pet : pets) {} // does not compile   // It's just STRING, no array - String [] pets = {"Parrot"};

//        for(int name : names) {} // does not compile  //names is String type no int

        for(char c : pets.toCharArray()) { // convertimos la cadena en una matriz de caracteres  e imprime cada letra, c.
            System.out.println(c); //P;a;r;r;o;t
        }
    }
}

