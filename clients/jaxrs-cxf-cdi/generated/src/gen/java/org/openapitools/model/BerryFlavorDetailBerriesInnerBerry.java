package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BerryFlavorDetailBerriesInnerBerry   {
  
  private String name;

  private URI url;

  /**
   * The name of the berry
   **/
  public BerryFlavorDetailBerriesInnerBerry name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the berry")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The URL to get more information about the berry
   **/
  public BerryFlavorDetailBerriesInnerBerry url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "The URL to get more information about the berry")
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

