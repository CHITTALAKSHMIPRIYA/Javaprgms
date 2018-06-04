
package com.bridgelabz.ObjectOrientedPrograms.Commercialdataprocessing;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompanyShareHolding {
	LinkedList<CompanyShares> list= new LinkedList<CompanyShares>();
	ArrayList<CompanyShares> ShareList=new ArrayList<CompanyShares>();
	/**
	 * @return the list
	 */
	public LinkedList<CompanyShares> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(LinkedList<CompanyShares> list) {
		this.list = list;
	}
	/**
	 * @return the shareList
	 */
	public ArrayList<CompanyShares> getShareList() {
		return ShareList;
	}
	/**
	 * @param shareList the shareList to set
	 */
	public void setShareList(ArrayList<CompanyShares> shareList) {
		ShareList = shareList;
	}

}
