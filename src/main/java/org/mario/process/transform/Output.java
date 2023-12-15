package org.mario.process.transform;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.mario.model.raw.AboCoreMetadata;

import java.util.ArrayList;
import java.util.List;

public class Output {
	public void splitOutputs(List<List> masterList, String savePath) {
//		SparkSession sparkSession = SparkSession.builder()
//				.master("local")
//				.appName("Spark Session Example")
//				.getOrCreate();
//		SQLContext sqlContext = sparkSession.sqlContext();
		List<Dataset<Row>> finalList = new ArrayList<>();
		for (List list : masterList) {
			String processedPath = savePath.replace("generated", "processed");
			Class<? extends AboCoreMetadata> listClass = (Class<? extends AboCoreMetadata>) list.get(0).getClass();
//			Dataset<Row> listDf = sqlContext.createDataFrame(list, listClass);
			String className = listClass.getName().replace(listClass.getPackageName() + ".", "") + "Df";
			String fullSavePath = processedPath + "/" + className + ".txt";
//			finalList.add(listDf);
//			System.out.println(listDf);
		}
	}
}