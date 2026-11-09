package org.openapitools.model;

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
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class ItemDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The power of the move Fling when used with this item.
   */
  @JsonProperty("fling_power")
  private Integer flingPower;

  /**
   * The effect of the move Fling when used with this item.
   */
  @JsonProperty("fling_effect")
  private ItemFlingEffectSummary flingEffect;

  /**
   * A list of attributes this item has.
   */
  @JsonProperty("attributes")
  private List<ItemAttributeSummary> attributes = new ArrayList<>();

  /**
   * The category of items this item falls into.
   */
  @JsonProperty("category")
  private ItemCategorySummary category;

  /**
   * The effect of this ability listed in different languages.
   */
  @JsonProperty("effect_entries")
  private List<ItemEffectText> effectEntries = new ArrayList<>();

  /**
   * The flavor text of this ability listed in different languages.
   */
  @JsonProperty("flavor_text_entries")
  private List<ItemFlavorText> flavorTextEntries = new ArrayList<>();

  /**
   * A list of game indices relevent to this item by generation.
   */
  @JsonProperty("game_indices")
  private List<ItemGameIndex> gameIndices = new ArrayList<>();

  /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   */
  @JsonProperty("prices")
  private List<ItemPrice> prices = new ArrayList<>();

  /**
   * The name of this item listed in different languages.
   */
  @JsonProperty("names")
  private List<ItemName> names = new ArrayList<>();

  /**
   * A list of Pokémon that might be found in the wild holding this item.
   */
  @JsonProperty("held_by_pokemon")
  private List<PokemonHeldItem> heldByPokemon = new ArrayList<>();

  /**
   * A set of sprites used to depict this item in the game.
   */
  @JsonProperty("sprites")
  private ItemSprites sprites;

  /**
   * An evolution chain this item requires to produce a bay during mating.
   */
  @JsonProperty("baby_trigger_for")
  private EvolutionChainSummary babyTriggerFor;

  /**
   * A list of the machines related to this item.
   */
  @JsonProperty("machines")
  private List<ItemMachine> machines = new ArrayList<>();

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
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The power of the move Fling when used with this item.
   * @return flingPower
   */
  public Integer getFlingPower() {
    return flingPower;
  }

  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }

  /**
   * The effect of the move Fling when used with this item.
   * @return flingEffect
   */
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  /**
   * A list of attributes this item has.
   * @return attributes
   */
  public List<ItemAttributeSummary> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ItemAttributeSummary> attributes) {
    this.attributes = attributes;
  }

  /**
   * The category of items this item falls into.
   * @return category
   */
  public ItemCategorySummary getCategory() {
    return category;
  }

  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  /**
   * The effect of this ability listed in different languages.
   * @return effectEntries
   */
  public List<ItemEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * The flavor text of this ability listed in different languages.
   * @return flavorTextEntries
   */
  public List<ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
   */
  public List<ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   * @return prices
   */
  public List<ItemPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<ItemPrice> prices) {
    this.prices = prices;
  }

  /**
   * The name of this item listed in different languages.
   * @return names
   */
  public List<ItemName> getNames() {
    return names;
  }

  public void setNames(List<ItemName> names) {
    this.names = names;
  }

  /**
   * A list of Pokémon that might be found in the wild holding this item.
   * @return heldByPokemon
   */
  public List<PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }

  public void setHeldByPokemon(List<PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  /**
   * A set of sprites used to depict this item in the game.
   * @return sprites
   */
  public ItemSprites getSprites() {
    return sprites;
  }

  public void setSprites(ItemSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * An evolution chain this item requires to produce a bay during mating.
   * @return babyTriggerFor
   */
  public EvolutionChainSummary getBabyTriggerFor() {
    return babyTriggerFor;
  }

  public void setBabyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  /**
   * A list of the machines related to this item.
   * @return machines
   */
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
