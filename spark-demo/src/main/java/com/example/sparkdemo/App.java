package com.example.sparkdemo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	SparkConf conf=new SparkConf().setAppName("Spark Demo").setMaster("local[*]");
    	JavaSparkContext javaSparkContext = new JavaSparkContext(conf);
    	JavaRDD<String> textFile = javaSparkContext.textFile("Downloads/spark_demo.txt");
    	long count = textFile.count();
    	System.out.println("Number of lines in file: "+count);
    	javaSparkContext.close();
        System.out.println( "Hello World!" );
    }
}
