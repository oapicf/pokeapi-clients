package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PokemonSpritesOther;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormSprites   {
  
  private String frontDefault;
  private String frontShiny;
  private String frontFemale;
  private String frontShinyFemale;
  private String backDefault;
  private String backShiny;
  private String backFemale;
  private String backShinyFemale;
  private PokemonSpritesOther other;
  private Map<String, Map<String, Object>> versions = new HashMap<>();

  /**
   * The default depiction of this Pokémon from the front in battle.
   **/
  
  @ApiModelProperty(required = true, value = "The default depiction of this Pokémon from the front in battle.")
  @JsonProperty("front_default")
  @NotNull
  public String getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The shiny depiction of this Pokémon from the front in battle.
   **/
  
  @ApiModelProperty(required = true, value = "The shiny depiction of this Pokémon from the front in battle.")
  @JsonProperty("front_shiny")
  @NotNull
  public String getFrontShiny() {
    return frontShiny;
  }
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * The female depiction of this Pokémon from the front in battle.
   **/
  
  @ApiModelProperty(required = true, value = "The female depiction of this Pokémon from the front in battle.")
  @JsonProperty("front_female")
  @NotNull
  public String getFrontFemale() {
    return frontFemale;
  }
  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * The shiny female depiction of this Pokémon from the front in battle.
   **/
  
  @ApiModelProperty(required = true, value = "The shiny female depiction of this Pokémon from the front in battle.")
  @JsonProperty("front_shiny_female")
  @NotNull
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }
  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  /**
   * The default depiction of this Pokémon from the back in battle.
   **/
  
  @ApiModelProperty(required = true, value = "The default depiction of this Pokémon from the back in battle.")
  @JsonProperty("back_default")
  @NotNull
  public String getBackDefault() {
    return backDefault;
  }
  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  /**
   * The shiny depiction of this Pokémon from the back in battle.
   **/
  
  @ApiModelProperty(required = true, value = "The shiny depiction of this Pokémon from the back in battle.")
  @JsonProperty("back_shiny")
  @NotNull
  public String getBackShiny() {
    return backShiny;
  }
  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  /**
   * The female depiction of this Pokémon from the back in battle.
   **/
  
  @ApiModelProperty(required = true, value = "The female depiction of this Pokémon from the back in battle.")
  @JsonProperty("back_female")
  @NotNull
  public String getBackFemale() {
    return backFemale;
  }
  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  /**
   * The shiny female depiction of this Pokémon from the back in battle.
   **/
  
  @ApiModelProperty(required = true, value = "The shiny female depiction of this Pokémon from the back in battle.")
  @JsonProperty("back_shiny_female")
  @NotNull
  public String getBackShinyFemale() {
    return backShinyFemale;
  }
  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  /**
   * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
   **/
  
  @ApiModelProperty(value = "Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.")
  @JsonProperty("other")
  public PokemonSpritesOther getOther() {
    return other;
  }
  public void setOther(PokemonSpritesOther other) {
    this.other = other;
  }

  /**
   * Sprites grouped by generation and game. Available keys vary by resource.
   **/
  
  @ApiModelProperty(value = "Sprites grouped by generation and game. Available keys vary by resource.")
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }
  public void setVersions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonFormSprites pokemonFormSprites = (PokemonFormSprites) o;
    return Objects.equals(this.frontDefault, pokemonFormSprites.frontDefault) &&
        Objects.equals(this.frontShiny, pokemonFormSprites.frontShiny) &&
        Objects.equals(this.frontFemale, pokemonFormSprites.frontFemale) &&
        Objects.equals(this.frontShinyFemale, pokemonFormSprites.frontShinyFemale) &&
        Objects.equals(this.backDefault, pokemonFormSprites.backDefault) &&
        Objects.equals(this.backShiny, pokemonFormSprites.backShiny) &&
        Objects.equals(this.backFemale, pokemonFormSprites.backFemale) &&
        Objects.equals(this.backShinyFemale, pokemonFormSprites.backShinyFemale) &&
        Objects.equals(this.other, pokemonFormSprites.other) &&
        Objects.equals(this.versions, pokemonFormSprites.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontShiny, frontFemale, frontShinyFemale, backDefault, backShiny, backFemale, backShinyFemale, other, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormSprites {\n");
    
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
    sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
    sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
    sb.append("    backShiny: ").append(toIndentedString(backShiny)).append("\n");
    sb.append("    backFemale: ").append(toIndentedString(backFemale)).append("\n");
    sb.append("    backShinyFemale: ").append(toIndentedString(backShinyFemale)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

