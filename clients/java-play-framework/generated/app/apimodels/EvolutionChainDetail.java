package apimodels;

import apimodels.EvolutionChainDetailChain;
import apimodels.ItemSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EvolutionChainDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EvolutionChainDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("baby_trigger_item")
  @NotNull
@Valid

  private ItemSummary babyTriggerItem;

  @JsonProperty("chain")
  @NotNull
@Valid

  private EvolutionChainDetailChain chain;

  public EvolutionChainDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

