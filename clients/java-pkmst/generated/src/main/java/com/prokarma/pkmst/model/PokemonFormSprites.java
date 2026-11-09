package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokemonSpritesOther;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonFormSprites
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormSprites   {
  @JsonProperty("front_default")
  private String frontDefault;

  @JsonProperty("front_shiny")
  private String frontShiny;

  @JsonProperty("front_female")
  private String frontFemale;

  @JsonProperty("front_shiny_female")
  private String frontShinyFemale;

  @JsonProperty("back_default")
  private String backDefault;

  @JsonProperty("back_shiny")
  private String backShiny;

  @JsonProperty("back_female")
  private String backFemale;

  @JsonProperty("back_shiny_female")
  private String backShinyFemale;

  @JsonProperty("other")
  private PokemonSpritesOther other;

  @JsonProperty("versions")
  
  private Map<String, Map<String, Object>> versions = null;

  public PokemonFormSprites frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  /**
   * The default depiction of this Pokémon from the front in battle.
   * @return frontDefault
   */
  @ApiModelProperty(required = true, value = "The default depiction of this Pokémon from the front in battle.")
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonFormSprites frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  /**
   * The shiny depiction of this Pokémon from the front in battle.
   * @return frontShiny
   */
  @ApiModelProperty(required = true, value = "The shiny depiction of this Pokémon from the front in battle.")
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonFormSprites frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

  /**
   * The female depiction of this Pokémon from the front in battle.
   * @return frontFemale
   */
  @ApiModelProperty(required = true, value = "The female depiction of this Pokémon from the front in battle.")
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonFormSprites frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

  /**
   * The shiny female depiction of this Pokémon from the front in battle.
   * @return frontShinyFemale
   */
  @ApiModelProperty(required = true, value = "The shiny female depiction of this Pokémon from the front in battle.")
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  public PokemonFormSprites backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

  /**
   * The default depiction of this Pokémon from the back in battle.
   * @return backDefault
   */
  @ApiModelProperty(required = true, value = "The default depiction of this Pokémon from the back in battle.")
  public String getBackDefault() {
    return backDefault;
  }

  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  public PokemonFormSprites backShiny(String backShiny) {
    this.backShiny = backShiny;
    return this;
  }

  /**
   * The shiny depiction of this Pokémon from the back in battle.
   * @return backShiny
   */
  @ApiModelProperty(required = true, value = "The shiny depiction of this Pokémon from the back in battle.")
  public String getBackShiny() {
    return backShiny;
  }

  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  public PokemonFormSprites backFemale(String backFemale) {
    this.backFemale = backFemale;
    return this;
  }

  /**
   * The female depiction of this Pokémon from the back in battle.
   * @return backFemale
   */
  @ApiModelProperty(required = true, value = "The female depiction of this Pokémon from the back in battle.")
  public String getBackFemale() {
    return backFemale;
  }

  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  public PokemonFormSprites backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
    return this;
  }

  /**
   * The shiny female depiction of this Pokémon from the back in battle.
   * @return backShinyFemale
   */
  @ApiModelProperty(required = true, value = "The shiny female depiction of this Pokémon from the back in battle.")
  public String getBackShinyFemale() {
    return backShinyFemale;
  }

  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  public PokemonFormSprites other(PokemonSpritesOther other) {
    this.other = other;
    return this;
  }

  /**
   * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
   * @return other
   */
  @ApiModelProperty(value = "Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.")
  public PokemonSpritesOther getOther() {
    return other;
  }

  public void setOther(PokemonSpritesOther other) {
    this.other = other;
  }

  public PokemonFormSprites versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  public PokemonFormSprites putVersionsItem(String key, Map<String, Object> versionsItem) {
    if (this.versions == null) {
      this.versions = new HashMap<>();
    }
    this.versions.put(key, versionsItem);
    return this;
  }

  /**
   * Sprites grouped by generation and game. Available keys vary by resource.
   * @return versions
   */
  @ApiModelProperty(value = "Sprites grouped by generation and game. Available keys vary by resource.")
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

