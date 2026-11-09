package org.openapitools.model;

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
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class MoveDetail implements Serializable {
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
   * The percent value of how likely this move is to be successful.
   */
  @JsonProperty("accuracy")
  private Integer accuracy;

  /**
   * The percent value of how likely it is this moves effect will happen.
   */
  @JsonProperty("effect_chance")
  private Integer effectChance;

  /**
   * Power points. The number of times this move can be used.
   */
  @JsonProperty("pp")
  private Integer pp;

  /**
   * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
   */
  @JsonProperty("priority")
  private Integer priority;

  /**
   * The base power of this move, or null if it has no fixed base power.
   */
  @JsonProperty("power")
  private Integer power;

  /**
   * A detail of normal and super contest combos that require this move.
   */
  @JsonProperty("contest_combos")
  private MoveCombos contestCombos;

  /**
   * The type of appeal this move gives a Pokémon when used in a contest.
   */
  @JsonProperty("contest_type")
  private ContestTypeSummary contestType;

  /**
   * The effect the move has when used in a contest.
   */
  @JsonProperty("contest_effect")
  private ContestEffectSummary contestEffect;

  /**
   * The type of damage the move inflicts on the target, e.g. physical.
   */
  @JsonProperty("damage_class")
  private MoveDamageClassSummary damageClass;

  /**
   * The effect of this move listed in different languages.
   */
  @JsonProperty("effect_entries")
  private List<MoveEffectEffectText> effectEntries = new ArrayList<>();

  /**
   * The list of previous effects this move has had across version groups of the games.
   */
  @JsonProperty("effect_changes")
  private List<MoveEffectChange> effectChanges = new ArrayList<>();

  /**
   * The generation in which this move was introduced.
   */
  @JsonProperty("generation")
  private GenerationSummary generation;

  /**
   * Metadata about this move
   */
  @JsonProperty("meta")
  private MoveMeta meta;

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<MoveName> names = new ArrayList<>();

  /**
   * A list of move resource value changes across version groups of the game.
   */
  @JsonProperty("past_values")
  private List<MoveChange> pastValues = new ArrayList<>();

  /**
   * A list of stats this moves effects and how much it effects them.
   */
  @JsonProperty("stat_changes")
  private List<MoveMetaStatChange> statChanges = new ArrayList<>();

  /**
   * The effect the move has when used in a super contest.
   */
  @JsonProperty("super_contest_effect")
  private SuperContestEffectSummary superContestEffect;

  /**
   * The type of target that will receive the effects of the attack.
   */
  @JsonProperty("target")
  private MoveTargetSummary target;

  /**
   * The elemental type of this move.
   */
  @JsonProperty("type")
  private TypeSummary type;

  /**
   * A list of the machines that teach this move.
   */
  @JsonProperty("machines")
  private List<ItemMachine> machines = new ArrayList<>();

  /**
   * The flavor text of this move listed in different languages.
   */
  @JsonProperty("flavor_text_entries")
  private List<MoveFlavorText> flavorTextEntries = new ArrayList<>();

  /**
   * List of Pokemon that can learn the move
   */
  @JsonProperty("learned_by_pokemon")
  private List<PokemonSummary> learnedByPokemon = new ArrayList<>();

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
   * The percent value of how likely this move is to be successful.
   * @return accuracy
   */
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   * The percent value of how likely it is this moves effect will happen.
   * @return effectChance
   */
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   * Power points. The number of times this move can be used.
   * @return pp
   */
  public Integer getPp() {
    return pp;
  }

  public void setPp(Integer pp) {
    this.pp = pp;
  }

  /**
   * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
   * @return priority
   */
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * The base power of this move, or null if it has no fixed base power.
   * @return power
   */
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  /**
   * A detail of normal and super contest combos that require this move.
   * @return contestCombos
   */
  public MoveCombos getContestCombos() {
    return contestCombos;
  }

  public void setContestCombos(MoveCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

  /**
   * The type of appeal this move gives a Pokémon when used in a contest.
   * @return contestType
   */
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  /**
   * The effect the move has when used in a contest.
   * @return contestEffect
   */
  public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }

  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }

  /**
   * The type of damage the move inflicts on the target, e.g. physical.
   * @return damageClass
   */
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  /**
   * The effect of this move listed in different languages.
   * @return effectEntries
   */
  public List<MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * The list of previous effects this move has had across version groups of the games.
   * @return effectChanges
   */
  public List<MoveEffectChange> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<MoveEffectChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  /**
   * The generation in which this move was introduced.
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * Metadata about this move
   * @return meta
   */
  public MoveMeta getMeta() {
    return meta;
  }

  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  public List<MoveName> getNames() {
    return names;
  }

  public void setNames(List<MoveName> names) {
    this.names = names;
  }

  /**
   * A list of move resource value changes across version groups of the game.
   * @return pastValues
   */
  public List<MoveChange> getPastValues() {
    return pastValues;
  }

  public void setPastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  /**
   * A list of stats this moves effects and how much it effects them.
   * @return statChanges
   */
  public List<MoveMetaStatChange> getStatChanges() {
    return statChanges;
  }

  public void setStatChanges(List<MoveMetaStatChange> statChanges) {
    this.statChanges = statChanges;
  }

  /**
   * The effect the move has when used in a super contest.
   * @return superContestEffect
   */
  public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }

  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

  /**
   * The type of target that will receive the effects of the attack.
   * @return target
   */
  public MoveTargetSummary getTarget() {
    return target;
  }

  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

  /**
   * The elemental type of this move.
   * @return type
   */
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   * A list of the machines that teach this move.
   * @return machines
   */
  public List<ItemMachine> getMachines() {
    return machines;
  }

  public void setMachines(List<ItemMachine> machines) {
    this.machines = machines;
  }

  /**
   * The flavor text of this move listed in different languages.
   * @return flavorTextEntries
   */
  public List<MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * List of Pokemon that can learn the move
   * @return learnedByPokemon
   */
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
