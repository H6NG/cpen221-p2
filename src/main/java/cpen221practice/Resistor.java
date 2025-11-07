package cpen221practice;

class Resistor {
    int colorCode(String color) {
        String[] list = {"black",
                "brown",
                "red",
                "orange" ,
                "yellow" ,
                "green" ,
                "blue" ,
                "violet" ,
                "grey" ,
                "white"
        };

        int index =0;

        for(int i=0; i < list.length; i++) {

            if(list[i].equals(color)){
                return i;
            }
        }

        return index;
    }

    String[] colors() {
        String[] list = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        return list;
    }
}
