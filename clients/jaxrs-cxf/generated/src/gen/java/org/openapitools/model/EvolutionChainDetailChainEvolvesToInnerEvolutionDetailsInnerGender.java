package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender  {
  
  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private URI url;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  @NotNull
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender url(URI url) {
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
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender = (EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender) o;
    return Objects.equals(this.name, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.name) &&
        Objects.equals(this.url, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender {\n");
    
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

