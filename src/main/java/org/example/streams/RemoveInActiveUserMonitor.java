package org.example.streams;

import java.util.ArrayList;
import java.util.List;

public class RemoveInActiveUserMonitor {
    public static void main(String[] args) {

        List<RemoveInActiveUser> inActiveUsers = new ArrayList<>();

        inActiveUsers.add(new RemoveInActiveUser("Alice", 25, Status.ACTIVE));
        inActiveUsers.add(new RemoveInActiveUser("Bob", 30, Status.INACTIVE));
        inActiveUsers.add(new RemoveInActiveUser("Charlie", 28, Status.INACTIVE));
        inActiveUsers.add(new RemoveInActiveUser("Diana", 22, Status.ACTIVE));
        inActiveUsers.forEach(user ->
                System.out.println(user.getName() + " - " + user.getStatus()));

        System.out.println("remove in-active user only");

        inActiveUsers.removeIf(removeInActiveUser -> removeInActiveUser.getStatus().name().equals(Status.INACTIVE.name()));

        System.out.println("after removing in-active user");
        System.out.println(inActiveUsers);
    }
}
