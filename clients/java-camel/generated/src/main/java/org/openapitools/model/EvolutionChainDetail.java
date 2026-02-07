package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.EvolutionChainDetailChain;
import org.openapitools.model.ItemSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EvolutionChainDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetail {

  private Integer id;

  private ItemSummary babyTriggerItem;

  private EvolutionChainDetailChain chain;

  public EvolutionChainDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionChainDetail(Integer id, ItemSummary babyTriggerItem, EvolutionChainDetailChain chain) {
    this.id = id;
    this.babyTriggerItem = babyTriggerItem;
    this.chain = chain;
  }

  public EvolutionChainDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EvolutionChainDetail babyTriggerItem(ItemSummary babyTriggerItem) {
    this.babyTriggerItem = babyTriggerItem;
    return this;
  }

  /**
   * Get babyTriggerItem
   * @return babyTriggerItem
   */
  @NotNull @Valid 
  @Schema(name = "baby_trigger_item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("baby_trigger_item")
  public ItemSummary getBabyTriggerItem() {
    return babyTriggerItem;
  }

  public void setBabyTriggerItem(ItemSummary babyTriggerItem) {
    this.babyTriggerItem = babyTriggerItem;
  }

  public EvolutionChainDetail chain(EvolutionChainDetailChain chain) {
    this.chain = chain;
    return this;
  }

  /**
   * Get chain
   * @return chain
   */
  @NotNull @Valid 
  @Schema(name = "chain", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chain")
  public EvolutionChainDetailChain getChain() {
    return chain;
  }

  public void setChain(EvolutionChainDetailChain chain) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

