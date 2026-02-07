package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.ContestEffectSummary;
import apimodels.ContestTypeSummary;
import apimodels.GenerationSummary;
import apimodels.MoveChange;
import apimodels.MoveChangeEffectEntriesInner;
import apimodels.MoveDamageClassSummary;
import apimodels.MoveDetailContestCombos;
import apimodels.MoveDetailEffectChangesInner;
import apimodels.MoveDetailMachinesInner;
import apimodels.MoveDetailStatChangesInner;
import apimodels.MoveFlavorText;
import apimodels.MoveMeta;
import apimodels.MoveName;
import apimodels.MoveTargetSummary;
import apimodels.SuperContestEffectSummary;
import apimodels.TypeSummary;
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
 * MoveDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T15:23:19.397731995Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("accuracy")
  
  private Integer accuracy;

  @JsonProperty("effect_chance")
  @NotNull

  private Integer effectChance;

  @JsonProperty("pp")
  
  private Integer pp;

  @JsonProperty("priority")
  
  private Integer priority;

  @JsonProperty("power")
  
  private Integer power;

  @JsonProperty("contest_combos")
  @NotNull
@Valid

  private MoveDetailContestCombos contestCombos;

  @JsonProperty("contest_type")
  @NotNull
@Valid

  private ContestTypeSummary contestType;

  @JsonProperty("contest_effect")
  @NotNull
@Valid

  private ContestEffectSummary contestEffect;

  @JsonProperty("damage_class")
  @NotNull
@Valid

  private MoveDamageClassSummary damageClass;

  @JsonProperty("effect_entries")
  @NotNull
@Valid

  private List<@Valid MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();

  @JsonProperty("effect_changes")
  @NotNull
@Valid

  private List<@Valid MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();

  @JsonProperty("generation")
  @NotNull
@Valid

  private GenerationSummary generation;

  @JsonProperty("meta")
  @NotNull
@Valid

  private MoveMeta meta;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid MoveName> names = new ArrayList<>();

  @JsonProperty("past_values")
  @NotNull
@Valid

  private List<@Valid MoveChange> pastValues = new ArrayList<>();

  @JsonProperty("stat_changes")
  @NotNull
@Valid

  private List<@Valid MoveDetailStatChangesInner> statChanges = new ArrayList<>();

  @JsonProperty("super_contest_effect")
  @NotNull
@Valid

  private SuperContestEffectSummary superContestEffect;

  @JsonProperty("target")
  @NotNull
@Valid

  private MoveTargetSummary target;

  @JsonProperty("type")
  @NotNull
@Valid

  private TypeSummary type;

  @JsonProperty("machines")
  @NotNull
@Valid

  private List<@Valid MoveDetailMachinesInner> machines = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  @NotNull
@Valid

  private List<@Valid MoveFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("learned_by_pokemon")
  @NotNull
@Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();

  public MoveDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
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
   * Get name
   * @return name
  **/
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
   * Get accuracy
   * @return accuracy
  **/
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
   * Get effectChance
   * @return effectChance
  **/
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
   * Get pp
   * @return pp
  **/
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
   * Get priority
   * @return priority
  **/
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
   * Get power
   * @return power
  **/
  public Integer getPower() {
    return power;
  }

  public void setPower(Integer power) {
    this.power = power;
  }

  public MoveDetail contestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
    return this;
  }

   /**
   * Get contestCombos
   * @return contestCombos
  **/
  public MoveDetailContestCombos getContestCombos() {
    return contestCombos;
  }

  public void setContestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

  public MoveDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

   /**
   * Get contestType
   * @return contestType
  **/
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
   * Get contestEffect
   * @return contestEffect
  **/
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
   * Get damageClass
   * @return damageClass
  **/
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  public MoveDetail effectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveDetail addEffectEntriesItem(MoveChangeEffectEntriesInner effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

   /**
   * Get effectEntries
   * @return effectEntries
  **/
  public List<@Valid MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetail effectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  public MoveDetail addEffectChangesItem(MoveDetailEffectChangesInner effectChangesItem) {
    if (this.effectChanges == null) {
      this.effectChanges = new ArrayList<>();
    }
    this.effectChanges.add(effectChangesItem);
    return this;
  }

   /**
   * Get effectChanges
   * @return effectChanges
  **/
  public List<@Valid MoveDetailEffectChangesInner> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public MoveDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

   /**
   * Get generation
   * @return generation
  **/
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
   * Get meta
   * @return meta
  **/
  public MoveMeta getMeta() {
    return meta;
  }

  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }

  public MoveDetail names(List<@Valid MoveName> names) {
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
   * Get names
   * @return names
  **/
  public List<@Valid MoveName> getNames() {
    return names;
  }

  public void setNames(List<@Valid MoveName> names) {
    this.names = names;
  }

  public MoveDetail pastValues(List<@Valid MoveChange> pastValues) {
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
   * Get pastValues
   * @return pastValues
  **/
  public List<@Valid MoveChange> getPastValues() {
    return pastValues;
  }

  public void setPastValues(List<@Valid MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  public MoveDetail statChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
    return this;
  }

  public MoveDetail addStatChangesItem(MoveDetailStatChangesInner statChangesItem) {
    if (this.statChanges == null) {
      this.statChanges = new ArrayList<>();
    }
    this.statChanges.add(statChangesItem);
    return this;
  }

   /**
   * Get statChanges
   * @return statChanges
  **/
  public List<@Valid MoveDetailStatChangesInner> getStatChanges() {
    return statChanges;
  }

  public void setStatChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
  }

  public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
    return this;
  }

   /**
   * Get superContestEffect
   * @return superContestEffect
  **/
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
   * Get target
   * @return target
  **/
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
   * Get type
   * @return type
  **/
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }

  public MoveDetail machines(List<@Valid MoveDetailMachinesInner> machines) {
    this.machines = machines;
    return this;
  }

  public MoveDetail addMachinesItem(MoveDetailMachinesInner machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

   /**
   * Get machines
   * @return machines
  **/
  public List<@Valid MoveDetailMachinesInner> getMachines() {
    return machines;
  }

  public void setMachines(List<@Valid MoveDetailMachinesInner> machines) {
    this.machines = machines;
  }

  public MoveDetail flavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
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
   * Get flavorTextEntries
   * @return flavorTextEntries
  **/
  public List<@Valid MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public MoveDetail learnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
    return this;
  }

  public MoveDetail addLearnedByPokemonItem(AbilityDetailPokemonInnerPokemon learnedByPokemonItem) {
    if (this.learnedByPokemon == null) {
      this.learnedByPokemon = new ArrayList<>();
    }
    this.learnedByPokemon.add(learnedByPokemonItem);
    return this;
  }

   /**
   * Get learnedByPokemon
   * @return learnedByPokemon
  **/
  public List<@Valid AbilityDetailPokemonInnerPokemon> getLearnedByPokemon() {
    return learnedByPokemon;
  }

  public void setLearnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

