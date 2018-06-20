/*
 * AimMatic API
 * APIs for Natural Voice and placeNext
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BaseResponse;
import io.swagger.client.model.ESSData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ESSResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-20T13:06:58.719-07:00")
public class ESSResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("essData")
  private List<ESSData> essData = null;

  public ESSResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ESSResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ESSResponse essData(List<ESSData> essData) {
    this.essData = essData;
    return this;
  }

  public ESSResponse addEssDataItem(ESSData essDataItem) {
    if (this.essData == null) {
      this.essData = new ArrayList<ESSData>();
    }
    this.essData.add(essDataItem);
    return this;
  }

   /**
   * Get essData
   * @return essData
  **/
  @ApiModelProperty(value = "")
  public List<ESSData> getEssData() {
    return essData;
  }

  public void setEssData(List<ESSData> essData) {
    this.essData = essData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESSResponse esSResponse = (ESSResponse) o;
    return Objects.equals(this.code, esSResponse.code) &&
        Objects.equals(this.message, esSResponse.message) &&
        Objects.equals(this.essData, esSResponse.essData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, essData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESSResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    essData: ").append(toIndentedString(essData)).append("\n");
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

