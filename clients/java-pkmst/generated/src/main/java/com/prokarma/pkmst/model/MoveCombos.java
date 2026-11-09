package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MoveComboUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveCombos
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveCombos   {
  @JsonProperty("normal")
  private MoveComboUsage normal;

  @JsonProperty("super")
  private MoveComboUsage _super;

  public MoveCombos normal(MoveComboUsage normal) {
    this.normal = normal;
    return this;
  }

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in contests.
   * @return normal
   */
  @ApiModelProperty(required = true, value = "A detail of moves this move can be used before or after, granting additional appeal points in contests.")
  public MoveComboUsage getNormal() {
    return normal;
  }

  public void setNormal(MoveComboUsage normal) {
    this.normal = normal;
  }

  public MoveCombos _super(MoveComboUsage _super) {
    this._super = _super;
    return this;
  }

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
   * @return _super
   */
  @ApiModelProperty(required = true, value = "A detail of moves this move can be used before or after, granting additional appeal points in super contests.")
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

