package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonSpritesOtherShowdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonSpritesOtherShowdown   {
  @JsonProperty("front_default")
  @NotNull

  private String frontDefault;

  @JsonProperty("front_female")
  @NotNull

  private String frontFemale;

  @JsonProperty("front_shiny")
  @NotNull

  private String frontShiny;

  @JsonProperty("front_shiny_female")
  @NotNull

  private String frontShinyFemale;

  @JsonProperty("back_default")
  @NotNull

  private String backDefault;

  @JsonProperty("back_female")
  @NotNull

  private String backFemale;

  @JsonProperty("back_shiny")
  @NotNull

  private String backShiny;

  @JsonProperty("back_shiny_female")
  @NotNull

  private String backShinyFemale;

  public PokemonSpritesOtherShowdown frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

   /**
   * The URL of the default Pokémon Showdown front image, or null if unavailable.
   * @return frontDefault
  **/
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherShowdown frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

   /**
   * The URL of the female Pokémon Showdown front image, or null if unavailable.
   * @return frontFemale
  **/
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSpritesOtherShowdown frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

   /**
   * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
   * @return frontShiny
  **/
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherShowdown frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

   /**
   * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
   * @return frontShinyFemale
  **/
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  public PokemonSpritesOtherShowdown backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

   /**
   * The URL of the default Pokémon Showdown back image, or null if unavailable.
   * @return backDefault
  **/
  public String getBackDefault() {
    return backDefault;
  }

  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  public PokemonSpritesOtherShowdown backFemale(String backFemale) {
    this.backFemale = backFemale;
    return this;
  }

   /**
   * The URL of the female Pokémon Showdown back image, or null if unavailable.
   * @return backFemale
  **/
  public String getBackFemale() {
    return backFemale;
  }

  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  public PokemonSpritesOtherShowdown backShiny(String backShiny) {
    this.backShiny = backShiny;
    return this;
  }

   /**
   * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
   * @return backShiny
  **/
  public String getBackShiny() {
    return backShiny;
  }

  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  public PokemonSpritesOtherShowdown backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
    return this;
  }

   /**
   * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
   * @return backShinyFemale
  **/
  public String getBackShinyFemale() {
    return backShinyFemale;
  }

  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherShowdown pokemonSpritesOtherShowdown = (PokemonSpritesOtherShowdown) o;
    return Objects.equals(frontDefault, pokemonSpritesOtherShowdown.frontDefault) &&
        Objects.equals(frontFemale, pokemonSpritesOtherShowdown.frontFemale) &&
        Objects.equals(frontShiny, pokemonSpritesOtherShowdown.frontShiny) &&
        Objects.equals(frontShinyFemale, pokemonSpritesOtherShowdown.frontShinyFemale) &&
        Objects.equals(backDefault, pokemonSpritesOtherShowdown.backDefault) &&
        Objects.equals(backFemale, pokemonSpritesOtherShowdown.backFemale) &&
        Objects.equals(backShiny, pokemonSpritesOtherShowdown.backShiny) &&
        Objects.equals(backShinyFemale, pokemonSpritesOtherShowdown.backShinyFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale, frontShiny, frontShinyFemale, backDefault, backFemale, backShiny, backShinyFemale);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherShowdown {\n");
    
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
    sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
    sb.append("    backFemale: ").append(toIndentedString(backFemale)).append("\n");
    sb.append("    backShiny: ").append(toIndentedString(backShiny)).append("\n");
    sb.append("    backShinyFemale: ").append(toIndentedString(backShinyFemale)).append("\n");
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

