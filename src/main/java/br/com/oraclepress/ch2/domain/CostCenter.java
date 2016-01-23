package br.com.oraclepress.ch2.domain;

import br.com.oraclepress.ch2.Employed;

public class CostCenter {
	
	private String costCenterNumber;
	private Manager[] managers;
	
	public String getCostCenterNumber() {
		return costCenterNumber;
	}
	
	public void setCostCenterNumber() {
		this.costCenterNumber = costCenterNumber;
	}
	
	public Manager[] getManagers() {
		return managers;
	}
	
	public void setManagers(Manager[] managers) {
		this.managers = managers;
	}

}