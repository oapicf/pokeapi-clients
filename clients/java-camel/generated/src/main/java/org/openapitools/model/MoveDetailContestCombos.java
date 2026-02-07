package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.MoveDetailContestCombosNormal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveDetailContestCombos
 */

@JsonTypeName("MoveDetail_contest_combos")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T15:23:32.871052804Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailContestCombos {

  private MoveDetailContestCombosNormal normal;

  private MoveDetailContestCombosNormal _super;

  public MoveDetailContestCombos() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveDetailContestCombos(MoveDetailContestCombosNormal normal, MoveDetailContestCombosNormal _super) {
    this.normal = normal;
    this._super = _super;
  }

  public MoveDetailContestCombos normal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
    return this;
  }

  /**
   * Get normal
   * @return normal
   */
  @NotNull @Valid 
  @Schema(name = "normal", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("normal")
  public MoveDetailContestCombosNormal getNormal() {
    return normal;
  }

  public void setNormal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
  }

  public MoveDetailContestCombos _super(MoveDetailContestCombosNormal _super) {
    this._super = _super;
    return this;
  }

  /**
   * Get _super
   * @return _super
   */
  @NotNull @Valid 
  @Schema(name = "super", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("super")
  public MoveDetailContestCombosNormal getSuper() {
    return _super;
  }

  public void setSuper(MoveDetailContestCombosNormal _super) {
    this._super = _super;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveDetailContestCombos moveDetailContestCombos = (MoveDetailContestCombos) o;
    return Objects.equals(this.normal, moveDetailContestCombos.normal) &&
        Objects.equals(this._super, moveDetailContestCombos._super);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normal, _super);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailContestCombos {\n");
    sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
    sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
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

