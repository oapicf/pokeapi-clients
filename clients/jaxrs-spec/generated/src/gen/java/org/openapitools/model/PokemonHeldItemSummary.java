package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.PokemonHeldItemVersion;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonHeldItemSummary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonHeldItemSummary   {
  private ItemSummary item;
  private List<@Valid PokemonHeldItemVersion> versionDetails = new ArrayList<>();

  public PokemonHeldItemSummary() {
  }

  @JsonCreator
  public PokemonHeldItemSummary(
    @JsonProperty(required = true, value = "item") ItemSummary item,
    @JsonProperty(required = true, value = "version_details") List<@Valid PokemonHeldItemVersion> versionDetails
  ) {
    this.item = item;
    this.versionDetails = versionDetails;
  }

  /**
   * The item the referenced Pokémon holds.
   **/
  public PokemonHeldItemSummary item(ItemSummary item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The item the referenced Pokémon holds.")
  @JsonProperty(required = true, value = "item")
  @NotNull @Valid public ItemSummary getItem() {
    return item;
  }

  @JsonProperty(required = true, value = "item")
  public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * The details of the different versions in which the item is held.
   **/
  public PokemonHeldItemSummary versionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The details of the different versions in which the item is held.")
  @JsonProperty(required = true, value = "version_details")
  @NotNull public List<@Valid PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty(required = true, value = "version_details")
  public void setVersionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonHeldItemSummary addVersionDetailsItem(PokemonHeldItemVersion versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }

    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  public PokemonHeldItemSummary removeVersionDetailsItem(PokemonHeldItemVersion versionDetailsItem) {
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
    PokemonHeldItemSummary pokemonHeldItemSummary = (PokemonHeldItemSummary) o;
    return Objects.equals(this.item, pokemonHeldItemSummary.item) &&
        Objects.equals(this.versionDetails, pokemonHeldItemSummary.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonHeldItemSummary {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
