package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonSpeciesFlavorText")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesFlavorText   {
  private String flavorText;
  private LanguageSummary language;
  private VersionSummary version;

  public PokemonSpeciesFlavorText() {
  }

  @JsonCreator
  public PokemonSpeciesFlavorText(
    @JsonProperty(required = true, value = "flavor_text") String flavorText,
    @JsonProperty(required = true, value = "language") LanguageSummary language,
    @JsonProperty(required = true, value = "version") VersionSummary version
  ) {
    this.flavorText = flavorText;
    this.language = language;
    this.version = version;
  }

  /**
   **/
  public PokemonSpeciesFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "flavor_text")
  @NotNull public String getFlavorText() {
    return flavorText;
  }

  @JsonProperty(required = true, value = "flavor_text")
  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  /**
   **/
  public PokemonSpeciesFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public LanguageSummary getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  /**
   **/
  public PokemonSpeciesFlavorText version(VersionSummary version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version")
  @NotNull @Valid public VersionSummary getVersion() {
    return version;
  }

  @JsonProperty(required = true, value = "version")
  public void setVersion(VersionSummary version) {
    this.version = version;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

