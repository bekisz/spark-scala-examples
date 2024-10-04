package com.sparkbyexamples.spark.dataframe.examples

import org.apache.spark.sql.SparkSession

object DataFrameEmptyCheck extends App {

  val spark:SparkSession = SparkSession.builder()
    .getOrCreate()

  val df = spark.emptyDataFrame

  println(df.isEmpty)
  println(df.rdd.isEmpty())
  println(df.head())
  println()
}
