package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemDetailHeldByPokemonInnerVersionDetailsInner   {
  
  private Integer rarity;
  private AbilityDetailPokemonInnerPokemon version;

  /**
   **/
  
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

