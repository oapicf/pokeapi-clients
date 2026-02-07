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



@JsonTypeName("PokemonFormDetail_form_names_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonFormDetailFormNamesInner   {
  private AbilityDetailPokemonInnerPokemon language;
  private String name;

  public PokemonFormDetailFormNamesInner() {
  }

  @JsonCreator
  public PokemonFormDetailFormNamesInner(
    @JsonProperty(required = true, value = "language") AbilityDetailPokemonInnerPokemon language,
    @JsonProperty(required = true, value = "name") String name
  ) {
    this.language = language;
    this.name = name;
  }

  /**
   **/
  public PokemonFormDetailFormNamesInner language(AbilityDetailPokemonInnerPokemon language) {
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

  /**
   **/
  public PokemonFormDetailFormNamesInner name(String name) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner = (PokemonFormDetailFormNamesInner) o;
    return Objects.equals(this.language, pokemonFormDetailFormNamesInner.language) &&
        Objects.equals(this.name, pokemonFormDetailFormNamesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormDetailFormNamesInner {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

