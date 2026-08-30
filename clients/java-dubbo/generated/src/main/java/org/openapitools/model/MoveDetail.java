package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ContestEffectSummary;
import org.openapitools.model.ContestTypeSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveChange;
import org.openapitools.model.MoveChangeEffectEntriesInner;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveDetailContestCombos;
import org.openapitools.model.MoveDetailEffectChangesInner;
import org.openapitools.model.MoveDetailMachinesInner;
import org.openapitools.model.MoveDetailStatChangesInner;
import org.openapitools.model.MoveFlavorText;
import org.openapitools.model.MoveMeta;
import org.openapitools.model.MoveName;
import org.openapitools.model.MoveTargetSummary;
import org.openapitools.model.SuperContestEffectSummary;
import org.openapitools.model.TypeSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MoveDetail implements Serializable {
  private static final long serialVersionUID = 1L;

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
  private MoveDetailContestCombos contestCombos;

  @JsonProperty("contest_type")
  private ContestTypeSummary contestType;

  @JsonProperty("contest_effect")
  private ContestEffectSummary contestEffect;

  @JsonProperty("damage_class")
  private MoveDamageClassSummary damageClass;

  @JsonProperty("effect_entries")
  private List<MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  @JsonProperty("effect_changes")
  private List<MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("meta")
  private MoveMeta meta;

  @JsonProperty("names")
  private List<MoveName> names = new ArrayList<>();

  @JsonProperty("past_values")
  private List<MoveChange> pastValues = new ArrayList<>();

  @JsonProperty("stat_changes")
  private List<MoveDetailStatChangesInner> statChanges = new ArrayList<>();

  @JsonProperty("super_contest_effect")
  private SuperContestEffectSummary superContestEffect;

  @JsonProperty("target")
  private MoveTargetSummary target;

  @JsonProperty("type")
  private TypeSummary type;

  @JsonProperty("machines")
  private List<MoveDetailMachinesInner> machines = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  private List<MoveFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("learned_by_pokemon")
  private List<AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return accuracy
   */
  public Integer getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   * 
   * @return effectChance
   */
  public Integer getEffectChance() {
    return effectChance;
  }

  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   * 
   * @return pp
   */
  public Integer getPp() {
    return pp;
  }

  public void setPp(Integer pp) {
    this.pp = pp;
  }

  /**
   * 
   * @return priority
   */
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * 
   * @return power
   */
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  /**
   * 
   * @return contestCombos
   */
  public MoveDetailContestCombos getContestCombos() {
    return contestCombos;
  }

  public void setContestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

  /**
   * 
   * @return contestType
   */
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  /**
   * 
   * @return contestEffect
   */
  public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }

  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }

  /**
   * 
   * @return damageClass
   */
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  /**
   * 
   * @return effectEntries
   */
  public List<MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * 
   * @return effectChanges
   */
  public List<MoveDetailEffectChangesInner> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
  }

  /**
   * 
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * 
   * @return meta
   */
  public MoveMeta getMeta() {
    return meta;
  }

  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }

  /**
   * 
   * @return names
   */
  public List<MoveName> getNames() {
    return names;
  }

  public void setNames(List<MoveName> names) {
    this.names = names;
  }

  /**
   * 
   * @return pastValues
   */
  public List<MoveChange> getPastValues() {
    return pastValues;
  }

  public void setPastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  /**
   * 
   * @return statChanges
   */
  public List<MoveDetailStatChangesInner> getStatChanges() {
    return statChanges;
  }

  public void setStatChanges(List<MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
  }

  /**
   * 
   * @return superContestEffect
   */
  public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }

  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

  /**
   * 
   * @return target
   */
  public MoveTargetSummary getTarget() {
    return target;
  }

  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

  /**
   * 
   * @return type
   */
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   * 
   * @return machines
   */
  public List<MoveDetailMachinesInner> getMachines() {
    return machines;
  }

  public void setMachines(List<MoveDetailMachinesInner> machines) {
    this.machines = machines;
  }

  /**
   * 
   * @return flavorTextEntries
   */
  public List<MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * 
   * @return learnedByPokemon
   */
  public List<AbilityDetailPokemonInnerPokemon> getLearnedByPokemon() {
    return learnedByPokemon;
  }

  public void setLearnedByPokemon(List<AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
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
