package org.openapitools.model;

import org.openapitools.model.EvolutionChainDetailChain;
import org.openapitools.model.ItemSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionChainDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private ItemSummary babyTriggerItem;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private EvolutionChainDetailChain chain;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get babyTriggerItem
   * @return babyTriggerItem
  **/
  @JsonProperty("baby_trigger_item")
  @NotNull
  public ItemSummary getBabyTriggerItem() {
    return babyTriggerItem;
  }

  public void setBabyTriggerItem(ItemSummary babyTriggerItem) {
    this.babyTriggerItem = babyTriggerItem;
  }

  public EvolutionChainDetail babyTriggerItem(ItemSummary babyTriggerItem) {
    this.babyTriggerItem = babyTriggerItem;
    return this;
  }

 /**
   * Get chain
   * @return chain
  **/
  @JsonProperty("chain")
  @NotNull
  public EvolutionChainDetailChain getChain() {
    return chain;
  }

  public void setChain(EvolutionChainDetailChain chain) {
    this.chain = chain;
  }

  public EvolutionChainDetail chain(EvolutionChainDetailChain chain) {
    this.chain = chain;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

