/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DatabaseConfig;

/**
 * CustomerConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T09:38:48.154-05:00")
public class CustomerConfig {
  @SerializedName("aliases")
  private String aliases = null;

  @SerializedName("database")
  private DatabaseConfig database = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("upload_bucket")
  private String uploadBucket = null;

  public CustomerConfig aliases(String aliases) {
    this.aliases = aliases;
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAliases() {
    return aliases;
  }

  public void setAliases(String aliases) {
    this.aliases = aliases;
  }

  public CustomerConfig database(DatabaseConfig database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @ApiModelProperty(example = "null", value = "")
  public DatabaseConfig getDatabase() {
    return database;
  }

  public void setDatabase(DatabaseConfig database) {
    this.database = database;
  }

  public CustomerConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerConfig uploadBucket(String uploadBucket) {
    this.uploadBucket = uploadBucket;
    return this;
  }

   /**
   * Get uploadBucket
   * @return uploadBucket
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUploadBucket() {
    return uploadBucket;
  }

  public void setUploadBucket(String uploadBucket) {
    this.uploadBucket = uploadBucket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerConfig customerConfig = (CustomerConfig) o;
    return Objects.equals(this.aliases, customerConfig.aliases) &&
        Objects.equals(this.database, customerConfig.database) &&
        Objects.equals(this.name, customerConfig.name) &&
        Objects.equals(this.uploadBucket, customerConfig.uploadBucket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, database, name, uploadBucket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerConfig {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uploadBucket: ").append(toIndentedString(uploadBucket)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

