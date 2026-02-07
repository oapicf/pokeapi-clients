package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemDetailHeldByPokemonInnerVersionDetailsInner
 */

@JsonTypeName("ItemDetail_held_by_pokemon_inner_version_details_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemDetailHeldByPokemonInnerVersionDetailsInner {

  private Integer rarity;

  private AbilityDetailPokemonInnerPokemon version;

  public ItemDetailHeldByPokemonInnerVersionDetailsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemDetailHeldByPokemonInnerVersionDetailsInner(Integer rarity, AbilityDetailPokemonInnerPokemon version) {
    this.rarity = rarity;
    this.version = version;
  }

  public ItemDetailHeldByPokemonInnerVersionDetailsInner rarity(Integer rarity) {
    this.rarity = rarity;
    return this;
  }

  /**
   * Get rarity
   * @return rarity
   */
  @NotNull 
  @Schema(name = "rarity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rarity")
  public Integer getRarity() {
    return rarity;
  }

  public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }

  public ItemDetailHeldByPokemonInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @NotNull @Valid 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public AbilityDetailPokemonInnerPokemon getVersion() {
    return version;
  }

  public void setVersion(AbilityDetailPokemonInnerPokemon version) {
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
    ItemDetailHeldByPokemonInnerVersionDetailsInner itemDetailHeldByPokemonInnerVersionDetailsInner = (ItemDetailHeldByPokemonInnerVersionDetailsInner) o;
    return Objects.equals(this.rarity, itemDetailHeldByPokemonInnerVersionDetailsInner.rarity) &&
        Objects.equals(this.version, itemDetailHeldByPokemonInnerVersionDetailsInner.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rarity, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailHeldByPokemonInnerVersionDetailsInner {\n");
    sb.append("    rarity: ").append(toIndentedString(rarity)).append("\n");
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

