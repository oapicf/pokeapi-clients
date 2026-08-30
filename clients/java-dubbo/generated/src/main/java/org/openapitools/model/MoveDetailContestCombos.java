package org.openapitools.model;

import org.openapitools.model.MoveDetailContestCombosNormal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MoveDetailContestCombos implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("normal")
  private MoveDetailContestCombosNormal normal;

  @JsonProperty("super")
  private MoveDetailContestCombosNormal _super;

  /**
   * 
   * @return normal
   */
  public MoveDetailContestCombosNormal getNormal() {
    return normal;
  }

  public void setNormal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
  }

  /**
   * 
   * @return _super
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
