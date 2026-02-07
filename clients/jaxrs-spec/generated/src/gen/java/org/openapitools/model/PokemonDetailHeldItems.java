package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemDetailHeldByPokemonInnerVersionDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonDetail_held_items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailHeldItems   {
  private AbilityDetailPokemonInnerPokemon item;
  private @Valid List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public PokemonDetailHeldItems() {
  }

  @JsonCreator
  public PokemonDetailHeldItems(
    @JsonProperty(required = true, value = "item") AbilityDetailPokemonInnerPokemon item,
    @JsonProperty(required = true, value = "version_details") List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails
  ) {
    this.item = item;
    this.versionDetails = versionDetails;
  }

  /**
   **/
  public PokemonDetailHeldItems item(AbilityDetailPokemonInnerPokemon item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "item")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getItem() {
    return item;
  }

  @JsonProperty(required = true, value = "item")
  public void setItem(AbilityDetailPokemonInnerPokemon item) {
    this.item = item;
  }

  /**
   **/
  public PokemonDetailHeldItems versionDetails(List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version_details")
  @NotNull @Valid public List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty(required = true, value = "version_details")
  public void setVersionDetails(List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonDetailHeldItems addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }

    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  public PokemonDetailHeldItems removeVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
    if (versionDetailsItem != null && this.versionDetails != null) {
      this.versionDetails.remove(versionDetailsItem);
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
    PokemonDetailHeldItems pokemonDetailHeldItems = (PokemonDetailHeldItems) o;
    return Objects.equals(this.item, pokemonDetailHeldItems.item) &&
        Objects.equals(this.versionDetails, pokemonDetailHeldItems.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailHeldItems {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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

