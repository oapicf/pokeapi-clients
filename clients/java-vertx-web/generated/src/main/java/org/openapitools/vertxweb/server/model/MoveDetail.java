package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.ContestEffectSummary;
import org.openapitools.vertxweb.server.model.ContestTypeSummary;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.MoveChange;
import org.openapitools.vertxweb.server.model.MoveChangeEffectEntriesInner;
import org.openapitools.vertxweb.server.model.MoveDamageClassSummary;
import org.openapitools.vertxweb.server.model.MoveDetailContestCombos;
import org.openapitools.vertxweb.server.model.MoveDetailEffectChangesInner;
import org.openapitools.vertxweb.server.model.MoveDetailMachinesInner;
import org.openapitools.vertxweb.server.model.MoveDetailStatChangesInner;
import org.openapitools.vertxweb.server.model.MoveFlavorText;
import org.openapitools.vertxweb.server.model.MoveMeta;
import org.openapitools.vertxweb.server.model.MoveName;
import org.openapitools.vertxweb.server.model.MoveTargetSummary;
import org.openapitools.vertxweb.server.model.SuperContestEffectSummary;
import org.openapitools.vertxweb.server.model.TypeSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private List<MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();
  private List<MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();
  private GenerationSummary generation;
  private MoveMeta meta;
  private List<MoveName> names = new ArrayList<>();
  private List<MoveChange> pastValues = new ArrayList<>();
  private List<MoveDetailStatChangesInner> statChanges = new ArrayList<>();
  private SuperContestEffectSummary superContestEffect;
  private MoveTargetSummary target;
  private TypeSummary type;
  private List<MoveDetailMachinesInner> machines = new ArrayList<>();
  private List<MoveFlavorText> flavorTextEntries = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();

  public MoveDetail () {

  }

  public MoveDetail (Integer id, String name, Integer accuracy, Integer effectChance, Integer pp, Integer priority, Integer power, MoveDetailContestCombos contestCombos, ContestTypeSummary contestType, ContestEffectSummary contestEffect, MoveDamageClassSummary damageClass, List<MoveChangeEffectEntriesInner> effectEntries, List<MoveDetailEffectChangesInner> effectChanges, GenerationSummary generation, MoveMeta meta, List<MoveName> names, List<MoveChange> pastValues, List<MoveDetailStatChangesInner> statChanges, SuperContestEffectSummary superContestEffect, MoveTargetSummary target, TypeSummary type, List<MoveDetailMachinesInner> machines, List<MoveFlavorText> flavorTextEntries, List<AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
    this.id = id;
    this.name = name;
    this.accuracy = accuracy;
    this.effectChance = effectChance;
    this.pp = pp;
    this.priority = priority;
    this.power = power;
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

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

    
  @JsonProperty("effect_chance")
  public Integer getEffectChance() {
    return effectChance;
  }
  public void setEffectChance(Integer effectChance) {
    this.effectChance = effectChance;
  }

    
  @JsonProperty("pp")
  public Integer getPp() {
    return pp;
  }
  public void setPp(Integer pp) {
    this.pp = pp;
  }

    
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

    
  @JsonProperty("power")
  public Integer getPower() {
    return power;
  }
  public void setPower(Integer power) {
    this.power = power;
  }

    
  @JsonProperty("contest_combos")
  public MoveDetailContestCombos getContestCombos() {
    return contestCombos;
  }
  public void setContestCombos(MoveDetailContestCombos contestCombos) {
    this.contestCombos = contestCombos;
  }

    
  @JsonProperty("contest_type")
  public ContestTypeSummary getContestType() {
    return contestType;
  }
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

    
  @JsonProperty("contest_effect")
  public ContestEffectSummary getContestEffect() {
    return contestEffect;
  }
  public void setContestEffect(ContestEffectSummary contestEffect) {
    this.contestEffect = contestEffect;
  }

    
  @JsonProperty("damage_class")
  public MoveDamageClassSummary getDamageClass() {
    return damageClass;
  }
  public void setDamageClass(MoveDamageClassSummary damageClass) {
    this.damageClass = damageClass;
  }

    
  @JsonProperty("effect_entries")
  public List<MoveChangeEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<MoveChangeEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

    
  @JsonProperty("effect_changes")
  public List<MoveDetailEffectChangesInner> getEffectChanges() {
    return effectChanges;
  }
  public void setEffectChanges(List<MoveDetailEffectChangesInner> effectChanges) {
    this.effectChanges = effectChanges;
  }

    
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

    
  @JsonProperty("meta")
  public MoveMeta getMeta() {
    return meta;
  }
  public void setMeta(MoveMeta meta) {
    this.meta = meta;
  }

    
  @JsonProperty("names")
  public List<MoveName> getNames() {
    return names;
  }
  public void setNames(List<MoveName> names) {
    this.names = names;
  }

    
  @JsonProperty("past_values")
  public List<MoveChange> getPastValues() {
    return pastValues;
  }
  public void setPastValues(List<MoveChange> pastValues) {
    this.pastValues = pastValues;
  }

    
  @JsonProperty("stat_changes")
  public List<MoveDetailStatChangesInner> getStatChanges() {
    return statChanges;
  }
  public void setStatChanges(List<MoveDetailStatChangesInner> statChanges) {
    this.statChanges = statChanges;
  }

    
  @JsonProperty("super_contest_effect")
  public SuperContestEffectSummary getSuperContestEffect() {
    return superContestEffect;
  }
  public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
    this.superContestEffect = superContestEffect;
  }

    
  @JsonProperty("target")
  public MoveTargetSummary getTarget() {
    return target;
  }
  public void setTarget(MoveTargetSummary target) {
    this.target = target;
  }

    
  @JsonProperty("type")
  public TypeSummary getType() {
    return type;
  }
  public void setType(TypeSummary type) {
    this.type = type;
  }

    
  @JsonProperty("machines")
  public List<MoveDetailMachinesInner> getMachines() {
    return machines;
  }
  public void setMachines(List<MoveDetailMachinesInner> machines) {
    this.machines = machines;
  }

    
  @JsonProperty("flavor_text_entries")
  public List<MoveFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

    
  @JsonProperty("learned_by_pokemon")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
