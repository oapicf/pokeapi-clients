package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ContestEffectSummary;
import com.prokarma.pkmst.model.ContestTypeSummary;
import com.prokarma.pkmst.model.GenerationSummary;
import com.prokarma.pkmst.model.ItemMachine;
import com.prokarma.pkmst.model.MoveChange;
import com.prokarma.pkmst.model.MoveCombos;
import com.prokarma.pkmst.model.MoveDamageClassSummary;
import com.prokarma.pkmst.model.MoveEffectChange;
import com.prokarma.pkmst.model.MoveEffectEffectText;
import com.prokarma.pkmst.model.MoveFlavorText;
import com.prokarma.pkmst.model.MoveMeta;
import com.prokarma.pkmst.model.MoveMetaStatChange;
import com.prokarma.pkmst.model.MoveName;
import com.prokarma.pkmst.model.MoveTargetSummary;
import com.prokarma.pkmst.model.PokemonSummary;
import com.prokarma.pkmst.model.SuperContestEffectSummary;
import com.prokarma.pkmst.model.TypeSummary;
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
 * MoveDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("accuracy")
  private Integer accuracy;

  @JsonProperty("effect_chance")
  private Integer effectChance;

  @JsonProperty("pp")
  private Integer pp;

  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("power")
  private Integer power;

  @JsonProperty("contest_combos")
  private MoveCombos contestCombos;

  @JsonProperty("contest_type")
  private ContestTypeSummary contestType;

  @JsonProperty("contest_effect")
  private ContestEffectSummary contestEffect;

  @JsonProperty("damage_class")
  private MoveDamageClassSummary damageClass;

  @JsonProperty("effect_entries")
  
  private List<MoveEffectEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("effect_changes")
  
  private List<MoveEffectChange> effectChanges = new ArrayList<>();

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("meta")
  private MoveMeta meta;

  @JsonProperty("names")
  
  private List<MoveName> names = new ArrayList<>();

  @JsonProperty("past_values")
  
  private List<MoveChange> pastValues = new ArrayList<>();

  @JsonProperty("stat_changes")
  
  private List<MoveMetaStatChange> statChanges = new ArrayList<>();

  @JsonProperty("super_contest_effect")
  private SuperContestEffectSummary superContestEffect;

  @JsonProperty("target")
  private MoveTargetSummary target;

  @JsonProperty("type")
  private TypeSummary type;

  @JsonProperty("machines")
  
  private List<ItemMachine> machines = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  
  private List<MoveFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("learned_by_pokemon")
  
  private List<PokemonSummary> learnedByPokemon = new ArrayList<>();

  public MoveDetail id(Integer id) {
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

  public MoveDetail name(String name) {
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

  public MoveDetail accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * The percent value of how likely this move is to be successful.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return accuracy
   */
  @ApiModelProperty(value = "The percent value of how likely this move is to be successful.")
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  public MoveDetail effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

  /**
   * The percent value of how likely it is this moves effect will happen.
   * @return effectChance
   */
  @ApiModelProperty(required = true, value = "The percent value of how likely it is this moves effect will happen.")
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  public MoveDetail pp(Integer pp) {
    this.pp = pp;
    return this;
  }

  /**
   * Power points. The number of times this move can be used.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return pp
   */
  @ApiModelProperty(value = "Power points. The number of times this move can be used.")
  public Integer getPp() {
    return pp;
  }

  public void setPp(Integer pp) {
    this.pp = pp;
  }

  public MoveDetail priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return priority
   */
  @ApiModelProperty(value = "A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public MoveDetail power(Integer power) {
    this.power = power;
    return this;
  }

  /**
   * The base power of this move, or null if it has no fixed base power.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return power
   */
  @ApiModelProperty(value = "The base power of this move, or null if it has no fixed base power.")
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  public MoveDetail contestCombos(MoveCombos contestCombos) {
    this.contestCombos = contestCombos;
    return this;
  }

  /**
   * A detail of normal and super contest combos that require this move.
   * @return contestCombos
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A detail of normal and super contest combos that require this move.")
  public MoveCombos getContestCombos() {
    return contestCombos;
  }

  public void setContestCombos(MoveCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

  public MoveDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  /**
   * The type of appeal this move gives a Pokémon when used in a contest.
   * @return contestType
   */
  @ApiModelProperty(required = true, value = "The type of appeal this move gives a Pokémon when used in a contest.")
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  public MoveDetail contestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
    return this;
  }

  /**
   * The effect the move has when used in a contest.
   * @return contestEffect
   */
  @ApiModelProperty(required = true, value = "The effect the move has when used in a contest.")
  public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }

  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }

  public MoveDetail damageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
    return this;
  }

  /**
   * The type of damage the move inflicts on the target, e.g. physical.
   * @return damageClass
   */
  @ApiModelProperty(required = true, value = "The type of damage the move inflicts on the target, e.g. physical.")
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  public MoveDetail effectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveDetail addEffectEntriesItem(MoveEffectEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * The effect of this move listed in different languages.
   * @return effectEntries
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The effect of this move listed in different languages.")
  public List<MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetail effectChanges(List<MoveEffectChange> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  public MoveDetail addEffectChangesItem(MoveEffectChange effectChangesItem) {
    if (this.effectChanges == null) {
      this.effectChanges = new ArrayList<>();
    }
    this.effectChanges.add(effectChangesItem);
    return this;
  }

  /**
   * The list of previous effects this move has had across version groups of the games.
   * @return effectChanges
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The list of previous effects this move has had across version groups of the games.")
  public List<MoveEffectChange> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<MoveEffectChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public MoveDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The generation in which this move was introduced.
   * @return generation
   */
  @ApiModelProperty(required = true, value = "The generation in which this move was introduced.")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public MoveDetail meta(MoveMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Metadata about this move
   * @return meta
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Metadata about this move")
  public MoveMeta getMeta() {
    return meta;
  }

  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }

  public MoveDetail names(List<MoveName> names) {
    this.names = names;
    return this;
  }

  public MoveDetail addNamesItem(MoveName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<MoveName> getNames() {
    return names;
  }

  public void setNames(List<MoveName> names) {
    this.names = names;
  }

  public MoveDetail pastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
    return this;
  }

  public MoveDetail addPastValuesItem(MoveChange pastValuesItem) {
    if (this.pastValues == null) {
      this.pastValues = new ArrayList<>();
    }
    this.pastValues.add(pastValuesItem);
    return this;
  }

  /**
   * A list of move resource value changes across version groups of the game.
   * @return pastValues
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of move resource value changes across version groups of the game.")
  public List<MoveChange> getPastValues() {
    return pastValues;
  }

  public void setPastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  public MoveDetail statChanges(List<MoveMetaStatChange> statChanges) {
    this.statChanges = statChanges;
    return this;
  }

  public MoveDetail addStatChangesItem(MoveMetaStatChange statChangesItem) {
    if (this.statChanges == null) {
      this.statChanges = new ArrayList<>();
    }
    this.statChanges.add(statChangesItem);
    return this;
  }

  /**
   * A list of stats this moves effects and how much it effects them.
   * @return statChanges
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of stats this moves effects and how much it effects them.")
  public List<MoveMetaStatChange> getStatChanges() {
    return statChanges;
  }

  public void setStatChanges(List<MoveMetaStatChange> statChanges) {
    this.statChanges = statChanges;
  }

  public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
    return this;
  }

  /**
   * The effect the move has when used in a super contest.
   * @return superContestEffect
   */
  @ApiModelProperty(required = true, value = "The effect the move has when used in a super contest.")
  public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }

  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

  public MoveDetail target(MoveTargetSummary target) {
    this.target = target;
    return this;
  }

  /**
   * The type of target that will receive the effects of the attack.
   * @return target
   */
  @ApiModelProperty(required = true, value = "The type of target that will receive the effects of the attack.")
  public MoveTargetSummary getTarget() {
    return target;
  }

  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

  public MoveDetail type(TypeSummary type) {
    this.type = type;
    return this;
  }

  /**
   * The elemental type of this move.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The elemental type of this move.")
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  public MoveDetail machines(List<ItemMachine> machines) {
    this.machines = machines;
    return this;
  }

  public MoveDetail addMachinesItem(ItemMachine machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * A list of the machines that teach this move.
   * @return machines
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of the machines that teach this move.")
  public List<ItemMachine> getMachines() {
    return machines;
  }

  public void setMachines(List<ItemMachine> machines) {
    this.machines = machines;
  }

  public MoveDetail flavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public MoveDetail addFlavorTextEntriesItem(MoveFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  /**
   * The flavor text of this move listed in different languages.
   * @return flavorTextEntries
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The flavor text of this move listed in different languages.")
  public List<MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public MoveDetail learnedByPokemon(List<PokemonSummary> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
    return this;
  }

  public MoveDetail addLearnedByPokemonItem(PokemonSummary learnedByPokemonItem) {
    if (this.learnedByPokemon == null) {
      this.learnedByPokemon = new ArrayList<>();
    }
    this.learnedByPokemon.add(learnedByPokemonItem);
    return this;
  }

  /**
   * List of Pokemon that can learn the move
   * @return learnedByPokemon
   */
  @ApiModelProperty(required = true, readOnly = true, value = "List of Pokemon that can learn the move")
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
    return Objects.equals(this.id, moveDetail.id) &&
        Objects.equals(this.name, moveDetail.name) &&
        Objects.equals(this.accuracy, moveDetail.accuracy) &&
        Objects.equals(this.effectChance, moveDetail.effectChance) &&
        Objects.equals(this.pp, moveDetail.pp) &&
        Objects.equals(this.priority, moveDetail.priority) &&
        Objects.equals(this.power, moveDetail.power) &&
        Objects.equals(this.contestCombos, moveDetail.contestCombos) &&
        Objects.equals(this.contestType, moveDetail.contestType) &&
        Objects.equals(this.contestEffect, moveDetail.contestEffect) &&
        Objects.equals(this.damageClass, moveDetail.damageClass) &&
        Objects.equals(this.effectEntries, moveDetail.effectEntries) &&
        Objects.equals(this.effectChanges, moveDetail.effectChanges) &&
        Objects.equals(this.generation, moveDetail.generation) &&
        Objects.equals(this.meta, moveDetail.meta) &&
        Objects.equals(this.names, moveDetail.names) &&
        Objects.equals(this.pastValues, moveDetail.pastValues) &&
        Objects.equals(this.statChanges, moveDetail.statChanges) &&
        Objects.equals(this.superContestEffect, moveDetail.superContestEffect) &&
        Objects.equals(this.target, moveDetail.target) &&
        Objects.equals(this.type, moveDetail.type) &&
        Objects.equals(this.machines, moveDetail.machines) &&
        Objects.equals(this.flavorTextEntries, moveDetail.flavorTextEntries) &&
        Objects.equals(this.learnedByPokemon, moveDetail.learnedByPokemon);
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

