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
import io.swagger.client.model.SentibotData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SentibotResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-27T15:12:46.046+03:00")
public class SentibotResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("sentibotData")
  private List<SentibotData> sentibotData = null;

  public SentibotResponse code(Integer code) {
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

  public SentibotResponse message(String message) {
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

  public SentibotResponse sentibotData(List<SentibotData> sentibotData) {
    this.sentibotData = sentibotData;
    return this;
  }

  public SentibotResponse addSentibotDataItem(SentibotData sentibotDataItem) {
    if (this.sentibotData == null) {
      this.sentibotData = new ArrayList<SentibotData>();
    }
    this.sentibotData.add(sentibotDataItem);
    return this;
  }

   /**
   * Get sentibotData
   * @return sentibotData
  **/
  @ApiModelProperty(value = "")
  public List<SentibotData> getSentibotData() {
    return sentibotData;
  }

  public void setSentibotData(List<SentibotData> sentibotData) {
    this.sentibotData = sentibotData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentibotResponse sentibotResponse = (SentibotResponse) o;
    return Objects.equals(this.code, sentibotResponse.code) &&
        Objects.equals(this.message, sentibotResponse.message) &&
        Objects.equals(this.sentibotData, sentibotResponse.sentibotData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, sentibotData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentibotResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    sentibotData: ").append(toIndentedString(sentibotData)).append("\n");
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

