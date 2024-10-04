package com.sparkbyexamples.spark

import org.apache.spark.sql.SparkSession

trait SparkSessionWrapper {
  lazy val spark: SparkSession = {
    SparkSession
      .builder()
      .config("spark.sql.shuffle.partitions", "1")
      .getOrCreate()
  }
}
