import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import java.util.Arrays;

public class WordC{
    public static void main(String[] args) {

        SparkConf SparkConf = new SparkConf().setMaster("local").setAppName("Java WordCount");

        JavaSparkContext sparkContext = new JavaSparkContext(SparkConf);
        JavaRDD<String> input = sparkContext.textFile("F:/words.txt");
        JavaRDD<String> fmap = input.flatMap(content -> Arrays.asList(content.split(" ")));



    }
}


