package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonSpeciesGenus   {
  
  private String genus;

  private LanguageSummary language;

  /**
   * The localized genus for the referenced Pokémon species
   **/
  public PokemonSpeciesGenus genus(String genus) {
    this.genus = genus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The localized genus for the referenced Pokémon species")
  @JsonProperty("genus")
  @NotNull
 @Size(max=30)  public String getGenus() {
    return genus;
  }
  public void setGenus(String genus) {
    this.genus = genus;
  }


  /**
   * The language this genus is in.
   **/
  public PokemonSpeciesGenus language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language this genus is in.")
  @JsonProperty("language")
  @NotNull
  public LanguageSummary getLanguage() {
    return language;
  }
  public void setLanguage(LanguageSummary language) {
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
    PokemonSpeciesGenus pokemonSpeciesGenus = (PokemonSpeciesGenus) o;
    return Objects.equals(this.genus, pokemonSpeciesGenus.genus) &&
        Objects.equals(this.language, pokemonSpeciesGenus.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genus, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesGenus {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

