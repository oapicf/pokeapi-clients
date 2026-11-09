package org.openapitools.server.model;

import org.openapitools.server.model.EvolutionChainLink;
import org.openapitools.server.model.ItemSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionChainDetail   {

    private Integer id;
    private ItemSummary babyTriggerItem;
    private EvolutionChainLink chain;

    /**
     * Default constructor.
     */
    public EvolutionChainDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionChainDetail.
     *
     * @param id The identifier for this resource.
     * @param babyTriggerItem The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
     * @param chain The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
     */
    public EvolutionChainDetail(
        Integer id, 
        ItemSummary babyTriggerItem, 
        EvolutionChainLink chain
    ) {
        this.id = id;
        this.babyTriggerItem = babyTriggerItem;
        this.chain = chain;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
     * @return babyTriggerItem
     */
    public ItemSummary getBabyTriggerItem() {
        return babyTriggerItem;
    }

    public void setBabyTriggerItem(ItemSummary babyTriggerItem) {
        this.babyTriggerItem = babyTriggerItem;
    }

    /**
     * The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
     * @return chain
     */
    public EvolutionChainLink getChain() {
        return chain;
    }

    public void setChain(EvolutionChainLink chain) {
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

