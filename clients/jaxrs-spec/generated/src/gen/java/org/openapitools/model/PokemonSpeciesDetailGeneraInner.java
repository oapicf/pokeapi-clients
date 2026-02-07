package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonSpeciesDetail_genera_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetailGeneraInner   {
  private String genus;
  private AbilityDetailPokemonInnerPokemon language;

  public PokemonSpeciesDetailGeneraInner() {
  }

  @JsonCreator
  public PokemonSpeciesDetailGeneraInner(
    @JsonProperty(required = true, value = "genus") String genus,
    @JsonProperty(required = true, value = "language") AbilityDetailPokemonInnerPokemon language
  ) {
    this.genus = genus;
    this.language = language;
  }

  /**
   **/
  public PokemonSpeciesDetailGeneraInner genus(String genus) {
    this.genus = genus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "genus")
  @NotNull public String getGenus() {
    return genus;
  }

  @JsonProperty(required = true, value = "genus")
  public void setGenus(String genus) {
    this.genus = genus;
  }

  /**
   **/
  public PokemonSpeciesDetailGeneraInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
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
    PokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner = (PokemonSpeciesDetailGeneraInner) o;
    return Objects.equals(this.genus, pokemonSpeciesDetailGeneraInner.genus) &&
        Objects.equals(this.language, pokemonSpeciesDetailGeneraInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genus, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailGeneraInner {\n");
    
    sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
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

