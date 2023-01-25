package com.acts.queue;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of queue");
		int size=sc.nextInt();
		CircularQueue queue=new CircularQueue(size);
		do
		{
			System.out.println("******Menu******");
			System.out.println("1. add");
			System.out.println("2. delete");
			System.out.println("3. is Empty");
			System.out.println("4. is Full");
			System.out.println("5. print all elements in queue");
			System.out.println("0. exit");
			
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter number");
				int num=sc.nextInt();
				try
				{
					queue.add(num);
				}
				catch (QueueFullException qf)
				{
					System.out.println(qf.getMessage());
					break;
				}
				break;
				
			case 2:
				try
				{
					num=queue.delete();
					System.out.println(num);
				}
				catch(QueueEmptyException qe)
				{
					System.out.println(qe.getMessage());
					break;
				}
				break;
				
			case 3:
				System.out.println(queue.isEmpty());
				break;
				
			case 4:
				System.out.println(queue.isFull());
				break;
				
			case 5:
				System.out.println(queue.toString());
				break;
				
			case 0:
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(choice!=0);
		sc.close();
	}
}

