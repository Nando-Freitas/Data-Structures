//Time complexity: O(n)
//Auxiliary space: O(1)

class Array1 {

    public static void main(String[] args){

        //Declaring an integer array
        int[] numbers;

        //Alocating memory to numbers's array
        numbers = new int[20];

        //Declaring an integer array and alocating memory to it
        //This is an literal array
        int[] goodNumbers = new int[]{1, 2, 3, 0};

        //Iterating each element of an array
        for(int i = 0; i < goodNumbers.length; i++){
            System.out.println("Index: " + i + " has element " + goodNumbers[i]);
        }
    }

}