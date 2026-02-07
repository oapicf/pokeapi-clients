package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * MoveDetailContestCombosNormal
 */

@JsonTypeName("MoveDetail_contest_combos_normal")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailContestCombosNormal {

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();

  public MoveDetailContestCombosNormal() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveDetailContestCombosNormal(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore, List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useBefore = useBefore;
    this.useAfter = useAfter;
  }

  public MoveDetailContestCombosNormal useBefore(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  public MoveDetailContestCombosNormal addUseBeforeItem(AbilityDetailPokemonInnerPokemon useBeforeItem) {
    if (this.useBefore == null) {
      this.useBefore = new ArrayList<>();
    }
    this.useBefore.add(useBeforeItem);
    return this;
  }

  /**
   * Get useBefore
   * @return useBefore
   */
  @NotNull @Valid 
  @Schema(name = "use_before", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("use_before")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getUseBefore() {
    return useBefore;
  }

  public void setUseBefore(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
  }

  public MoveDetailContestCombosNormal useAfter(List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  public MoveDetailContestCombosNormal addUseAfterItem(AbilityDetailPokemonInnerPokemon useAfterItem) {
    if (this.useAfter == null) {
      this.useAfter = new ArrayList<>();
    }
    this.useAfter.add(useAfterItem);
    return this;
  }

  /**
   * Get useAfter
   * @return useAfter
   */
  @NotNull @Valid 
  @Schema(name = "use_after", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("use_after")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getUseAfter() {
    return useAfter;
  }

  public void setUseAfter(List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveDetailContestCombosNormal moveDetailContestCombosNormal = (MoveDetailContestCombosNormal) o;
    return Objects.equals(this.useBefore, moveDetailContestCombosNormal.useBefore) &&
        Objects.equals(this.useAfter, moveDetailContestCombosNormal.useAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useBefore, useAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailContestCombosNormal {\n");
    sb.append("    useBefore: ").append(toIndentedString(useBefore)).append("\n");
    sb.append("    useAfter: ").append(toIndentedString(useAfter)).append("\n");
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

