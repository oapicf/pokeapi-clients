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
import org.openapitools.model.ContestEffectSummary;
import org.openapitools.model.ContestTypeSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.ItemMachine;
import org.openapitools.model.MoveChange;
import org.openapitools.model.MoveCombos;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveEffectChange;
import org.openapitools.model.MoveEffectEffectText;
import org.openapitools.model.MoveFlavorText;
import org.openapitools.model.MoveMeta;
import org.openapitools.model.MoveMetaStatChange;
import org.openapitools.model.MoveName;
import org.openapitools.model.MoveTargetSummary;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.SuperContestEffectSummary;
import org.openapitools.model.TypeSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveDetail   {
  
  private Integer id;
  private String name;
  private Integer accuracy;
  private Integer effectChance;
  private Integer pp;
  private Integer priority;
  private Integer power;
  private MoveCombos contestCombos;
  private ContestTypeSummary contestType;
  private ContestEffectSummary contestEffect;
  private MoveDamageClassSummary damageClass;
  private List<MoveEffectEffectText> effectEntries = new ArrayList<>();
  private List<MoveEffectChange> effectChanges = new ArrayList<>();
  private GenerationSummary generation;
  private MoveMeta meta;
  private List<MoveName> names = new ArrayList<>();
  private List<MoveChange> pastValues = new ArrayList<>();
  private List<MoveMetaStatChange> statChanges = new ArrayList<>();
  private SuperContestEffectSummary superContestEffect;
  private MoveTargetSummary target;
  private TypeSummary type;
  private List<ItemMachine> machines = new ArrayList<>();
  private List<MoveFlavorText> flavorTextEntries = new ArrayList<>();
  private List<PokemonSummary> learnedByPokemon = new ArrayList<>();

  /**
   * The identifier for this resource.
   */
  public MoveDetail id(Integer id) {
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
  public MoveDetail name(String name) {
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
   * The percent value of how likely this move is to be successful.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public MoveDetail accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  
  @ApiModelProperty(value = "The percent value of how likely this move is to be successful.")
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   * The percent value of how likely it is this moves effect will happen.
   */
  public MoveDetail effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The percent value of how likely it is this moves effect will happen.")
  @JsonProperty("effect_chance")
  public Integer getEffectChance() {
    return effectChance;
  }
  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   * Power points. The number of times this move can be used.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public MoveDetail pp(Integer pp) {
    this.pp = pp;
    return this;
  }

  
  @ApiModelProperty(value = "Power points. The number of times this move can be used.")
  @JsonProperty("pp")
  public Integer getPp() {
    return pp;
  }
  public void setPp(Integer pp) {
    this.pp = pp;
  }

  /**
   * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public MoveDetail priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * The base power of this move, or null if it has no fixed base power.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public MoveDetail power(Integer power) {
    this.power = power;
    return this;
  }

  
  @ApiModelProperty(value = "The base power of this move, or null if it has no fixed base power.")
  @JsonProperty("power")
  public Integer getPower() {
    return power;
  }
  public void setPower(Integer power) {
    this.power = power;
  }

  /**
   * A detail of normal and super contest combos that require this move.
   */
  public MoveDetail contestCombos(MoveCombos contestCombos) {
    this.contestCombos = contestCombos;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A detail of normal and super contest combos that require this move.")
  @JsonProperty("contest_combos")
  public MoveCombos getContestCombos() {
    return contestCombos;
  }
  public void setContestCombos(MoveCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

  /**
   * The type of appeal this move gives a Pokémon when used in a contest.
   */
  public MoveDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of appeal this move gives a Pokémon when used in a contest.")
  @JsonProperty("contest_type")
  public ContestTypeSummary getContestType() {
    return contestType;
  }
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  /**
   * The effect the move has when used in a contest.
   */
  public MoveDetail contestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect the move has when used in a contest.")
  @JsonProperty("contest_effect")
  public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }
  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }

  /**
   * The type of damage the move inflicts on the target, e.g. physical.
   */
  public MoveDetail damageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of damage the move inflicts on the target, e.g. physical.")
  @JsonProperty("damage_class")
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }
  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  /**
   * The effect of this move listed in different languages.
   */
  public MoveDetail effectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect of this move listed in different languages.")
  @JsonProperty("effect_entries")
  public List<MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * The list of previous effects this move has had across version groups of the games.
   */
  public MoveDetail effectChanges(List<MoveEffectChange> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The list of previous effects this move has had across version groups of the games.")
  @JsonProperty("effect_changes")
  public List<MoveEffectChange> getEffectChanges() {
    return effectChanges;
  }
  public void setEffectChanges(List<MoveEffectChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  /**
   * The generation in which this move was introduced.
   */
  public MoveDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The generation in which this move was introduced.")
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * Metadata about this move
   */
  public MoveDetail meta(MoveMeta meta) {
    this.meta = meta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Metadata about this move")
  @JsonProperty("meta")
  public MoveMeta getMeta() {
    return meta;
  }
  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }

  /**
   * The name of this resource listed in different languages.
   */
  public MoveDetail names(List<MoveName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  public List<MoveName> getNames() {
    return names;
  }
  public void setNames(List<MoveName> names) {
    this.names = names;
  }

  /**
   * A list of move resource value changes across version groups of the game.
   */
  public MoveDetail pastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of move resource value changes across version groups of the game.")
  @JsonProperty("past_values")
  public List<MoveChange> getPastValues() {
    return pastValues;
  }
  public void setPastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  /**
   * A list of stats this moves effects and how much it effects them.
   */
  public MoveDetail statChanges(List<MoveMetaStatChange> statChanges) {
    this.statChanges = statChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of stats this moves effects and how much it effects them.")
  @JsonProperty("stat_changes")
  public List<MoveMetaStatChange> getStatChanges() {
    return statChanges;
  }
  public void setStatChanges(List<MoveMetaStatChange> statChanges) {
    this.statChanges = statChanges;
  }

  /**
   * The effect the move has when used in a super contest.
   */
  public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The effect the move has when used in a super contest.")
  @JsonProperty("super_contest_effect")
  public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }
  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

  /**
   * The type of target that will receive the effects of the attack.
   */
  public MoveDetail target(MoveTargetSummary target) {
    this.target = target;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of target that will receive the effects of the attack.")
  @JsonProperty("target")
  public MoveTargetSummary getTarget() {
    return target;
  }
  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

  /**
   * The elemental type of this move.
   */
  public MoveDetail type(TypeSummary type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The elemental type of this move.")
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }
  public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   * A list of the machines that teach this move.
   */
  public MoveDetail machines(List<ItemMachine> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of the machines that teach this move.")
  @JsonProperty("machines")
  public List<ItemMachine> getMachines() {
    return machines;
  }
  public void setMachines(List<ItemMachine> machines) {
    this.machines = machines;
  }

  /**
   * The flavor text of this move listed in different languages.
   */
  public MoveDetail flavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The flavor text of this move listed in different languages.")
  @JsonProperty("flavor_text_entries")
  public List<MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * List of Pokemon that can learn the move
   */
  public MoveDetail learnedByPokemon(List<PokemonSummary> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of Pokemon that can learn the move")
  @JsonProperty("learned_by_pokemon")
  public List<PokemonSummary> getLearnedByPokemon() {
    return learnedByPokemon;
  }
  public void setLearnedByPokemon(List<PokemonSummary> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveDetail moveDetail = (MoveDetail) o;
    return Objects.equals(id, moveDetail.id) &&
        Objects.equals(name, moveDetail.name) &&
        Objects.equals(accuracy, moveDetail.accuracy) &&
        Objects.equals(effectChance, moveDetail.effectChance) &&
        Objects.equals(pp, moveDetail.pp) &&
        Objects.equals(priority, moveDetail.priority) &&
        Objects.equals(power, moveDetail.power) &&
        Objects.equals(contestCombos, moveDetail.contestCombos) &&
        Objects.equals(contestType, moveDetail.contestType) &&
        Objects.equals(contestEffect, moveDetail.contestEffect) &&
        Objects.equals(damageClass, moveDetail.damageClass) &&
        Objects.equals(effectEntries, moveDetail.effectEntries) &&
        Objects.equals(effectChanges, moveDetail.effectChanges) &&
        Objects.equals(generation, moveDetail.generation) &&
        Objects.equals(meta, moveDetail.meta) &&
        Objects.equals(names, moveDetail.names) &&
        Objects.equals(pastValues, moveDetail.pastValues) &&
        Objects.equals(statChanges, moveDetail.statChanges) &&
        Objects.equals(superContestEffect, moveDetail.superContestEffect) &&
        Objects.equals(target, moveDetail.target) &&
        Objects.equals(type, moveDetail.type) &&
        Objects.equals(machines, moveDetail.machines) &&
        Objects.equals(flavorTextEntries, moveDetail.flavorTextEntries) &&
        Objects.equals(learnedByPokemon, moveDetail.learnedByPokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accuracy, effectChance, pp, priority, power, contestCombos, contestType, contestEffect, damageClass, effectEntries, effectChanges, generation, meta, names, pastValues, statChanges, superContestEffect, target, type, machines, flavorTextEntries, learnedByPokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
    sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    contestCombos: ").append(toIndentedString(contestCombos)).append("\n");
    sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
    sb.append("    contestEffect: ").append(toIndentedString(contestEffect)).append("\n");
    sb.append("    damageClass: ").append(toIndentedString(damageClass)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pastValues: ").append(toIndentedString(pastValues)).append("\n");
    sb.append("    statChanges: ").append(toIndentedString(statChanges)).append("\n");
    sb.append("    superContestEffect: ").append(toIndentedString(superContestEffect)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
    sb.append("    learnedByPokemon: ").append(toIndentedString(learnedByPokemon)).append("\n");
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

