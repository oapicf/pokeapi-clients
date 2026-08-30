package org.openapitools.server.model;

import org.openapitools.server.model.EvolutionChainDetailChain;
import org.openapitools.server.model.ItemSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionChainDetail   {

    private Integer id;
    private ItemSummary babyTriggerItem;
    private EvolutionChainDetailChain chain;

    /**
     * Default constructor.
     */
    public EvolutionChainDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionChainDetail.
     *
     * @param id id
     * @param babyTriggerItem babyTriggerItem
     * @param chain chain
     */
    public EvolutionChainDetail(
        Integer id, 
        ItemSummary babyTriggerItem, 
        EvolutionChainDetailChain chain
    ) {
        this.id = id;
        this.babyTriggerItem = babyTriggerItem;
        this.chain = chain;
    }



    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get babyTriggerItem
     * @return babyTriggerItem
     */
    public ItemSummary getBabyTriggerItem() {
        return babyTriggerItem;
    }

    public void setBabyTriggerItem(ItemSummary babyTriggerItem) {
        this.babyTriggerItem = babyTriggerItem;
    }

    /**
     * Get chain
     * @return chain
     */
    public EvolutionChainDetailChain getChain() {
        return chain;
    }

    public void setChain(EvolutionChainDetailChain chain) {
        this.chain = chain;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

