package org.openapitools.model;

import org.openapitools.model.MoveBattleStyleSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class NatureBattleStylePreference implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Chance of using the move, in percent, if HP is under one half.
   */
  @JsonProperty("low_hp_preference")
  private Integer lowHpPreference;

  /**
   * Chance of using the move, in percent, if HP is over one half.
   */
  @JsonProperty("high_hp_preference")
  private Integer highHpPreference;

  /**
   * The move battle style.
   */
  @JsonProperty("move_battle_style")
  private MoveBattleStyleSummary moveBattleStyle;

  /**
   * Chance of using the move, in percent, if HP is under one half.
   * @return lowHpPreference
   */
  public Integer getLowHpPreference() {
    return lowHpPreference;
  }

  public void setLowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
  }

  /**
   * Chance of using the move, in percent, if HP is over one half.
   * @return highHpPreference
   */
  public Integer getHighHpPreference() {
    return highHpPreference;
  }

  public void setHighHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
  }

  /**
   * The move battle style.
   * @return moveBattleStyle
   */
  public MoveBattleStyleSummary getMoveBattleStyle() {
    return moveBattleStyle;
  }

  public void setMoveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatureBattleStylePreference natureBattleStylePreference = (NatureBattleStylePreference) o;
    return Objects.equals(this.lowHpPreference, natureBattleStylePreference.lowHpPreference) &&
        Objects.equals(this.highHpPreference, natureBattleStylePreference.highHpPreference) &&
        Objects.equals(this.moveBattleStyle, natureBattleStylePreference.moveBattleStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowHpPreference, highHpPreference, moveBattleStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatureBattleStylePreference {\n");
    
    sb.append("    lowHpPreference: ").append(toIndentedString(lowHpPreference)).append("\n");
    sb.append("    highHpPreference: ").append(toIndentedString(highHpPreference)).append("\n");
    sb.append("    moveBattleStyle: ").append(toIndentedString(moveBattleStyle)).append("\n");
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
