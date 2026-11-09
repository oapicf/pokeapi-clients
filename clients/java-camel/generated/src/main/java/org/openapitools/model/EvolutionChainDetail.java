package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.EvolutionChainLink;
import org.openapitools.model.ItemSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EvolutionChainDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionChainDetail {

  private Integer id;

  private JsonNullable<ItemSummary> babyTriggerItem = JsonNullable.<ItemSummary>undefined();

  private EvolutionChainLink chain;

  public EvolutionChainDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionChainDetail(Integer id, ItemSummary babyTriggerItem, EvolutionChainLink chain) {
    this.id = id;
    this.babyTriggerItem = JsonNullable.of(babyTriggerItem);
    this.chain = chain;
  }

  public EvolutionChainDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EvolutionChainDetail babyTriggerItem(ItemSummary babyTriggerItem) {
    this.babyTriggerItem = JsonNullable.of(babyTriggerItem);
    return this;
  }

  /**
   * The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
   * @return babyTriggerItem
   */
  /* @Present */ @Valid 
  @Schema(name = "baby_trigger_item", description = "The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("baby_trigger_item")
  public JsonNullable<ItemSummary> getBabyTriggerItem() {
    return babyTriggerItem;
  }

  public void setBabyTriggerItem(JsonNullable<ItemSummary> babyTriggerItem) {
    this.babyTriggerItem = babyTriggerItem;
  }

  public EvolutionChainDetail chain(EvolutionChainLink chain) {
    this.chain = chain;
    return this;
  }

  /**
   * The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
   * @return chain
   */
  @Valid 
  @Schema(name = "chain", accessMode = Schema.AccessMode.READ_ONLY, description = "The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chain")
  public EvolutionChainLink getChain() {
    return chain;
  }

  public void setChain(EvolutionChainLink chain) {
    this.chain = chain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionChainDetail evolutionChainDetail = (EvolutionChainDetail) o;
    return Objects.equals(this.id, evolutionChainDetail.id) &&
        Objects.equals(this.babyTriggerItem, evolutionChainDetail.babyTriggerItem) &&
        Objects.equals(this.chain, evolutionChainDetail.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, babyTriggerItem, chain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionChainDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    babyTriggerItem: ").append(toIndentedString(babyTriggerItem)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
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

