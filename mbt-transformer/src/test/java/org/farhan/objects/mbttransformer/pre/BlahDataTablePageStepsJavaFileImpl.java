package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.UMLFileObject;
import org.farhan.objects.mbttransformer.BlahDataTablePageStepsJavaFile;

public class BlahDataTablePageStepsJavaFileImpl extends UMLFileObject implements BlahDataTablePageStepsJavaFile {
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}