package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EvolutionChainSummary;
import org.openapitools.model.ItemAttributeSummary;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemEffectText;
import org.openapitools.model.ItemFlavorText;
import org.openapitools.model.ItemFlingEffectSummary;
import org.openapitools.model.ItemGameIndex;
import org.openapitools.model.ItemMachine;
import org.openapitools.model.ItemName;
import org.openapitools.model.ItemPrice;
import org.openapitools.model.ItemSprites;
import org.openapitools.model.PokemonHeldItem;

@Canonical
class ItemDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The power of the move Fling when used with this item. */
    Integer flingPower
    /* The effect of the move Fling when used with this item. */
    ItemFlingEffectSummary flingEffect
    /* A list of attributes this item has. */
    List<ItemAttributeSummary> attributes = new ArrayList<>()
    /* The category of items this item falls into. */
    ItemCategorySummary category
    /* The effect of this ability listed in different languages. */
    List<ItemEffectText> effectEntries = new ArrayList<>()
    /* The flavor text of this ability listed in different languages. */
    List<ItemFlavorText> flavorTextEntries = new ArrayList<>()
    /* A list of game indices relevent to this item by generation. */
    List<ItemGameIndex> gameIndices = new ArrayList<>()
    /* Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. */
    List<ItemPrice> prices = new ArrayList<>()
    /* The name of this item listed in different languages. */
    List<ItemName> names = new ArrayList<>()
    /* A list of Pokémon that might be found in the wild holding this item. */
    List<PokemonHeldItem> heldByPokemon = new ArrayList<>()
    /* A set of sprites used to depict this item in the game. */
    ItemSprites sprites
    /* An evolution chain this item requires to produce a bay during mating. */
    EvolutionChainSummary babyTriggerFor
    /* A list of the machines related to this item. */
    List<ItemMachine> machines = new ArrayList<>()
}
