package org.openapitools.model;

import org.openapitools.model.ItemSummary;
import org.openapitools.model.PokemonHeldItemVersion;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonHeldItemSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The item the referenced Pokémon holds.
   */
  @JsonProperty("item")
  private ItemSummary item;

  /**
   * The details of the different versions in which the item is held.
   */
  @JsonProperty("version_details")
  private List<PokemonHeldItemVersion> versionDetails = new ArrayList<>();

  /**
   * The item the referenced Pokémon holds.
   * @return item
   */
  public ItemSummary getItem() {
    return item;
  }

  public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * The details of the different versions in which the item is held.
   * @return versionDetails
   */
  public List<PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
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
