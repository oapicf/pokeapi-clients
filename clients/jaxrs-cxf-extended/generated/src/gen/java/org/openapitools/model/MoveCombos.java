package org.openapitools.model;

import org.openapitools.model.MoveComboUsage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveCombos  {
  
 /**
  * A detail of moves this move can be used before or after, granting additional appeal points in contests.
  */
  @ApiModelProperty(required = true, value = "A detail of moves this move can be used before or after, granting additional appeal points in contests.")
  @Valid
  private MoveComboUsage normal;

 /**
  * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
  */
  @ApiModelProperty(required = true, value = "A detail of moves this move can be used before or after, granting additional appeal points in super contests.")
  @Valid
  private MoveComboUsage _super;
 /**
  * A detail of moves this move can be used before or after, granting additional appeal points in contests.
  * @return normal
  */
  @JsonProperty("normal")
  @NotNull
  public MoveComboUsage getNormal() {
    return normal;
  }

  /**
   * Sets the <code>normal</code> property.
   */
 public void setNormal(MoveComboUsage normal) {
    this.normal = normal;
  }

  /**
   * Sets the <code>normal</code> property.
   */
  public MoveCombos normal(MoveComboUsage normal) {
    this.normal = normal;
    return this;
  }

 /**
  * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
  * @return _super
  */
  @JsonProperty("super")
  @NotNull
  public MoveComboUsage getSuper() {
    return _super;
  }

  /**
   * Sets the <code>_super</code> property.
   */
 public void setSuper(MoveComboUsage _super) {
    this._super = _super;
  }

  /**
   * Sets the <code>_super</code> property.
   */
  public MoveCombos _super(MoveComboUsage _super) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

