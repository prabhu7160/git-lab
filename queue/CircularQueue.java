package com.acts.queue;

public class CircularQueue implements QueueInterface
{
	private int front;
	private int rear;
	private int queue[];
	private int size;
	
	public CircularQueue(int size)
	{
		front=0;
		rear=0;
		queue=new int[size];
		this.size=size;
	}
	
	public boolean isEmpty()
	{
		if (front == rear)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if ((rear+1)%size==front)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void add(int insert) throws QueueFullException
	{
		if (isFull())
		{
			QueueFullException qf=new QueueFullException("queue is full");
			throw qf;
		}
		else
		{
			rear=(rear+1)%size;
			queue[rear]=insert;
		}
	}
	
	public int delete() throws QueueEmptyException
	{
		if (isEmpty())
		{
			QueueEmptyException qe=new QueueEmptyException("queue is empty");
			throw qe;
		}
		else
		{
			front=(front+1)%size;
			return queue[front];
		}
	}
	
	public String toString()
	{
		StringBuffer sb=new StringBuffer("");
		int i=(front+1)%size;
		while(i!=rear)
		{
			sb.append(queue[i]+" ");
			i=(i+1)%size;
		}
		sb.append(queue[i]+" ");
		String allElements=sb.toString();
		return allElements;
	}
}
