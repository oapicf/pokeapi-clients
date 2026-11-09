package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.TypeRelationships;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TypePastRelationships
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypePastRelationships {

  private GenerationSummary generation;

  private TypeRelationships damageRelations;

  public TypePastRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TypePastRelationships(GenerationSummary generation, TypeRelationships damageRelations) {
    this.generation = generation;
    this.damageRelations = damageRelations;
  }

  public TypePastRelationships generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The last generation in which the referenced type had the listed damage relations
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", description = "The last generation in which the referenced type had the listed damage relations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty("generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public TypePastRelationships damageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

  /**
   * The damage relations the referenced type had up to and including the listed generation
   * @return damageRelations
   */
  @NotNull @Valid 
  @Schema(name = "damage_relations", description = "The damage relations the referenced type had up to and including the listed generation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("damage_relations")
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }

  @JsonProperty("damage_relations")
  public void setDamageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypePastRelationships typePastRelationships = (TypePastRelationships) o;
    return Objects.equals(this.generation, typePastRelationships.generation) &&
        Objects.equals(this.damageRelations, typePastRelationships.damageRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generation, damageRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypePastRelationships {\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

