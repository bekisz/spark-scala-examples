package com.sparkbyexamples.spark.dataframe

import org.apache.spark.sql.{DataFrame, SparkSession}

object SaveDataFrame {

  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder()
      .getOrCreate()

    val filePath = "C://000_Projects/opt/BigData/zipcodes.csv"

    var df:DataFrame = spark.read.option("header","true").csv(filePath)

    df.repartition(5).write.option("header","true").csv("c:/tmp/output/df1")
  }
}
