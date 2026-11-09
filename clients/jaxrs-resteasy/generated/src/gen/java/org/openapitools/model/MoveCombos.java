package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveComboUsage;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveCombos   {
  
  private MoveComboUsage normal;
  private MoveComboUsage _super;

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in contests.
   **/
  
  @ApiModelProperty(required = true, value = "A detail of moves this move can be used before or after, granting additional appeal points in contests.")
  @JsonProperty("normal")
  @NotNull
  @Valid
  public MoveComboUsage getNormal() {
    return normal;
  }
  public void setNormal(MoveComboUsage normal) {
    this.normal = normal;
  }

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
   **/
  
  @ApiModelProperty(required = true, value = "A detail of moves this move can be used before or after, granting additional appeal points in super contests.")
  @JsonProperty("super")
  @NotNull
  @Valid
  public MoveComboUsage getSuper() {
    return _super;
  }
  public void setSuper(MoveComboUsage _super) {
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
    MoveCombos moveCombos = (MoveCombos) o;
    return Objects.equals(this.normal, moveCombos.normal) &&
        Objects.equals(this._super, moveCombos._super);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normal, _super);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveCombos {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

