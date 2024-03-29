package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbtTransformer.SetObjectAsFollowsGraphFile;

public class SetObjectAsFollowsGraphFileImpl extends GraphFileObject implements SetObjectAsFollowsGraphFile {

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertGraphModelExists();
	}

	@Override
	public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap) {
		assertEdgesEdgeNameExists(keyMap.get("Edge Name"));
	}

	@Override
	public void assertVerticesSectionVertexName(HashMap<String, String> keyMap) {
		assertVerticesVertexNameExists(keyMap.get("Vertex Name"));
	}

}
