package com.mouritech.chainofresponsibulityPattrens;

public interface Chain {
	public void setNext(Chain nextInChain);
	public void process(Number request);
}
