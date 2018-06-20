/*
 * GeoJSON geometry
 * An example of swagger file for a geographic API. It contains the geometry definitions
 *
 * OpenAPI spec version: 1.0.0
 * Contact: daniele.andreis@gmail.com
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
import io.swagger.client.model.Geometry;
import io.swagger.client.model.Point2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GeoJSon geometry
 */
@ApiModel(description = "GeoJSon geometry")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-20T13:06:57.534-07:00")
public class MultiPoint extends Geometry {
  @SerializedName("coordinates")
  private List<Point2D> coordinates = null;

  public MultiPoint coordinates(List<Point2D> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public MultiPoint addCoordinatesItem(Point2D coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<Point2D>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(value = "")
  public List<Point2D> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<Point2D> coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiPoint multiPoint = (MultiPoint) o;
    return Objects.equals(this.coordinates, multiPoint.coordinates) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

