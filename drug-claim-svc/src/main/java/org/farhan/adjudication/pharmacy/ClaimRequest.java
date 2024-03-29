package org.farhan.adjudication.pharmacy;

import org.farhan.adjudication.admin.Member;
import org.farhan.adjudication.admin.MemberFactory;

public class ClaimRequest {

	private double theDrugCost = 0.0;
	private Member theFamily = null;
	private double theCoInsurance = 0.0;
	private double theDeductible = 0.0;
	private double theCoPayment = 0.0;
	private double theDispenseFee = 0.0;
	private double theMaximum = 200.0;
	private String theDIN = "";
	private String theProvider = "";
	private String theCertificate = "";

	public void setDrugCost(String drugCost) {
		theDrugCost = Double.valueOf(drugCost);
	}

	public void setFamily(String family) {
		theFamily = MemberFactory.get(family);
	}

	public double getDrugCost() {
		return theDrugCost;
	}

	public void setCoInsurance(String coinsurance) {
		theCoInsurance = Double.valueOf(coinsurance);
	}

	public void setDeductible(String deductible) {
		theDeductible = Double.valueOf(deductible);
	}

	public double getDeductible() {
		return theDeductible;
	}

	public double getCoInsurance() {
		return theCoInsurance;
	}

	public void setCoPayment(String coPayment) {
		theCoPayment = Double.valueOf(coPayment);
	}

	public double getCoPayment() {
		return theCoPayment;
	}

	public void setDispenseFee(String dispenseFee) {
		theDispenseFee = Double.valueOf(dispenseFee);
	}

	public double getDispenseFee() {
		return theDispenseFee;
	}

	public void setMaximum(String maximum) {
		theMaximum = Double.valueOf(maximum);
	}

	public double getMaximum() {
		return theMaximum;
	}

	public void setDIN(String din) {
		theDIN = din;
	}

	public String getDIN() {
		return theDIN;
	}

	public void setProvider(String provider) {
		theProvider = provider;
	}

	public String getProvider() {
		return theProvider;
	}

	public String getCertificate() {
		return theCertificate;
	}

	public void setCertificate(String certificate) {
		theCertificate = certificate;
	}
}
