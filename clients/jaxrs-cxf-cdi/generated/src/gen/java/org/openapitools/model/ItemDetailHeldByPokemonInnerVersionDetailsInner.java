package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ItemDetailHeldByPokemonInnerVersionDetailsInner   {
  
  private Integer rarity;

  private AbilityDetailPokemonInnerPokemon version;

  /**
   **/
  public ItemDetailHeldByPokemonInnerVersionDetailsInner rarity(Integer rarity) {
    this.rarity = rarity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rarity")
  @NotNull
  public Integer getRarity() {
    return rarity;
  }
  public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }


  /**
   **/
  public ItemDetailHeldByPokemonInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version")
  @NotNull
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

