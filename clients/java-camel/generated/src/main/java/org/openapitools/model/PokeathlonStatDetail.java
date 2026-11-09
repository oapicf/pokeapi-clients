package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatAffectingNatures;
import org.openapitools.model.PokeathlonStatName;
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

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeathlonStatDetail {

  private Integer id;

  private String name;

  private PokeathlonStatAffectingNatures affectingNatures;

  private List<@Valid PokeathlonStatName> names = new ArrayList<>();

  public PokeathlonStatDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokeathlonStatDetail(Integer id, String name, PokeathlonStatAffectingNatures affectingNatures, List<@Valid PokeathlonStatName> names) {
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
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PokeathlonStatDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokeathlonStatDetail affectingNatures(PokeathlonStatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  /**
   * A detail of natures which affect this Pokéathlon stat positively or negatively.
   * @return affectingNatures
   */
  @Valid 
  @Schema(name = "affecting_natures", accessMode = Schema.AccessMode.READ_ONLY, description = "A detail of natures which affect this Pokéathlon stat positively or negatively.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("affecting_natures")
  public PokeathlonStatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  public void setAffectingNatures(PokeathlonStatAffectingNatures affectingNatures) {
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
   * The name of this resource listed in different languages.
   * @return names
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid PokeathlonStatName> getNames() {
    return names;
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

