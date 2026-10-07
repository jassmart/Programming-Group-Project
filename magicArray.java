public class magicArray {

    public static void main(String[] args) {
    //Begin by listing our variables and magic number to the main
        int[] numbers = {10, 5, 7, 5, 12, 5};
        int magicNumber = 5;
    //The first loop  used in a regular for loop and not an enhanced for loop. I need to access i to change the 5's to 0's
        System.out.println("Before:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    //This takes the returned value from the method and placed them into a completely new array. We repeat the process from the first loop here.
        int[] newArray = magicReplace(numbers, magicNumber);

        System.out.println("\nAfter:");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    } 
 
    //This method compares the numbers in the first loop to our magic number. It states that if the array number is equal to the magic number, then set it to 0.
    public static int[] magicReplace(int[] theArray, int magicNumber) {
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] == magicNumber) {
                theArray[i] = 0;
            }
        }
        return theArray;
    }
    
}
