package com.sparkbyexamples.spark.dataframe

import org.apache.spark.sql.SparkSession

object FromCSVMultiline extends App {

  val spark:SparkSession = SparkSession.builder()

    .getOrCreate()


  val df = spark.read
    .option("header",true)
    .option("delimiter",",")
    .option("multiLine",true)
    .option("quotes","\"")
    .csv("src/main/resources/address-multiline.csv")

  df.show(false)
}









