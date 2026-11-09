package apimodels;

import apimodels.EvolutionChainSummary;
import apimodels.ItemAttributeSummary;
import apimodels.ItemCategorySummary;
import apimodels.ItemEffectText;
import apimodels.ItemFlavorText;
import apimodels.ItemFlingEffectSummary;
import apimodels.ItemGameIndex;
import apimodels.ItemMachine;
import apimodels.ItemName;
import apimodels.ItemPrice;
import apimodels.ItemSprites;
import apimodels.PokemonHeldItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("fling_power")
  @Min(-2147483648)
@Max(2147483647)

  private Integer flingPower;

  @JsonProperty("fling_effect")
  @NotNull
@Valid

  private ItemFlingEffectSummary flingEffect;

  @JsonProperty("attributes")
  @NotNull
@Valid

  private List<@Valid ItemAttributeSummary> attributes = new ArrayList<>();

  @JsonProperty("category")
  @NotNull
@Valid

  private ItemCategorySummary category;

  @JsonProperty("effect_entries")
  @NotNull
@Valid

  private List<@Valid ItemEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  @NotNull
@Valid

  private List<@Valid ItemFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("game_indices")
  @NotNull
@Valid

  private List<@Valid ItemGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("prices")
  @NotNull
@Valid

  private List<@Valid ItemPrice> prices = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid ItemName> names = new ArrayList<>();

  @JsonProperty("held_by_pokemon")
  @NotNull
@Valid

  private List<@Valid PokemonHeldItem> heldByPokemon = new ArrayList<>();

  @JsonProperty("sprites")
  @NotNull
@Valid

  private ItemSprites sprites;

  @JsonProperty("baby_trigger_for")
  @NotNull
@Valid

  private EvolutionChainSummary babyTriggerFor;

  @JsonProperty("machines")
  @NotNull
@Valid

  private List<@Valid ItemMachine> machines = new ArrayList<>();

  public ItemDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
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
  **/
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
  public ItemFlingEffectSummary getFlingEffect() {
    return flingEffect;
  }

  public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
    this.flingEffect = flingEffect;
  }

  public ItemDetail attributes(List<@Valid ItemAttributeSummary> attributes) {
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
  **/
  public List<@Valid ItemAttributeSummary> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid ItemAttributeSummary> attributes) {
    this.attributes = attributes;
  }

  public ItemDetail category(ItemCategorySummary category) {
    this.category = category;
    return this;
  }

   /**
   * The category of items this item falls into.
   * @return category
  **/
  public ItemCategorySummary getCategory() {
    return category;
  }

  public void setCategory(ItemCategorySummary category) {
    this.category = category;
  }

  public ItemDetail effectEntries(List<@Valid ItemEffectText> effectEntries) {
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
  **/
  public List<@Valid ItemEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid ItemEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ItemDetail flavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
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
  **/
  public List<@Valid ItemFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid ItemFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public ItemDetail gameIndices(List<@Valid ItemGameIndex> gameIndices) {
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
  **/
  public List<@Valid ItemGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<@Valid ItemGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public ItemDetail prices(List<@Valid ItemPrice> prices) {
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
  **/
  public List<@Valid ItemPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<@Valid ItemPrice> prices) {
    this.prices = prices;
  }

  public ItemDetail names(List<@Valid ItemName> names) {
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
  **/
  public List<@Valid ItemName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ItemName> names) {
    this.names = names;
  }

  public ItemDetail heldByPokemon(List<@Valid PokemonHeldItem> heldByPokemon) {
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
  **/
  public List<@Valid PokemonHeldItem> getHeldByPokemon() {
    return heldByPokemon;
  }

  public void setHeldByPokemon(List<@Valid PokemonHeldItem> heldByPokemon) {
    this.heldByPokemon = heldByPokemon;
  }

  public ItemDetail sprites(ItemSprites sprites) {
    this.sprites = sprites;
    return this;
  }

   /**
   * A set of sprites used to depict this item in the game.
   * @return sprites
  **/
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
  **/
  public EvolutionChainSummary getBabyTriggerFor() {
    return babyTriggerFor;
  }

  public void setBabyTriggerFor(EvolutionChainSummary babyTriggerFor) {
    this.babyTriggerFor = babyTriggerFor;
  }

  public ItemDetail machines(List<@Valid ItemMachine> machines) {
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
  **/
  public List<@Valid ItemMachine> getMachines() {
    return machines;
  }

  public void setMachines(List<@Valid ItemMachine> machines) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

