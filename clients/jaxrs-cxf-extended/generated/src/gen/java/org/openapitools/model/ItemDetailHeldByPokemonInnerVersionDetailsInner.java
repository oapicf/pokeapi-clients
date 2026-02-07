package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemDetailHeldByPokemonInnerVersionDetailsInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer rarity;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon version;
 /**
  * Get rarity
  * @return rarity
  */
  @JsonProperty("rarity")
  @NotNull
  public Integer getRarity() {
    return rarity;
  }

  /**
   * Sets the <code>rarity</code> property.
   */
 public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }

  /**
   * Sets the <code>rarity</code> property.
   */
  public ItemDetailHeldByPokemonInnerVersionDetailsInner rarity(Integer rarity) {
    this.rarity = rarity;
    return this;
  }

 /**
  * Get version
  * @return version
  */
  @JsonProperty("version")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getVersion() {
    return version;
  }

  /**
   * Sets the <code>version</code> property.
   */
 public void setVersion(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
  }

  /**
   * Sets the <code>version</code> property.
   */
  public ItemDetailHeldByPokemonInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

