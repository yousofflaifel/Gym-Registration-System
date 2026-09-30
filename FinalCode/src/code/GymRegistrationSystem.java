package code;

import java.util.Scanner;

public class GymRegistrationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Queue_LinkedList queue = new Queue_LinkedList();

        int choice;

        do {

            System.out.println("\n*** Gym Registration System ***");
            System.out.println();
            System.out.println("1. Register new member");
            System.out.println("2. Remove registered member");
            System.out.println("3. Print registered members (sorted)");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice -> ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter member name: ");
                    String name = input.nextLine();

                    System.out.print("Enter member age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter member phone number: ");
                    String phone = input.nextLine();

                    Member member = new Member(name, age, phone);

                    queue.enqueue(member);

                    System.out.println("Member registered successfully.");

                    break;

                case 2:

                    try {

                        queue.dequeue();

                        System.out.println(
                            "First registered member removed successfully."
                        );

                    } catch (IllegalAccessError e) {

                        System.out.println("Error: " + e.getMessage());

                    }

                    break;

                case 3:

                    Member[] members = queue.getMembers();

                    quickSort(members, 0, members.length - 1);

                    System.out.println("\nRegistered Members (sorted by age):");

                    for (int i = 0; i < members.length; i++) {

                        System.out.println(members[i]);

                    }

                    break;

                case 4:

                    System.out.println("Exiting the system...");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }


    static int partition(Member[] members, int low, int high) {

        int pivot = members[high].age;

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (members[j].age <= pivot) {

                i++;

                Member temp = members[i];

                members[i] = members[j];

                members[j] = temp;
            }
        }

        Member temp = members[i + 1];

        members[i + 1] = members[high];

        members[high] = temp;

        return i + 1;
    }


    static void quickSort(Member[] members, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(members, low, high);

            quickSort(members, low, pivotIndex - 1);

            quickSort(members, pivotIndex + 1, high);
        }
    }
}