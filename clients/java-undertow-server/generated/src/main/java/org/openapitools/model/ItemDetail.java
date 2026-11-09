/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemDetail   {
  
  private Integer id;
  private String name;
  private Integer flingPower;
  private ItemFlingEffectSummary flingEffect;
  private List<ItemAttributeSummary> attributes = new ArrayList<>();
  private ItemCategorySummary category;
  private List<ItemEffectText> effectEntries = new ArrayList<>();
  private List<ItemFlavorText> flavorTextEntries = new ArrayList<>();
  private List<ItemGameIndex> gameIndices = new ArrayList<>();
  private List<ItemPrice> prices = new ArrayList<>();
  private List<ItemName> names = new ArrayList<>();
  private List<PokemonHeldItem> heldByPokemon = new ArrayList<>();
  private ItemSprites sprites;
  private EvolutionChainSummary babyTriggerFor;
  private List<ItemMachine> machines = new ArrayList<>();

  /**
   * The identifier for this resource.
   */
  public ItemDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   */
  public ItemDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The power of the move Fling when used with this item.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public ItemDetail flingPower(Integer flingPower) {
    this.flingPower = flingPower;
    return this;
  }

  
  @ApiModelProperty(value = "The power of the move Fling when used with this item.")
  @JsonProperty("fling_power")
  public Integer getFlingPower() {
    return flingPower;
  }
  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }

  /**
   * The effect of the move Fling when used with this item.
   */
  public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect of the move Fling when used with this item.")
  @JsonProperty("fling_effect")
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }
  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  /**
   * A list of attributes this item has.
   */
  public ItemDetail attributes(List<ItemAttributeSummary> attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of attributes this item has.")
  @JsonProperty("attributes")
  public List<ItemAttributeSummary> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<ItemAttributeSummary> attributes) {
    this.attributes = attributes;
  }

  /**
   * The category of items this item falls into.
   */
  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The category of items this item falls into.")
  @JsonProperty("category")
  public ItemCategorySummary getCategory() {
    return category;
  }
  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  /**
   * The effect of this ability listed in different languages.
   */
  public ItemDetail effectEntries(List<ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect of this ability listed in different languages.")
  @JsonProperty("effect_entries")
  public List<ItemEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * The flavor text of this ability listed in different languages.
   */
  public ItemDetail flavorTextEntries(List<ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The flavor text of this ability listed in different languages.")
  @JsonProperty("flavor_text_entries")
  public List<ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * A list of game indices relevent to this item by generation.
   */
  public ItemDetail gameIndices(List<ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of game indices relevent to this item by generation.")
  @JsonProperty("game_indices")
  public List<ItemGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   */
  public ItemDetail prices(List<ItemPrice> prices) {
    this.prices = prices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.")
  @JsonProperty("prices")
  public List<ItemPrice> getPrices() {
    return prices;
  }
  public void setPrices(List<ItemPrice> prices) {
    this.prices = prices;
  }

  /**
   * The name of this item listed in different languages.
   */
  public ItemDetail names(List<ItemName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this item listed in different languages.")
  @JsonProperty("names")
  public List<ItemName> getNames() {
    return names;
  }
  public void setNames(List<ItemName> names) {
    this.names = names;
  }

  /**
   * A list of Pokémon that might be found in the wild holding this item.
   */
  public ItemDetail heldByPokemon(List<PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon that might be found in the wild holding this item.")
  @JsonProperty("held_by_pokemon")
  public List<PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }
  public void setHeldByPokemon(List<PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  /**
   * A set of sprites used to depict this item in the game.
   */
  public ItemDetail sprites(ItemSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this item in the game.")
  @JsonProperty("sprites")
  public ItemSprites getSprites() {
    return sprites;
  }
  public void setSprites(ItemSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * An evolution chain this item requires to produce a bay during mating.
   */
  public ItemDetail babyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "An evolution chain this item requires to produce a bay during mating.")
  @JsonProperty("baby_trigger_for")
  public EvolutionChainSummary getBabyTriggerFor() {
    return babyTriggerFor;
  }
  public void setBabyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  /**
   * A list of the machines related to this item.
   */
  public ItemDetail machines(List<ItemMachine> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of the machines related to this item.")
  @JsonProperty("machines")
  public List<ItemMachine> getMachines() {
    return machines;
  }
  public void setMachines(List<ItemMachine> machines) {
    this.machines = machines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetail itemDetail = (ItemDetail) o;
    return Objects.equals(id, itemDetail.id) &&
        Objects.equals(name, itemDetail.name) &&
        Objects.equals(flingPower, itemDetail.flingPower) &&
        Objects.equals(flingEffect, itemDetail.flingEffect) &&
        Objects.equals(attributes, itemDetail.attributes) &&
        Objects.equals(category, itemDetail.category) &&
        Objects.equals(effectEntries, itemDetail.effectEntries) &&
        Objects.equals(flavorTextEntries, itemDetail.flavorTextEntries) &&
        Objects.equals(gameIndices, itemDetail.gameIndices) &&
        Objects.equals(prices, itemDetail.prices) &&
        Objects.equals(names, itemDetail.names) &&
        Objects.equals(heldByPokemon, itemDetail.heldByPokemon) &&
        Objects.equals(sprites, itemDetail.sprites) &&
        Objects.equals(babyTriggerFor, itemDetail.babyTriggerFor) &&
        Objects.equals(machines, itemDetail.machines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, flingPower, flingEffect, attributes, category, effectEntries, flavorTextEntries, gameIndices, prices, names, heldByPokemon, sprites, babyTriggerFor, machines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flingPower: ").append(toIndentedString(flingPower)).append("\n");
    sb.append("    flingEffect: ").append(toIndentedString(flingEffect)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
    sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    heldByPokemon: ").append(toIndentedString(heldByPokemon)).append("\n");
    sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
    sb.append("    babyTriggerFor: ").append(toIndentedString(babyTriggerFor)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
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

