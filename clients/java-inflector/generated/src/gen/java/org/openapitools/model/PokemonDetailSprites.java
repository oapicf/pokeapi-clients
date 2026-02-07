package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailSprites extends HashMap<String, URI>  {
  @JsonProperty("front_default")
  private URI frontDefault;

  /**
   **/
  public PokemonDetailSprites frontDefault(URI frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("front_default")
  public URI getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(URI frontDefault) {
    this.frontDefault = frontDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailSprites pokemonDetailSprites = (PokemonDetailSprites) o;
    return super.equals(o) && Objects.equals(frontDefault, pokemonDetailSprites.frontDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), frontDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailSprites {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
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

