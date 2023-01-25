package com.acts.queue;

public interface QueueInterface {
	public boolean isEmpty();
	public boolean isFull();
	public void add(int insert) throws QueueFullException;
	public int delete() throws QueueEmptyException;
	public String toString();
}
