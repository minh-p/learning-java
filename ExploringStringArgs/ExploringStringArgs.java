// basically, printing out string args
// args gets the command-line arguments; supplied in string arrays. therefore "String[]"

/*
Example:

$ java ExploringStringArgs thisArgumentNonSyntax
>>> thisArgumentNonSyntax
*/

// We need to provide String[] args as that is how java was designed.
// In other cases; like C#, it is optional.

class ExploringStringArgs {
    public static void main(String[] args) {
        // non-surprisingly, loop like c
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
