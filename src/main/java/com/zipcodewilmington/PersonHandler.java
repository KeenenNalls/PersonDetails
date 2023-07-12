package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // create a `counter`
        // while `counter` is less than length of array
        while (counter < personArray.length){
            // begin loop
            Person currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
            counter++;

        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int counter = 0;
        // identify terminal condition
        Person[] array = personArray;
        int terminalCondition = array.length;
        // identify increment
        int increment = 1;

        // use the above clauses to declare for-loop signature
        for (counter = 0; counter < terminalCondition; counter += increment) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            Person currentPerson = array[counter];
            String stringRepresentation = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += stringRepresentation;


            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        Person[] array = personArray;
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        for (Person currentPerson : array) {
            // begin loop
            // get `string Representation` of `currentPerson`
            String stringRepresentation = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += stringRepresentation;
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
