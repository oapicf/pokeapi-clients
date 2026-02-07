package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.MoveDetailContestCombosNormal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetailContestCombos  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private MoveDetailContestCombosNormal normal;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private MoveDetailContestCombosNormal _super;
 /**
   * Get normal
   * @return normal
  **/
  @JsonProperty("normal")
  @NotNull
  public MoveDetailContestCombosNormal getNormal() {
    return normal;
  }

  public void setNormal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
  }

  public MoveDetailContestCombos normal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
    return this;
  }

 /**
   * Get _super
   * @return _super
  **/
  @JsonProperty("super")
  @NotNull
  public MoveDetailContestCombosNormal getSuper() {
    return _super;
  }

  public void setSuper(MoveDetailContestCombosNormal _super) {
    this._super = _super;
  }

  public MoveDetailContestCombos _super(MoveDetailContestCombosNormal _super) {
    this._super = _super;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

