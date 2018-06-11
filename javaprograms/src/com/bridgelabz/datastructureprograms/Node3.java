/**
 * 
 */
package com.bridgelabz.datastructureprograms;

/**
 * @author bridgelabz
 *
 */
public class Node3 {
	protected Object data;
	protected Node3 link;
	
public Node3()
{
  link=null;
  data=0;
}
public Node3(Object d,Node3 n)
{
	data=d;
	link=n;
}
/*function to set link to next node*/
public void setLink(Node3 n)
{
	link=n;
}
/*function to set data to current node*/
public void setData(String d)
{
	data=d;
}
/*function to get data from current node*/
public Object getData()
{
	return data;
}
/*function to get link to next node*/
public Node3 getLink()
{
	return link;
}

}
