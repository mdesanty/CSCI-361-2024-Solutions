package assignments.sets_and_maps;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FacebookLikeManager manager = new FacebookLikeManager(args[0]);

        System.out.println("All users: " + manager.getAllUsers());

        System.out.println("Users that like Mike: " + manager.getLikes("Mike"));
        System.out.println("Users that like Kristen: " + manager.getLikes("Kristen"));
        System.out.println("Users that like Bill: " + manager.getLikes("Bill"));
        System.out.println("Users that like Sara: " + manager.getLikes("Sara"));

        System.out.println("Users that are liked by Kristen: " + manager.getLikedBy("Kristen"));
        System.out.println("Users that are liked by Sara: " + manager.getLikedBy("Sara"));
        System.out.println("Users that are liked by Nate: " + manager.getLikedBy("Nate"));
        System.out.println("Users that are liked by Anthony: " + manager.getLikedBy("Anthony"));
        System.out.println("Users that are liked by Randy: " + manager.getLikedBy("Randy"));
        System.out.println("Users that are liked by Mike: " + manager.getLikedBy("Mike"));
        System.out.println("Users that are liked by John: " + manager.getLikedBy("John"));
        System.out.println("Users that are liked by Steve: " + manager.getLikedBy("Steve"));
        System.out.println("Users that are liked by Bill: " + manager.getLikedBy("Bill"));

        /*
         * Expected output:
         *
         * All users: [Nate, Mike, Anthony, Steve, Kristen, Randy, Bill, John, Sara]
         * Users that like Mike: [Kristen, Sara, Nate, Anthony, Randy]
         * Users that like Kristen: [Mike, John, Steve, Bill]
         * Users that like Bill: [Sara, Nate]
         * Users that like Sara: [Nate, Anthony]
         * Users that are liked by Kristen: [Mike]
         * Users that are liked by Sara: [Mike, Bill]
         * Users that are liked by Nate: [Mike, Bill, Sara]
         * Users that are liked by Anthony: [Mike, Sara]
         * Users that are liked by Randy: [Mike]
         * Users that are liked by Mike: [Kristen]
         * Users that are liked by John: [Kristen]
         * Users that are liked by Steve: [Kristen]
         * Users that are liked by Bill: [Kristen]
         */
    }
}
