
// Program to check for command line arguments
class Name {
    public static void main(String[] args)
    {
        // check if length of args array is
        // greater than 0
        if (args.length > 0) {
            System.out.println(
                "Enter a Text:");

 

            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("Enter a text "
                            + "arguments found.");
    }
}
 


