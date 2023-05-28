package org.mario.process.transform;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.mario.model.common.AboCollection;
import org.mario.model.processed.ProcessedItem;
import org.mario.model.processed.ProcessedModel;
import org.mario.model.processed.ProcessedProduct;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mario.process.utils.Utils.readFile;

public class Input {
	
	public List<List> readFiles(String inputFolder) throws IOException {
		
		Gson gson = new Gson();
		Transform transform = new Transform();
		ObjectMapper objectMapper = new ObjectMapper();
		
		File folder = new File(inputFolder);
		File[] files = folder.listFiles();
		
		List<List> returnList = new ArrayList<>();
		
		List<ProcessedItem> itemList = new ArrayList<>();
		List<ProcessedModel> modelList = new ArrayList<>();
		List<ProcessedProduct> productList = new ArrayList<>();
		
		for (File file : files) {
			String individualSourceFilePath = inputFolder.replaceAll("src/.*/resources/", "");
			String individualSourceFileName = individualSourceFilePath + "/" + file.getName();
			String inputString = readFile(individualSourceFileName, this.getClass());
			List<Map> mapList = gson.fromJson(inputString, List.class);
			for (Map map : mapList) {
				if (map != null) {
					AboCollection aboCollection = transform.parseRaw(objectMapper, map);
					itemList.add(aboCollection.getProcessedItem());
					modelList.add(aboCollection.getProcessedModel());
					productList.add(aboCollection.getProcessedProduct());
				}
			}
		}
		
		returnList.add(itemList);
		returnList.add(modelList);
		returnList.add(productList);
		
		return returnList;
	}
}
