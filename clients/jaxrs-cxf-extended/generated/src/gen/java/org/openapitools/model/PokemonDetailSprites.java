package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetailSprites extends HashMap<String, URI> {
  
  @ApiModelProperty(value = "")
  private URI frontDefault;
 /**
  * Get frontDefault
  * @return frontDefault
  */
  @JsonProperty("front_default")
  public URI getFrontDefault() {
    return frontDefault;
  }

  /**
   * Sets the <code>frontDefault</code> property.
   */
 public void setFrontDefault(URI frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * Sets the <code>frontDefault</code> property.
   */
  public PokemonDetailSprites frontDefault(URI frontDefault) {
    this.frontDefault = frontDefault;
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
    PokemonDetailSprites pokemonDetailSprites = (PokemonDetailSprites) o;
    return super.equals(o) && Objects.equals(this.frontDefault, pokemonDetailSprites.frontDefault);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

