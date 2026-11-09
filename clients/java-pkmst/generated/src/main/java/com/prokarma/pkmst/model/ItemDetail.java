package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.EvolutionChainSummary;
import com.prokarma.pkmst.model.ItemAttributeSummary;
import com.prokarma.pkmst.model.ItemCategorySummary;
import com.prokarma.pkmst.model.ItemEffectText;
import com.prokarma.pkmst.model.ItemFlavorText;
import com.prokarma.pkmst.model.ItemFlingEffectSummary;
import com.prokarma.pkmst.model.ItemGameIndex;
import com.prokarma.pkmst.model.ItemMachine;
import com.prokarma.pkmst.model.ItemName;
import com.prokarma.pkmst.model.ItemPrice;
import com.prokarma.pkmst.model.ItemSprites;
import com.prokarma.pkmst.model.PokemonHeldItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ItemDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("fling_power")
  private Integer flingPower;

  @JsonProperty("fling_effect")
  private ItemFlingEffectSummary flingEffect;

  @JsonProperty("attributes")
  
  private List<ItemAttributeSummary> attributes = new ArrayList<>();

  @JsonProperty("category")
  private ItemCategorySummary category;

  @JsonProperty("effect_entries")
  
  private List<ItemEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  
  private List<ItemFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("game_indices")
  
  private List<ItemGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("prices")
  
  private List<ItemPrice> prices = new ArrayList<>();

  @JsonProperty("names")
  
  private List<ItemName> names = new ArrayList<>();

  @JsonProperty("held_by_pokemon")
  
  private List<PokemonHeldItem> heldByPokemon = new ArrayList<>();

  @JsonProperty("sprites")
  private ItemSprites sprites;

  @JsonProperty("baby_trigger_for")
  private EvolutionChainSummary babyTriggerFor;

  @JsonProperty("machines")
  
  private List<ItemMachine> machines = new ArrayList<>();

  public ItemDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ItemDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemDetail flingPower(Integer flingPower) {
    this.flingPower = flingPower;
    return this;
  }

  /**
   * The power of the move Fling when used with this item.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return flingPower
   */
  @ApiModelProperty(value = "The power of the move Fling when used with this item.")
  public Integer getFlingPower() {
    return flingPower;
  }

  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }

  public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
    return this;
  }

  /**
   * The effect of the move Fling when used with this item.
   * @return flingEffect
   */
  @ApiModelProperty(required = true, value = "The effect of the move Fling when used with this item.")
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  public ItemDetail attributes(List<ItemAttributeSummary> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ItemDetail addAttributesItem(ItemAttributeSummary attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * A list of attributes this item has.
   * @return attributes
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of attributes this item has.")
  public List<ItemAttributeSummary> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ItemAttributeSummary> attributes) {
    this.attributes = attributes;
  }

  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

  /**
   * The category of items this item falls into.
   * @return category
   */
  @ApiModelProperty(required = true, value = "The category of items this item falls into.")
  public ItemCategorySummary getCategory() {
    return category;
  }

  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  public ItemDetail effectEntries(List<ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public ItemDetail addEffectEntriesItem(ItemEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * The effect of this ability listed in different languages.
   * @return effectEntries
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The effect of this ability listed in different languages.")
  public List<ItemEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ItemDetail flavorTextEntries(List<ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public ItemDetail addFlavorTextEntriesItem(ItemFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  /**
   * The flavor text of this ability listed in different languages.
   * @return flavorTextEntries
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The flavor text of this ability listed in different languages.")
  public List<ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public ItemDetail gameIndices(List<ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public ItemDetail addGameIndicesItem(ItemGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

  /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of game indices relevent to this item by generation.")
  public List<ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public ItemDetail prices(List<ItemPrice> prices) {
    this.prices = prices;
    return this;
  }

  public ItemDetail addPricesItem(ItemPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   * @return prices
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.")
  public List<ItemPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<ItemPrice> prices) {
    this.prices = prices;
  }

  public ItemDetail names(List<ItemName> names) {
    this.names = names;
    return this;
  }

  public ItemDetail addNamesItem(ItemName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this item listed in different languages.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this item listed in different languages.")
  public List<ItemName> getNames() {
    return names;
  }

  public void setNames(List<ItemName> names) {
    this.names = names;
  }

  public ItemDetail heldByPokemon(List<PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
    return this;
  }

  public ItemDetail addHeldByPokemonItem(PokemonHeldItem heldByPokemonItem) {
    if (this.heldByPokemon == null) {
      this.heldByPokemon = new ArrayList<>();
    }
    this.heldByPokemon.add(heldByPokemonItem);
    return this;
  }

  /**
   * A list of Pokémon that might be found in the wild holding this item.
   * @return heldByPokemon
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of Pokémon that might be found in the wild holding this item.")
  public List<PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }

  public void setHeldByPokemon(List<PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  public ItemDetail sprites(ItemSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  /**
   * A set of sprites used to depict this item in the game.
   * @return sprites
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A set of sprites used to depict this item in the game.")
  public ItemSprites getSprites() {
    return sprites;
  }

  public void setSprites(ItemSprites sprites) {
    this.sprites = sprites;
  }

  public ItemDetail babyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
    return this;
  }

  /**
   * An evolution chain this item requires to produce a bay during mating.
   * @return babyTriggerFor
   */
  @ApiModelProperty(required = true, readOnly = true, value = "An evolution chain this item requires to produce a bay during mating.")
  public EvolutionChainSummary getBabyTriggerFor() {
    return babyTriggerFor;
  }

  public void setBabyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  public ItemDetail machines(List<ItemMachine> machines) {
    this.machines = machines;
    return this;
  }

  public ItemDetail addMachinesItem(ItemMachine machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * A list of the machines related to this item.
   * @return machines
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of the machines related to this item.")
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
    return Objects.equals(this.id, itemDetail.id) &&
        Objects.equals(this.name, itemDetail.name) &&
        Objects.equals(this.flingPower, itemDetail.flingPower) &&
        Objects.equals(this.flingEffect, itemDetail.flingEffect) &&
        Objects.equals(this.attributes, itemDetail.attributes) &&
        Objects.equals(this.category, itemDetail.category) &&
        Objects.equals(this.effectEntries, itemDetail.effectEntries) &&
        Objects.equals(this.flavorTextEntries, itemDetail.flavorTextEntries) &&
        Objects.equals(this.gameIndices, itemDetail.gameIndices) &&
        Objects.equals(this.prices, itemDetail.prices) &&
        Objects.equals(this.names, itemDetail.names) &&
        Objects.equals(this.heldByPokemon, itemDetail.heldByPokemon) &&
        Objects.equals(this.sprites, itemDetail.sprites) &&
        Objects.equals(this.babyTriggerFor, itemDetail.babyTriggerFor) &&
        Objects.equals(this.machines, itemDetail.machines);
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

