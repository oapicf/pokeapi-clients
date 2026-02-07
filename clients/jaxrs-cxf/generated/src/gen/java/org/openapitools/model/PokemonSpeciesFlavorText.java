package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpeciesFlavorText  {
  
  @ApiModelProperty(required = true, value = "")

  private String flavorText;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private LanguageSummary language;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private VersionSummary version;
 /**
   * Get flavorText
   * @return flavorText
  **/
  @JsonProperty("flavor_text")
  @NotNull
  public String getFlavorText() {
    return flavorText;
  }

  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  public PokemonSpeciesFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  @NotNull
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  public PokemonSpeciesFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  @NotNull
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  public PokemonSpeciesFlavorText version(VersionSummary version) {
    this.version = version;
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
    PokemonSpeciesFlavorText pokemonSpeciesFlavorText = (PokemonSpeciesFlavorText) o;
    return Objects.equals(this.flavorText, pokemonSpeciesFlavorText.flavorText) &&
        Objects.equals(this.language, pokemonSpeciesFlavorText.language) &&
        Objects.equals(this.version, pokemonSpeciesFlavorText.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavorText, language, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesFlavorText {\n");
    
    sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

