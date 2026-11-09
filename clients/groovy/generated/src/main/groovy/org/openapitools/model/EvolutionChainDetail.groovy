package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EvolutionChainLink;
import org.openapitools.model.ItemSummary;

@Canonical
class EvolutionChainDetail {
    /* The identifier for this resource. */
    Integer id
    /* The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. */
    ItemSummary babyTriggerItem
    /* The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. */
    EvolutionChainLink chain
}
