package apimodels;

import apimodels.PokemonSpritesOther;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonSprites
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonSprites   {
  @JsonProperty("front_default")
  @NotNull

  private String frontDefault;

  @JsonProperty("front_shiny")
  @NotNull

  private String frontShiny;

  @JsonProperty("front_female")
  @NotNull

  private String frontFemale;

  @JsonProperty("front_shiny_female")
  @NotNull

  private String frontShinyFemale;

  @JsonProperty("back_default")
  @NotNull

  private String backDefault;

  @JsonProperty("back_shiny")
  @NotNull

  private String backShiny;

  @JsonProperty("back_female")
  @NotNull

  private String backFemale;

  @JsonProperty("back_shiny_female")
  @NotNull

  private String backShinyFemale;

  @JsonProperty("other")
  @Valid

  private PokemonSpritesOther other;

  @JsonProperty("versions")
  @Valid

  private Map<String, Map<String, Object>> versions = null;

  public PokemonSprites frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

   /**
   * The default depiction of this Pokémon from the front in battle.
   * @return frontDefault
  **/
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSprites frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

   /**
   * The shiny depiction of this Pokémon from the front in battle.
   * @return frontShiny
  **/
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSprites frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

   /**
   * The female depiction of this Pokémon from the front in battle.
   * @return frontFemale
  **/
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSprites frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

   /**
   * The shiny female depiction of this Pokémon from the front in battle.
   * @return frontShinyFemale
  **/
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  public PokemonSprites backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

   /**
   * The default depiction of this Pokémon from the back in battle.
   * @return backDefault
  **/
  public String getBackDefault() {
    return backDefault;
  }

  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  public PokemonSprites backShiny(String backShiny) {
    this.backShiny = backShiny;
    return this;
  }

   /**
   * The shiny depiction of this Pokémon from the back in battle.
   * @return backShiny
  **/
  public String getBackShiny() {
    return backShiny;
  }

  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  public PokemonSprites backFemale(String backFemale) {
    this.backFemale = backFemale;
    return this;
  }

   /**
   * The female depiction of this Pokémon from the back in battle.
   * @return backFemale
  **/
  public String getBackFemale() {
    return backFemale;
  }

  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  public PokemonSprites backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
    return this;
  }

   /**
   * The shiny female depiction of this Pokémon from the back in battle.
   * @return backShinyFemale
  **/
  public String getBackShinyFemale() {
    return backShinyFemale;
  }

  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  public PokemonSprites other(PokemonSpritesOther other) {
    this.other = other;
    return this;
  }

   /**
   * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
   * @return other
  **/
  public PokemonSpritesOther getOther() {
    return other;
  }

  public void setOther(PokemonSpritesOther other) {
    this.other = other;
  }

  public PokemonSprites versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  public PokemonSprites putVersionsItem(String key, Map<String, Object> versionsItem) {
    if (this.versions == null) {
      this.versions = new HashMap<>();
    }
    this.versions.put(key, versionsItem);
    return this;
  }

   /**
   * Sprites grouped by generation and game. Available keys vary by resource.
   * @return versions
  **/
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
    PokemonSprites pokemonSprites = (PokemonSprites) o;
    return Objects.equals(frontDefault, pokemonSprites.frontDefault) &&
        Objects.equals(frontShiny, pokemonSprites.frontShiny) &&
        Objects.equals(frontFemale, pokemonSprites.frontFemale) &&
        Objects.equals(frontShinyFemale, pokemonSprites.frontShinyFemale) &&
        Objects.equals(backDefault, pokemonSprites.backDefault) &&
        Objects.equals(backShiny, pokemonSprites.backShiny) &&
        Objects.equals(backFemale, pokemonSprites.backFemale) &&
        Objects.equals(backShinyFemale, pokemonSprites.backShinyFemale) &&
        Objects.equals(other, pokemonSprites.other) &&
        Objects.equals(versions, pokemonSprites.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontShiny, frontFemale, frontShinyFemale, backDefault, backShiny, backFemale, backShinyFemale, other, versions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

