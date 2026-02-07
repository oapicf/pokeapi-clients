package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.MoveDetailContestCombosNormal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveDetailContestCombos   {
  
  private MoveDetailContestCombosNormal normal;
  private MoveDetailContestCombosNormal _super;

  public MoveDetailContestCombos () {

  }

  public MoveDetailContestCombos (MoveDetailContestCombosNormal normal, MoveDetailContestCombosNormal _super) {
    this.normal = normal;
    this._super = _super;
  }

    
  @JsonProperty("normal")
  public MoveDetailContestCombosNormal getNormal() {
    return normal;
  }
  public void setNormal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
  }

    
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
    return Objects.equals(normal, moveDetailContestCombos.normal) &&
        Objects.equals(_super, moveDetailContestCombos._super);
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
