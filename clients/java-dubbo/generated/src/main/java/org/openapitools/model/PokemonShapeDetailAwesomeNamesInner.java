package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonShapeDetailAwesomeNamesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("awesome_name")
  private String awesomeName;

  @JsonProperty("language")
  private AbilityDetailPokemonInnerPokemon language;

  /**
   * 
   * @return awesomeName
   */
  public String getAwesomeName() {
    return awesomeName;
  }

  public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }

  /**
   * 
   * @return language
   */
  public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }

  public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonShapeDetailAwesomeNamesInner pokemonShapeDetailAwesomeNamesInner = (PokemonShapeDetailAwesomeNamesInner) o;
    return Objects.equals(this.awesomeName, pokemonShapeDetailAwesomeNamesInner.awesomeName) &&
        Objects.equals(this.language, pokemonShapeDetailAwesomeNamesInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awesomeName, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonShapeDetailAwesomeNamesInner {\n");
    
    sb.append("    awesomeName: ").append(toIndentedString(awesomeName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
