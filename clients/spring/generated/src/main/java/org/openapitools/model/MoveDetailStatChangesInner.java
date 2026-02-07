package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveDetailStatChangesInner
 */

@JsonTypeName("MoveDetail_stat_changes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailStatChangesInner {

  private Integer change;

  private AbilityDetailPokemonInnerPokemon stat;

  public MoveDetailStatChangesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveDetailStatChangesInner(Integer change, AbilityDetailPokemonInnerPokemon stat) {
    this.change = change;
    this.stat = stat;
  }

  public MoveDetailStatChangesInner change(Integer change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
   */
  @NotNull 
  @Schema(name = "change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  public MoveDetailStatChangesInner stat(AbilityDetailPokemonInnerPokemon stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   */
  @NotNull @Valid 
  @Schema(name = "stat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stat")
  public AbilityDetailPokemonInnerPokemon getStat() {
    return stat;
  }

  public void setStat(AbilityDetailPokemonInnerPokemon stat) {
    this.stat = stat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveDetailStatChangesInner moveDetailStatChangesInner = (MoveDetailStatChangesInner) o;
    return Objects.equals(this.change, moveDetailStatChangesInner.change) &&
        Objects.equals(this.stat, moveDetailStatChangesInner.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailStatChangesInner {\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

