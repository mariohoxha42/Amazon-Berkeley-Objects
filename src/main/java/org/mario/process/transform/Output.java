package org.mario.process.transform;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.mario.model.raw.AboCoreMetadata;

import java.util.List;

public class Output {
	public void splitOutputs(List<List> masterList, String savePath) {
		SparkSession spark = SparkSession.builder().master("local")
				.appName("App")
//				.config("spark.some.config.option", "some-value")
				.getOrCreate();
		for (List list : masterList) {
			String processedPath = savePath.replace("generated", "processed");
			Class<? extends AboCoreMetadata> listClass = (Class<? extends AboCoreMetadata>) list.get(0).getClass();
			Dataset<Row> listDf = spark.createDataFrame(list, listClass);
			String className = listClass.getName().replace(listClass.getPackageName() + ".", "") + "Df";
			String fullSavePath = processedPath + "/" + className + ".txt";
			listDf.toJavaRDD().map(Row::toString).saveAsTextFile(fullSavePath);
		}
	}
}