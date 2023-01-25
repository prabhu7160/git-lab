package com.acts.queue;

public class QueueEmptyException extends Exception
{
	public QueueEmptyException(String message)
	{
		super(message);
	}
}
