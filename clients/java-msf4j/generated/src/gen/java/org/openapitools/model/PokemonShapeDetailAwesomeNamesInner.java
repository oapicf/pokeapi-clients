package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

/**
 * PokemonShapeDetailAwesomeNamesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonShapeDetailAwesomeNamesInner   {
  @JsonProperty("awesome_name")
  private String awesomeName;

  @JsonProperty("language")
  private AbilityDetailPokemonInnerPokemon language;

  public PokemonShapeDetailAwesomeNamesInner awesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
    return this;
  }

   /**
   * Get awesomeName
   * @return awesomeName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAwesomeName() {
    return awesomeName;
  }

  public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }

  public PokemonShapeDetailAwesomeNamesInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

