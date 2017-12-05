package jp.ac.uryukyu.ie.ex3.pair28;
public class ExDice extends Dice{
    private int minValue;
    private int maxValue;

public ExDice(int minValue,int maxValue){
	super();
	this.minValue = minValue;
	this.maxValue = maxValue;
    }
    public void play(){super.setValue((int)(Math.random()*(maxValue-minValue+1))+minValue);
    }
}
	
 