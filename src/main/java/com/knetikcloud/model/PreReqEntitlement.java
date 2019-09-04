/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.knetikcloud.model.Behavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PreReqEntitlement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-04T08:46:30.788-04:00")
public class PreReqEntitlement extends Behavior {
  @JsonProperty("item_ids")
  private List<Integer> itemIds = new ArrayList<Integer>();

  public PreReqEntitlement itemIds(List<Integer> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public PreReqEntitlement addItemIdsItem(Integer itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * The item ids that must already be in the user&#39;s inventory
   * @return itemIds
  **/
  @ApiModelProperty(required = true, value = "The item ids that must already be in the user's inventory")
  public List<Integer> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<Integer> itemIds) {
    this.itemIds = itemIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreReqEntitlement preReqEntitlement = (PreReqEntitlement) o;
    return Objects.equals(this.itemIds, preReqEntitlement.itemIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreReqEntitlement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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

