package org.farhan.objects.pharmacy.post;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Scanner;

import org.farhan.common.PharmacyPost;
import org.farhan.objects.pharmacy.ClaimRequest;
import org.junit.jupiter.api.Assertions;

public class ClaimRequestImpl extends PharmacyPost implements ClaimRequest {

	public void setDrugCost(HashMap<String, String> keyMap) {
		addParamter("Drug Cost", keyMap.get("Drug Cost"));
	}

	public void setFamily(HashMap<String, String> keyMap) {
		addParamter("Family", keyMap.get("Family"));
	}

	public void transition() {
		try {
			URLConnection connection = new URL(url).openConnection();
			InputStream response = connection.getInputStream();
			Scanner scanner = new Scanner(response);
			responseBody = scanner.nextLine();
			scanner.close();
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}

	@Override
	public void setCoInsurance(HashMap<String, String> keyMap) {
		addParamter("CoInsurance", keyMap.get("Co-Insurance"));
	}

	@Override
	public void setDeductible(HashMap<String, String> keyMap) {
		addParamter("Deductible", keyMap.get("Deductible"));
	}

	@Override
	public void setCoPayment(HashMap<String, String> keyMap) {
		addParamter("CoPayment", keyMap.get("Co-Payment"));
	}

	@Override
	public void setDispenseFee(HashMap<String, String> keyMap) {
		addParamter("DispenseFee", keyMap.get("Dispense-Fee"));
	}

	@Override
	public void setMaximum(HashMap<String, String> keyMap) {
		addParamter("Maximum", keyMap.get("Maximum"));
	}

	@Override
	public void setDIN(HashMap<String, String> keyMap) {
		addParamter("DIN", keyMap.get("DIN"));
	}
}
