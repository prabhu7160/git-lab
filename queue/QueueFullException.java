package com.acts.queue;

public class QueueFullException extends Exception
{
	public QueueFullException(String message)
	{
		super(message);
	}
}
