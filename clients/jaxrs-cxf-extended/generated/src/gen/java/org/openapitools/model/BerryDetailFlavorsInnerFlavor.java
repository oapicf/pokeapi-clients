package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryDetailFlavorsInnerFlavor  {
  
 /**
  * The name of the flavor
  */
  @ApiModelProperty(value = "The name of the flavor")
  private String name;

 /**
  * The URL to get more information about the flavor
  */
  @ApiModelProperty(value = "The URL to get more information about the flavor")
  private URI url;
 /**
  * The name of the flavor
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public BerryDetailFlavorsInnerFlavor name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The URL to get more information about the flavor
  * @return url
  */
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public BerryDetailFlavorsInnerFlavor url(URI url) {
    this.url = url;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor = (BerryDetailFlavorsInnerFlavor) o;
    return Objects.equals(this.name, berryDetailFlavorsInnerFlavor.name) &&
        Objects.equals(this.url, berryDetailFlavorsInnerFlavor.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryDetailFlavorsInnerFlavor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

