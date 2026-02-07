package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MoveDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetail   {
  private Integer id;
  private String name;
  private Integer accuracy;
  private Integer effectChance;
  private Integer pp;
  private Integer priority;
  private Integer power;
  private MoveDetailContestCombos contestCombos;
  private ContestTypeSummary contestType;
  private ContestEffectSummary contestEffect;
  private MoveDamageClassSummary damageClass;
  private @Valid List<@Valid MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();
  private @Valid List<@Valid MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();
  private GenerationSummary generation;
  private MoveMeta meta;
  private @Valid List<@Valid MoveName> names = new ArrayList<>();
  private @Valid List<@Valid MoveChange> pastValues = new ArrayList<>();
  private @Valid List<@Valid MoveDetailStatChangesInner> statChanges = new ArrayList<>();
  private SuperContestEffectSummary superContestEffect;
  private MoveTargetSummary target;
  private TypeSummary type;
  private @Valid List<@Valid MoveDetailMachinesInner> machines = new ArrayList<>();
  private @Valid List<@Valid MoveFlavorText> flavorTextEntries = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();

  public MoveDetail() {
  }

  @JsonCreator
  public MoveDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "effect_chance") Integer effectChance,
    @JsonProperty(required = true, value = "contest_combos") MoveDetailContestCombos contestCombos,
    @JsonProperty(required = true, value = "contest_type") ContestTypeSummary contestType,
    @JsonProperty(required = true, value = "contest_effect") ContestEffectSummary contestEffect,
    @JsonProperty(required = true, value = "damage_class") MoveDamageClassSummary damageClass,
    @JsonProperty(required = true, value = "effect_entries") List<@Valid MoveChangeEffectEntriesInner> effectEntries,
    @JsonProperty(required = true, value = "effect_changes") List<@Valid MoveDetailEffectChangesInner> effectChanges,
    @JsonProperty(required = true, value = "generation") GenerationSummary generation,
    @JsonProperty(required = true, value = "meta") MoveMeta meta,
    @JsonProperty(required = true, value = "names") List<@Valid MoveName> names,
    @JsonProperty(required = true, value = "past_values") List<@Valid MoveChange> pastValues,
    @JsonProperty(required = true, value = "stat_changes") List<@Valid MoveDetailStatChangesInner> statChanges,
    @JsonProperty(required = true, value = "super_contest_effect") SuperContestEffectSummary superContestEffect,
    @JsonProperty(required = true, value = "target") MoveTargetSummary target,
    @JsonProperty(required = true, value = "type") TypeSummary type,
    @JsonProperty(required = true, value = "machines") List<@Valid MoveDetailMachinesInner> machines,
    @JsonProperty(required = true, value = "flavor_text_entries") List<@Valid MoveFlavorText> flavorTextEntries,
    @JsonProperty(required = true, value = "learned_by_pokemon") List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon
  ) {
    this.id = id;
    this.name = name;
    this.effectChance = effectChance;
    this.contestCombos = contestCombos;
    this.contestType = contestType;
    this.contestEffect = contestEffect;
    this.damageClass = damageClass;
    this.effectEntries = effectEntries;
    this.effectChanges = effectChanges;
    this.generation = generation;
    this.meta = meta;
    this.names = names;
    this.pastValues = pastValues;
    this.statChanges = statChanges;
    this.superContestEffect = superContestEffect;
    this.target = target;
    this.type = type;
    this.machines = machines;
    this.flavorTextEntries = flavorTextEntries;
    this.learnedByPokemon = learnedByPokemon;
  }

  /**
   **/
  public MoveDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public MoveDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public MoveDetail accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }

  @JsonProperty("accuracy")
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  /**
   **/
  public MoveDetail effectChance(Integer effectChance) {
    this.effectChance = effectChance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "effect_chance")
  @NotNull public Integer getEffectChance() {
    return effectChance;
  }

  @JsonProperty(required = true, value = "effect_chance")
  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

  /**
   **/
  public MoveDetail pp(Integer pp) {
    this.pp = pp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pp")
  public Integer getPp() {
    return pp;
  }

  @JsonProperty("pp")
  public void setPp(Integer pp) {
    this.pp = pp;
  }

  /**
   **/
  public MoveDetail priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  @JsonProperty("priority")
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   **/
  public MoveDetail power(Integer power) {
    this.power = power;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("power")
  public Integer getPower() {
    return power;
  }

  @JsonProperty("power")
  public void setPower(Integer power) {
    this.power = power;
  }

  /**
   **/
  public MoveDetail contestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "contest_combos")
  @NotNull @Valid public MoveDetailContestCombos getContestCombos() {
    return contestCombos;
  }

  @JsonProperty(required = true, value = "contest_combos")
  public void setContestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

  /**
   **/
  public MoveDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "contest_type")
  @NotNull @Valid public ContestTypeSummary getContestType() {
    return contestType;
  }

  @JsonProperty(required = true, value = "contest_type")
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  /**
   **/
  public MoveDetail contestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "contest_effect")
  @NotNull @Valid public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }

  @JsonProperty(required = true, value = "contest_effect")
  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }

  /**
   **/
  public MoveDetail damageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "damage_class")
  @NotNull @Valid public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }

  @JsonProperty(required = true, value = "damage_class")
  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

  /**
   **/
  public MoveDetail effectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "effect_entries")
  @NotNull @Valid public List<@Valid MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty(required = true, value = "effect_entries")
  public void setEffectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetail addEffectEntriesItem(MoveChangeEffectEntriesInner effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }

    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  public MoveDetail removeEffectEntriesItem(MoveChangeEffectEntriesInner effectEntriesItem) {
    if (effectEntriesItem != null && this.effectEntries != null) {
      this.effectEntries.remove(effectEntriesItem);
    }

    return this;
  }
  /**
   **/
  public MoveDetail effectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "effect_changes")
  @NotNull @Valid public List<@Valid MoveDetailEffectChangesInner> getEffectChanges() {
    return effectChanges;
  }

  @JsonProperty(required = true, value = "effect_changes")
  public void setEffectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public MoveDetail addEffectChangesItem(MoveDetailEffectChangesInner effectChangesItem) {
    if (this.effectChanges == null) {
      this.effectChanges = new ArrayList<>();
    }

    this.effectChanges.add(effectChangesItem);
    return this;
  }

  public MoveDetail removeEffectChangesItem(MoveDetailEffectChangesInner effectChangesItem) {
    if (effectChangesItem != null && this.effectChanges != null) {
      this.effectChanges.remove(effectChangesItem);
    }

    return this;
  }
  /**
   **/
  public MoveDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "generation")
  @NotNull @Valid public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty(required = true, value = "generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   **/
  public MoveDetail meta(MoveMeta meta) {
    this.meta = meta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "meta")
  @Valid public MoveMeta getMeta() {
    return meta;
  }

  @JsonProperty(required = true, value = "meta")
  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }

  /**
   **/
  public MoveDetail names(List<@Valid MoveName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid MoveName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid MoveName> names) {
    this.names = names;
  }

  public MoveDetail addNamesItem(MoveName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public MoveDetail removeNamesItem(MoveName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   **/
  public MoveDetail pastValues(List<@Valid MoveChange> pastValues) {
    this.pastValues = pastValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "past_values")
  @NotNull @Valid public List<@Valid MoveChange> getPastValues() {
    return pastValues;
  }

  @JsonProperty(required = true, value = "past_values")
  public void setPastValues(List<@Valid MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

  public MoveDetail addPastValuesItem(MoveChange pastValuesItem) {
    if (this.pastValues == null) {
      this.pastValues = new ArrayList<>();
    }

    this.pastValues.add(pastValuesItem);
    return this;
  }

  public MoveDetail removePastValuesItem(MoveChange pastValuesItem) {
    if (pastValuesItem != null && this.pastValues != null) {
      this.pastValues.remove(pastValuesItem);
    }

    return this;
  }
  /**
   **/
  public MoveDetail statChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "stat_changes")
  @NotNull @Valid public List<@Valid MoveDetailStatChangesInner> getStatChanges() {
    return statChanges;
  }

  @JsonProperty(required = true, value = "stat_changes")
  public void setStatChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
  }

  public MoveDetail addStatChangesItem(MoveDetailStatChangesInner statChangesItem) {
    if (this.statChanges == null) {
      this.statChanges = new ArrayList<>();
    }

    this.statChanges.add(statChangesItem);
    return this;
  }

  public MoveDetail removeStatChangesItem(MoveDetailStatChangesInner statChangesItem) {
    if (statChangesItem != null && this.statChanges != null) {
      this.statChanges.remove(statChangesItem);
    }

    return this;
  }
  /**
   **/
  public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "super_contest_effect")
  @NotNull @Valid public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }

  @JsonProperty(required = true, value = "super_contest_effect")
  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

  /**
   **/
  public MoveDetail target(MoveTargetSummary target) {
    this.target = target;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "target")
  @NotNull @Valid public MoveTargetSummary getTarget() {
    return target;
  }

  @JsonProperty(required = true, value = "target")
  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

  /**
   **/
  public MoveDetail type(TypeSummary type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "type")
  @NotNull @Valid public TypeSummary getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeSummary type) {
    this.type = type;
  }

  /**
   **/
  public MoveDetail machines(List<@Valid MoveDetailMachinesInner> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "machines")
  @NotNull @Valid public List<@Valid MoveDetailMachinesInner> getMachines() {
    return machines;
  }

  @JsonProperty(required = true, value = "machines")
  public void setMachines(List<@Valid MoveDetailMachinesInner> machines) {
    this.machines = machines;
  }

  public MoveDetail addMachinesItem(MoveDetailMachinesInner machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }

    this.machines.add(machinesItem);
    return this;
  }

  public MoveDetail removeMachinesItem(MoveDetailMachinesInner machinesItem) {
    if (machinesItem != null && this.machines != null) {
      this.machines.remove(machinesItem);
    }

    return this;
  }
  /**
   **/
  public MoveDetail flavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "flavor_text_entries")
  @NotNull @Valid public List<@Valid MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  @JsonProperty(required = true, value = "flavor_text_entries")
  public void setFlavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public MoveDetail addFlavorTextEntriesItem(MoveFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }

    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  public MoveDetail removeFlavorTextEntriesItem(MoveFlavorText flavorTextEntriesItem) {
    if (flavorTextEntriesItem != null && this.flavorTextEntries != null) {
      this.flavorTextEntries.remove(flavorTextEntriesItem);
    }

    return this;
  }
  /**
   **/
  public MoveDetail learnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "learned_by_pokemon")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getLearnedByPokemon() {
    return learnedByPokemon;
  }

  @JsonProperty(required = true, value = "learned_by_pokemon")
  public void setLearnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.learnedByPokemon = learnedByPokemon;
  }

  public MoveDetail addLearnedByPokemonItem(AbilityDetailPokemonInnerPokemon learnedByPokemonItem) {
    if (this.learnedByPokemon == null) {
      this.learnedByPokemon = new ArrayList<>();
    }

    this.learnedByPokemon.add(learnedByPokemonItem);
    return this;
  }

  public MoveDetail removeLearnedByPokemonItem(AbilityDetailPokemonInnerPokemon learnedByPokemonItem) {
    if (learnedByPokemonItem != null && this.learnedByPokemon != null) {
      this.learnedByPokemon.remove(learnedByPokemonItem);
    }

    return this;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

