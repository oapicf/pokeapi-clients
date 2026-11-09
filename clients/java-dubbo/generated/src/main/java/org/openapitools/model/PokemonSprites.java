package org.openapitools.model;

import org.openapitools.model.AnyType;
import org.openapitools.model.PokemonSpritesOther;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonSprites implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The default depiction of this Pokémon from the front in battle.
   */
  @JsonProperty("front_default")
  private String frontDefault;

  /**
   * The shiny depiction of this Pokémon from the front in battle.
   */
  @JsonProperty("front_shiny")
  private String frontShiny;

  /**
   * The female depiction of this Pokémon from the front in battle.
   */
  @JsonProperty("front_female")
  private String frontFemale;

  /**
   * The shiny female depiction of this Pokémon from the front in battle.
   */
  @JsonProperty("front_shiny_female")
  private String frontShinyFemale;

  /**
   * The default depiction of this Pokémon from the back in battle.
   */
  @JsonProperty("back_default")
  private String backDefault;

  /**
   * The shiny depiction of this Pokémon from the back in battle.
   */
  @JsonProperty("back_shiny")
  private String backShiny;

  /**
   * The female depiction of this Pokémon from the back in battle.
   */
  @JsonProperty("back_female")
  private String backFemale;

  /**
   * The shiny female depiction of this Pokémon from the back in battle.
   */
  @JsonProperty("back_shiny_female")
  private String backShinyFemale;

  /**
   * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
   */
  @JsonProperty("other")
  private PokemonSpritesOther other;

  /**
   * Sprites grouped by generation and game. Available keys vary by resource.
   */
  @JsonProperty("versions")
  private Map<String, Map<String, AnyType>> versions = new HashMap<>();

  /**
   * The default depiction of this Pokémon from the front in battle.
   * @return frontDefault
   */
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The shiny depiction of this Pokémon from the front in battle.
   * @return frontShiny
   */
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * The female depiction of this Pokémon from the front in battle.
   * @return frontFemale
   */
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * The shiny female depiction of this Pokémon from the front in battle.
   * @return frontShinyFemale
   */
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  /**
   * The default depiction of this Pokémon from the back in battle.
   * @return backDefault
   */
  public String getBackDefault() {
    return backDefault;
  }

  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  /**
   * The shiny depiction of this Pokémon from the back in battle.
   * @return backShiny
   */
  public String getBackShiny() {
    return backShiny;
  }

  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  /**
   * The female depiction of this Pokémon from the back in battle.
   * @return backFemale
   */
  public String getBackFemale() {
    return backFemale;
  }

  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  /**
   * The shiny female depiction of this Pokémon from the back in battle.
   * @return backShinyFemale
   */
  public String getBackShinyFemale() {
    return backShinyFemale;
  }

  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  /**
   * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
   * @return other
   */
  public PokemonSpritesOther getOther() {
    return other;
  }

  public void setOther(PokemonSpritesOther other) {
    this.other = other;
  }

  /**
   * Sprites grouped by generation and game. Available keys vary by resource.
   * @return versions
   */
  public Map<String, Map<String, AnyType>> getVersions() {
    return versions;
  }

  public void setVersions(Map<String, Map<String, AnyType>> versions) {
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
    PokemonSprites pokemonSprites = (PokemonSprites) o;
    return Objects.equals(this.frontDefault, pokemonSprites.frontDefault) &&
        Objects.equals(this.frontShiny, pokemonSprites.frontShiny) &&
        Objects.equals(this.frontFemale, pokemonSprites.frontFemale) &&
        Objects.equals(this.frontShinyFemale, pokemonSprites.frontShinyFemale) &&
        Objects.equals(this.backDefault, pokemonSprites.backDefault) &&
        Objects.equals(this.backShiny, pokemonSprites.backShiny) &&
        Objects.equals(this.backFemale, pokemonSprites.backFemale) &&
        Objects.equals(this.backShinyFemale, pokemonSprites.backShinyFemale) &&
        Objects.equals(this.other, pokemonSprites.other) &&
        Objects.equals(this.versions, pokemonSprites.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontShiny, frontFemale, frontShinyFemale, backDefault, backShiny, backFemale, backShinyFemale, other, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSprites {\n");
    
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
