package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.UMLFileObject;
import org.farhan.objects.mbtTransformer.BlahObjectPageStepsJavaFile;

public class BlahObjectPageStepsJavaFileImpl extends UMLFileObject implements BlahObjectPageStepsJavaFile {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
