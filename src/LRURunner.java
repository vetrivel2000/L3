import lru.LRUCache;

import java.util.Scanner;

public class LRURunner {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("DataStructure for LRU Cache Implementation:");
        System.out.println("Enter your size:");
        int size=scan.nextInt();
        LRUCache object=new LRUCache(size);
        int choice;
        do{
            System.out.println("Enter your choice:\n1.Insert\n2.Get Press any other keys to exit");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter your key and value for insert in your cache");
                    int key=scan.nextInt();
                    int value=scan.nextInt();
                    object.put(key,value);
                    System.out.println("SuccessfullyInserted");
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the key you want to search");
                    int searchKey= scan.nextInt();
                    System.out.println("The value of key "+searchKey+" is "+object.get(searchKey));
                    break;
                }
                default:
                {
                    System.out.println("No such choice!!");
                    break;
                }
            }
        }while(choice<3);
    }
}
