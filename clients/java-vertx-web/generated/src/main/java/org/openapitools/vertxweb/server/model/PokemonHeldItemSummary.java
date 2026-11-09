package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ItemSummary;
import org.openapitools.vertxweb.server.model.PokemonHeldItemVersion;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonHeldItemSummary   {
  
  private ItemSummary item;
  private List<PokemonHeldItemVersion> versionDetails = new ArrayList<>();

  public PokemonHeldItemSummary () {

  }

  public PokemonHeldItemSummary (ItemSummary item, List<PokemonHeldItemVersion> versionDetails) {
    this.item = item;
    this.versionDetails = versionDetails;
  }

    
  @JsonProperty("item")
  public ItemSummary getItem() {
    return item;
  }
  public void setItem(ItemSummary item) {
    this.item = item;
  }

    
  @JsonProperty("version_details")
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
    return Objects.equals(item, pokemonHeldItemSummary.item) &&
        Objects.equals(versionDetails, pokemonHeldItemSummary.versionDetails);
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
