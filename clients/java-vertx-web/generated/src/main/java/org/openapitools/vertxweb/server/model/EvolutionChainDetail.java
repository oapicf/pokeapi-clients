package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.EvolutionChainDetailChain;
import org.openapitools.vertxweb.server.model.ItemSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvolutionChainDetail   {
  
  private Integer id;
  private ItemSummary babyTriggerItem;
  private EvolutionChainDetailChain chain;

  public EvolutionChainDetail () {

  }

  public EvolutionChainDetail (Integer id, ItemSummary babyTriggerItem, EvolutionChainDetailChain chain) {
    this.id = id;
    this.babyTriggerItem = babyTriggerItem;
    this.chain = chain;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("baby_trigger_item")
  public ItemSummary getBabyTriggerItem() {
    return babyTriggerItem;
  }
  public void setBabyTriggerItem(ItemSummary babyTriggerItem) {
    this.babyTriggerItem = babyTriggerItem;
  }

    
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
    return Objects.equals(id, evolutionChainDetail.id) &&
        Objects.equals(babyTriggerItem, evolutionChainDetail.babyTriggerItem) &&
        Objects.equals(chain, evolutionChainDetail.chain);
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
