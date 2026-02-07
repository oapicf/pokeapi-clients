package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFlavorDetailBerriesInnerBerry  {
  
 /**
  * The name of the berry
  */
  @ApiModelProperty(value = "The name of the berry")
  private String name;

 /**
  * The URL to get more information about the berry
  */
  @ApiModelProperty(value = "The URL to get more information about the berry")
  private URI url;
 /**
  * The name of the berry
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
  public BerryFlavorDetailBerriesInnerBerry name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The URL to get more information about the berry
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
  public BerryFlavorDetailBerriesInnerBerry url(URI url) {
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
    BerryFlavorDetailBerriesInnerBerry berryFlavorDetailBerriesInnerBerry = (BerryFlavorDetailBerriesInnerBerry) o;
    return Objects.equals(this.name, berryFlavorDetailBerriesInnerBerry.name) &&
        Objects.equals(this.url, berryFlavorDetailBerriesInnerBerry.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorDetailBerriesInnerBerry {\n");
    
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

