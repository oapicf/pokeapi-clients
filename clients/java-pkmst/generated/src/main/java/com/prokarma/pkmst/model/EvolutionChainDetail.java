package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.EvolutionChainDetailChain;
import com.prokarma.pkmst.model.ItemSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * EvolutionChainDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("baby_trigger_item")
  private ItemSummary babyTriggerItem;

  @JsonProperty("chain")
  private EvolutionChainDetailChain chain;

  public EvolutionChainDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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

