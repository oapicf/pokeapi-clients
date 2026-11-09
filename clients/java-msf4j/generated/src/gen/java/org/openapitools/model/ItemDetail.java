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

/**
 * ItemDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  private List<@Valid ItemAttributeSummary> attributes = new ArrayList<>();

  @JsonProperty("category")
  private ItemCategorySummary category;

  @JsonProperty("effect_entries")
  private List<@Valid ItemEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  private List<@Valid ItemFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("game_indices")
  private List<@Valid ItemGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("prices")
  private List<@Valid ItemPrice> prices = new ArrayList<>();

  @JsonProperty("names")
  private List<@Valid ItemName> names = new ArrayList<>();

  @JsonProperty("held_by_pokemon")
  private List<@Valid PokemonHeldItem> heldByPokemon = new ArrayList<>();

  @JsonProperty("sprites")
  private ItemSprites sprites;

  @JsonProperty("baby_trigger_for")
  private EvolutionChainSummary babyTriggerFor;

  @JsonProperty("machines")
  private List<@Valid ItemMachine> machines = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public ItemDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
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
  **/
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
  **/
  @ApiModelProperty(required = true, value = "The effect of the move Fling when used with this item.")
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

   /**
   * A list of attributes this item has.
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "A list of attributes this item has.")
  public List<@Valid ItemAttributeSummary> getAttributes() {
    return attributes;
  }

  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

   /**
   * The category of items this item falls into.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The category of items this item falls into.")
  public ItemCategorySummary getCategory() {
    return category;
  }

  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

   /**
   * The effect of this ability listed in different languages.
   * @return effectEntries
  **/
  @ApiModelProperty(required = true, value = "The effect of this ability listed in different languages.")
  public List<@Valid ItemEffectText> getEffectEntries() {
    return effectEntries;
  }

   /**
   * The flavor text of this ability listed in different languages.
   * @return flavorTextEntries
  **/
  @ApiModelProperty(required = true, value = "The flavor text of this ability listed in different languages.")
  public List<@Valid ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

   /**
   * A list of game indices relevent to this item by generation.
   * @return gameIndices
  **/
  @ApiModelProperty(required = true, value = "A list of game indices relevent to this item by generation.")
  public List<@Valid ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

   /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   * @return prices
  **/
  @ApiModelProperty(required = true, value = "Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.")
  public List<@Valid ItemPrice> getPrices() {
    return prices;
  }

   /**
   * The name of this item listed in different languages.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "The name of this item listed in different languages.")
  public List<@Valid ItemName> getNames() {
    return names;
  }

   /**
   * A list of Pokémon that might be found in the wild holding this item.
   * @return heldByPokemon
  **/
  @ApiModelProperty(required = true, value = "A list of Pokémon that might be found in the wild holding this item.")
  public List<@Valid PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }

   /**
   * A set of sprites used to depict this item in the game.
   * @return sprites
  **/
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this item in the game.")
  public ItemSprites getSprites() {
    return sprites;
  }

   /**
   * An evolution chain this item requires to produce a bay during mating.
   * @return babyTriggerFor
  **/
  @ApiModelProperty(required = true, value = "An evolution chain this item requires to produce a bay during mating.")
  public EvolutionChainSummary getBabyTriggerFor() {
    return babyTriggerFor;
  }

   /**
   * A list of the machines related to this item.
   * @return machines
  **/
  @ApiModelProperty(required = true, value = "A list of the machines related to this item.")
  public List<@Valid ItemMachine> getMachines() {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

