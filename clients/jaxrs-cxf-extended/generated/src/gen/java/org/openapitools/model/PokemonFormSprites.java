package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PokemonSpritesOther;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonFormSprites  {
  
 /**
  * The default depiction of this Pokémon from the front in battle.
  */
  @ApiModelProperty(required = true, value = "The default depiction of this Pokémon from the front in battle.")
  private String frontDefault;

 /**
  * The shiny depiction of this Pokémon from the front in battle.
  */
  @ApiModelProperty(required = true, value = "The shiny depiction of this Pokémon from the front in battle.")
  private String frontShiny;

 /**
  * The female depiction of this Pokémon from the front in battle.
  */
  @ApiModelProperty(required = true, value = "The female depiction of this Pokémon from the front in battle.")
  private String frontFemale;

 /**
  * The shiny female depiction of this Pokémon from the front in battle.
  */
  @ApiModelProperty(required = true, value = "The shiny female depiction of this Pokémon from the front in battle.")
  private String frontShinyFemale;

 /**
  * The default depiction of this Pokémon from the back in battle.
  */
  @ApiModelProperty(required = true, value = "The default depiction of this Pokémon from the back in battle.")
  private String backDefault;

 /**
  * The shiny depiction of this Pokémon from the back in battle.
  */
  @ApiModelProperty(required = true, value = "The shiny depiction of this Pokémon from the back in battle.")
  private String backShiny;

 /**
  * The female depiction of this Pokémon from the back in battle.
  */
  @ApiModelProperty(required = true, value = "The female depiction of this Pokémon from the back in battle.")
  private String backFemale;

 /**
  * The shiny female depiction of this Pokémon from the back in battle.
  */
  @ApiModelProperty(required = true, value = "The shiny female depiction of this Pokémon from the back in battle.")
  private String backShinyFemale;

 /**
  * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
  */
  @ApiModelProperty(value = "Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.")
  @Valid
  private PokemonSpritesOther other;

 /**
  * Sprites grouped by generation and game. Available keys vary by resource.
  */
  @ApiModelProperty(value = "Sprites grouped by generation and game. Available keys vary by resource.")
  private Map<String, Map<String, Object>> versions = new HashMap<>();
 /**
  * The default depiction of this Pokémon from the front in battle.
  * @return frontDefault
  */
  @JsonProperty("front_default")
  @NotNull
  public String getFrontDefault() {
    return frontDefault;
  }

  /**
   * Sets the <code>frontDefault</code> property.
   */
 public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * Sets the <code>frontDefault</code> property.
   */
  public PokemonFormSprites frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

 /**
  * The shiny depiction of this Pokémon from the front in battle.
  * @return frontShiny
  */
  @JsonProperty("front_shiny")
  @NotNull
  public String getFrontShiny() {
    return frontShiny;
  }

  /**
   * Sets the <code>frontShiny</code> property.
   */
 public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * Sets the <code>frontShiny</code> property.
   */
  public PokemonFormSprites frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

 /**
  * The female depiction of this Pokémon from the front in battle.
  * @return frontFemale
  */
  @JsonProperty("front_female")
  @NotNull
  public String getFrontFemale() {
    return frontFemale;
  }

  /**
   * Sets the <code>frontFemale</code> property.
   */
 public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * Sets the <code>frontFemale</code> property.
   */
  public PokemonFormSprites frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

 /**
  * The shiny female depiction of this Pokémon from the front in battle.
  * @return frontShinyFemale
  */
  @JsonProperty("front_shiny_female")
  @NotNull
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  /**
   * Sets the <code>frontShinyFemale</code> property.
   */
 public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  /**
   * Sets the <code>frontShinyFemale</code> property.
   */
  public PokemonFormSprites frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

 /**
  * The default depiction of this Pokémon from the back in battle.
  * @return backDefault
  */
  @JsonProperty("back_default")
  @NotNull
  public String getBackDefault() {
    return backDefault;
  }

  /**
   * Sets the <code>backDefault</code> property.
   */
 public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  /**
   * Sets the <code>backDefault</code> property.
   */
  public PokemonFormSprites backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

 /**
  * The shiny depiction of this Pokémon from the back in battle.
  * @return backShiny
  */
  @JsonProperty("back_shiny")
  @NotNull
  public String getBackShiny() {
    return backShiny;
  }

  /**
   * Sets the <code>backShiny</code> property.
   */
 public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  /**
   * Sets the <code>backShiny</code> property.
   */
  public PokemonFormSprites backShiny(String backShiny) {
    this.backShiny = backShiny;
    return this;
  }

 /**
  * The female depiction of this Pokémon from the back in battle.
  * @return backFemale
  */
  @JsonProperty("back_female")
  @NotNull
  public String getBackFemale() {
    return backFemale;
  }

  /**
   * Sets the <code>backFemale</code> property.
   */
 public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  /**
   * Sets the <code>backFemale</code> property.
   */
  public PokemonFormSprites backFemale(String backFemale) {
    this.backFemale = backFemale;
    return this;
  }

 /**
  * The shiny female depiction of this Pokémon from the back in battle.
  * @return backShinyFemale
  */
  @JsonProperty("back_shiny_female")
  @NotNull
  public String getBackShinyFemale() {
    return backShinyFemale;
  }

  /**
   * Sets the <code>backShinyFemale</code> property.
   */
 public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  /**
   * Sets the <code>backShinyFemale</code> property.
   */
  public PokemonFormSprites backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
    return this;
  }

 /**
  * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
  * @return other
  */
  @JsonProperty("other")
  public PokemonSpritesOther getOther() {
    return other;
  }

  /**
   * Sets the <code>other</code> property.
   */
 public void setOther(PokemonSpritesOther other) {
    this.other = other;
  }

  /**
   * Sets the <code>other</code> property.
   */
  public PokemonFormSprites other(PokemonSpritesOther other) {
    this.other = other;
    return this;
  }

 /**
  * Sprites grouped by generation and game. Available keys vary by resource.
  * @return versions
  */
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }

  /**
   * Sets the <code>versions</code> property.
   */
 public void setVersions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
  }

  /**
   * Sets the <code>versions</code> property.
   */
  public PokemonFormSprites versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  /**
   * Puts a new item into the <code>versions</code> map.
   */
  public PokemonFormSprites putVersionsItem(String key, Map<String, Object> versionsItem) {
    this.versions.put(key, versionsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

