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



public class BerryDetailFlavorsInnerFlavor   {
  
  private String name;

  private URI url;

  /**
   * The name of the flavor
   **/
  public BerryDetailFlavorsInnerFlavor name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the flavor")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The URL to get more information about the flavor
   **/
  public BerryDetailFlavorsInnerFlavor url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "The URL to get more information about the flavor")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

