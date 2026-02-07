package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender   {
  private String name;
  private URI url;

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender() {
  }

  @JsonCreator
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "url") URI url
  ) {
    this.name = name;
    this.url = url;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "url")
  @NotNull public URI getUrl() {
    return url;
  }

  @JsonProperty(required = true, value = "url")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

