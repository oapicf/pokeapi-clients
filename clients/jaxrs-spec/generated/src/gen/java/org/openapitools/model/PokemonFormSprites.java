package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.PokemonSpritesOther;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonFormSprites")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  public PokemonFormSprites() {
  }

  @JsonCreator
  public PokemonFormSprites(
    @JsonProperty(required = true, value = "front_default") String frontDefault,
    @JsonProperty(required = true, value = "front_shiny") String frontShiny,
    @JsonProperty(required = true, value = "front_female") String frontFemale,
    @JsonProperty(required = true, value = "front_shiny_female") String frontShinyFemale,
    @JsonProperty(required = true, value = "back_default") String backDefault,
    @JsonProperty(required = true, value = "back_shiny") String backShiny,
    @JsonProperty(required = true, value = "back_female") String backFemale,
    @JsonProperty(required = true, value = "back_shiny_female") String backShinyFemale
  ) {
    this.frontDefault = frontDefault;
    this.frontShiny = frontShiny;
    this.frontFemale = frontFemale;
    this.frontShinyFemale = frontShinyFemale;
    this.backDefault = backDefault;
    this.backShiny = backShiny;
    this.backFemale = backFemale;
    this.backShinyFemale = backShinyFemale;
  }

  /**
   * The default depiction of this Pokémon from the front in battle.
   **/
  public PokemonFormSprites frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The default depiction of this Pokémon from the front in battle.")
  @JsonProperty(required = true, value = "front_default")
  @NotNull public String getFrontDefault() {
    return frontDefault;
  }

  @JsonProperty(required = true, value = "front_default")
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The shiny depiction of this Pokémon from the front in battle.
   **/
  public PokemonFormSprites frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The shiny depiction of this Pokémon from the front in battle.")
  @JsonProperty(required = true, value = "front_shiny")
  @NotNull public String getFrontShiny() {
    return frontShiny;
  }

  @JsonProperty(required = true, value = "front_shiny")
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * The female depiction of this Pokémon from the front in battle.
   **/
  public PokemonFormSprites frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The female depiction of this Pokémon from the front in battle.")
  @JsonProperty(required = true, value = "front_female")
  @NotNull public String getFrontFemale() {
    return frontFemale;
  }

  @JsonProperty(required = true, value = "front_female")
  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * The shiny female depiction of this Pokémon from the front in battle.
   **/
  public PokemonFormSprites frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The shiny female depiction of this Pokémon from the front in battle.")
  @JsonProperty(required = true, value = "front_shiny_female")
  @NotNull public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  @JsonProperty(required = true, value = "front_shiny_female")
  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  /**
   * The default depiction of this Pokémon from the back in battle.
   **/
  public PokemonFormSprites backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The default depiction of this Pokémon from the back in battle.")
  @JsonProperty(required = true, value = "back_default")
  @NotNull public String getBackDefault() {
    return backDefault;
  }

  @JsonProperty(required = true, value = "back_default")
  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  /**
   * The shiny depiction of this Pokémon from the back in battle.
   **/
  public PokemonFormSprites backShiny(String backShiny) {
    this.backShiny = backShiny;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The shiny depiction of this Pokémon from the back in battle.")
  @JsonProperty(required = true, value = "back_shiny")
  @NotNull public String getBackShiny() {
    return backShiny;
  }

  @JsonProperty(required = true, value = "back_shiny")
  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  /**
   * The female depiction of this Pokémon from the back in battle.
   **/
  public PokemonFormSprites backFemale(String backFemale) {
    this.backFemale = backFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The female depiction of this Pokémon from the back in battle.")
  @JsonProperty(required = true, value = "back_female")
  @NotNull public String getBackFemale() {
    return backFemale;
  }

  @JsonProperty(required = true, value = "back_female")
  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  /**
   * The shiny female depiction of this Pokémon from the back in battle.
   **/
  public PokemonFormSprites backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The shiny female depiction of this Pokémon from the back in battle.")
  @JsonProperty(required = true, value = "back_shiny_female")
  @NotNull public String getBackShinyFemale() {
    return backShinyFemale;
  }

  @JsonProperty(required = true, value = "back_shiny_female")
  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  /**
   * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
   **/
  public PokemonFormSprites other(PokemonSpritesOther other) {
    this.other = other;
    return this;
  }

  
  @ApiModelProperty(value = "Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.")
  @JsonProperty("other")
  @Valid public PokemonSpritesOther getOther() {
    return other;
  }

  @JsonProperty("other")
  public void setOther(PokemonSpritesOther other) {
    this.other = other;
  }

  /**
   * Sprites grouped by generation and game. Available keys vary by resource.
   **/
  public PokemonFormSprites versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  
  @ApiModelProperty(value = "Sprites grouped by generation and game. Available keys vary by resource.")
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }

  @JsonProperty("versions")
  public void setVersions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
  }

  public PokemonFormSprites putVersionsItem(String key, Map<String, Object> versionsItem) {
    if (this.versions == null) {
      this.versions = new HashMap<>();
    }

    this.versions.put(key, versionsItem);
    return this;
  }

  public PokemonFormSprites removeVersionsItem(String key) {
    if (this.versions != null) {
      this.versions.remove(key);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
