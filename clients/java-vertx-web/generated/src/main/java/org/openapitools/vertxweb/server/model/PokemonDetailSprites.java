package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonDetailSprites extends HashMap<String, URI>  {
  
  private URI frontDefault;

  public PokemonDetailSprites () {

  }

  public PokemonDetailSprites (URI frontDefault) {
    this.frontDefault = frontDefault;
  }

    
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
