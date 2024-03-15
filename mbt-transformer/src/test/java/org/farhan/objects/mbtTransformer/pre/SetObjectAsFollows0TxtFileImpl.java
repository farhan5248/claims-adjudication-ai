package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtTransformer.SetObjectAsFollows0TxtFile;

public class SetObjectAsFollows0TxtFileImpl extends FileObject implements SetObjectAsFollows0TxtFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
