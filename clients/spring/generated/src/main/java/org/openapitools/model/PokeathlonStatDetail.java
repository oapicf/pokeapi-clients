package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatDetailAffectingNatures;
import org.openapitools.model.PokeathlonStatName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokeathlonStatDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PokeathlonStatDetail {

  private Integer id;

  private String name;

  private PokeathlonStatDetailAffectingNatures affectingNatures;

  private List<@Valid PokeathlonStatName> names = new ArrayList<>();

  public PokeathlonStatDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokeathlonStatDetail(Integer id, String name, PokeathlonStatDetailAffectingNatures affectingNatures, List<@Valid PokeathlonStatName> names) {
    this.id = id;
    this.name = name;
    this.affectingNatures = affectingNatures;
    this.names = names;
  }

  public PokeathlonStatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  public PokeathlonStatDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public PokeathlonStatDetail affectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  /**
   * Get affectingNatures
   * @return affectingNatures
   */
  @NotNull @Valid 
  @Schema(name = "affecting_natures", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("affecting_natures")
  public PokeathlonStatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  @JsonProperty("affecting_natures")
  public void setAffectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  public PokeathlonStatDetail names(List<@Valid PokeathlonStatName> names) {
    this.names = names;
    return this;
  }

  public PokeathlonStatDetail addNamesItem(PokeathlonStatName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @Valid 
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid PokeathlonStatName> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<@Valid PokeathlonStatName> names) {
    this.names = names;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeathlonStatDetail pokeathlonStatDetail = (PokeathlonStatDetail) o;
    return Objects.equals(this.id, pokeathlonStatDetail.id) &&
        Objects.equals(this.name, pokeathlonStatDetail.name) &&
        Objects.equals(this.affectingNatures, pokeathlonStatDetail.affectingNatures) &&
        Objects.equals(this.names, pokeathlonStatDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, affectingNatures, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

