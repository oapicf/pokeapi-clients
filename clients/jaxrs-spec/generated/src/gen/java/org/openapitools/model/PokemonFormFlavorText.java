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



@JsonTypeName("PokemonFormFlavorText")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormFlavorText   {
  private String flavorText;
  private LanguageSummary language;
  private VersionSummary version;

  public PokemonFormFlavorText() {
  }

  @JsonCreator
  public PokemonFormFlavorText(
    @JsonProperty(required = true, value = "flavor_text") String flavorText,
    @JsonProperty(required = true, value = "language") LanguageSummary language,
    @JsonProperty(required = true, value = "version") VersionSummary version
  ) {
    this.flavorText = flavorText;
    this.language = language;
    this.version = version;
  }

  /**
   * The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more. 
   **/
  public PokemonFormFlavorText flavorText(String flavorText) {
    this.flavorText = flavorText;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. ")
  @JsonProperty(required = true, value = "flavor_text")
  @NotNull public String getFlavorText() {
    return flavorText;
  }

  @JsonProperty(required = true, value = "flavor_text")
  public void setFlavorText(String flavorText) {
    this.flavorText = flavorText;
  }

  /**
   * The language this name is in.
   **/
  public PokemonFormFlavorText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language this name is in.")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public LanguageSummary getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  /**
   * The game version this flavor text is extracted from.
   **/
  public PokemonFormFlavorText version(VersionSummary version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The game version this flavor text is extracted from.")
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
    PokemonFormFlavorText pokemonFormFlavorText = (PokemonFormFlavorText) o;
    return Objects.equals(this.flavorText, pokemonFormFlavorText.flavorText) &&
        Objects.equals(this.language, pokemonFormFlavorText.language) &&
        Objects.equals(this.version, pokemonFormFlavorText.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavorText, language, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormFlavorText {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
