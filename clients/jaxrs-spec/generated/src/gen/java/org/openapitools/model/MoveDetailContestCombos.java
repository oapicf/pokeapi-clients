package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveDetailContestCombosNormal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MoveDetail_contest_combos")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailContestCombos   {
  private MoveDetailContestCombosNormal normal;
  private MoveDetailContestCombosNormal _super;

  public MoveDetailContestCombos() {
  }

  @JsonCreator
  public MoveDetailContestCombos(
    @JsonProperty(required = true, value = "normal") MoveDetailContestCombosNormal normal,
    @JsonProperty(required = true, value = "super") MoveDetailContestCombosNormal _super
  ) {
    this.normal = normal;
    this._super = _super;
  }

  /**
   **/
  public MoveDetailContestCombos normal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "normal")
  @NotNull @Valid public MoveDetailContestCombosNormal getNormal() {
    return normal;
  }

  @JsonProperty(required = true, value = "normal")
  public void setNormal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
  }

  /**
   **/
  public MoveDetailContestCombos _super(MoveDetailContestCombosNormal _super) {
    this._super = _super;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "super")
  @NotNull @Valid public MoveDetailContestCombosNormal getSuper() {
    return _super;
  }

  @JsonProperty(required = true, value = "super")
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

