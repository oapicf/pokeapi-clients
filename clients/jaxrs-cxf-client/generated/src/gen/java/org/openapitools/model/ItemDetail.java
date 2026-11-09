package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * The power of the move Fling when used with this item.
  */
  @ApiModelProperty(value = "The power of the move Fling when used with this item.")

  private Integer flingPower;

 /**
  * The effect of the move Fling when used with this item.
  */
  @ApiModelProperty(required = true, value = "The effect of the move Fling when used with this item.")

  private ItemFlingEffectSummary flingEffect;

 /**
  * A list of attributes this item has.
  */
  @ApiModelProperty(required = true, value = "A list of attributes this item has.")

  private List<ItemAttributeSummary> attributes = new ArrayList<>();

 /**
  * The category of items this item falls into.
  */
  @ApiModelProperty(required = true, value = "The category of items this item falls into.")

  private ItemCategorySummary category;

 /**
  * The effect of this ability listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The effect of this ability listed in different languages.")

  private List<ItemEffectText> effectEntries = new ArrayList<>();

 /**
  * The flavor text of this ability listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The flavor text of this ability listed in different languages.")

  private List<ItemFlavorText> flavorTextEntries = new ArrayList<>();

 /**
  * A list of game indices relevent to this item by generation.
  */
  @ApiModelProperty(required = true, value = "A list of game indices relevent to this item by generation.")

  private List<ItemGameIndex> gameIndices = new ArrayList<>();

 /**
  * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
  */
  @ApiModelProperty(required = true, value = "Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.")

  private List<ItemPrice> prices = new ArrayList<>();

 /**
  * The name of this item listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this item listed in different languages.")

  private List<ItemName> names = new ArrayList<>();

 /**
  * A list of Pokémon that might be found in the wild holding this item.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon that might be found in the wild holding this item.")

  private List<PokemonHeldItem> heldByPokemon = new ArrayList<>();

 /**
  * A set of sprites used to depict this item in the game.
  */
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this item in the game.")

  private ItemSprites sprites;

 /**
  * An evolution chain this item requires to produce a bay during mating.
  */
  @ApiModelProperty(required = true, value = "An evolution chain this item requires to produce a bay during mating.")

  private EvolutionChainSummary babyTriggerFor;

 /**
  * A list of the machines related to this item.
  */
  @ApiModelProperty(required = true, value = "A list of the machines related to this item.")

  private List<ItemMachine> machines = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The power of the move Fling when used with this item.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return flingPower
  **/
  @JsonProperty("fling_power")
  public Integer getFlingPower() {
    return flingPower;
  }

  public void setFlingPower(Integer flingPower) {
    this.flingPower = flingPower;
  }

  public ItemDetail flingPower(Integer flingPower) {
    this.flingPower = flingPower;
    return this;
  }

 /**
   * The effect of the move Fling when used with this item.
   * @return flingEffect
  **/
  @JsonProperty("fling_effect")
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
    return this;
  }

 /**
   * A list of attributes this item has.
   * @return attributes
  **/
  @JsonProperty("attributes")
  public List<ItemAttributeSummary> getAttributes() {
    return attributes;
  }


 /**
   * The category of items this item falls into.
   * @return category
  **/
  @JsonProperty("category")
  public ItemCategorySummary getCategory() {
    return category;
  }

  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

 /**
   * The effect of this ability listed in different languages.
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  public List<ItemEffectText> getEffectEntries() {
    return effectEntries;
  }


 /**
   * The flavor text of this ability listed in different languages.
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  public List<ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }


 /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
  **/
  @JsonProperty("game_indices")
  public List<ItemGameIndex> getGameIndices() {
    return gameIndices;
  }


 /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   * @return prices
  **/
  @JsonProperty("prices")
  public List<ItemPrice> getPrices() {
    return prices;
  }


 /**
   * The name of this item listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<ItemName> getNames() {
    return names;
  }


 /**
   * A list of Pokémon that might be found in the wild holding this item.
   * @return heldByPokemon
  **/
  @JsonProperty("held_by_pokemon")
  public List<PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }


 /**
   * A set of sprites used to depict this item in the game.
   * @return sprites
  **/
  @JsonProperty("sprites")
  public ItemSprites getSprites() {
    return sprites;
  }


 /**
   * An evolution chain this item requires to produce a bay during mating.
   * @return babyTriggerFor
  **/
  @JsonProperty("baby_trigger_for")
  public EvolutionChainSummary getBabyTriggerFor() {
    return babyTriggerFor;
  }


 /**
   * A list of the machines related to this item.
   * @return machines
  **/
  @JsonProperty("machines")
  public List<ItemMachine> getMachines() {
    return machines;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

