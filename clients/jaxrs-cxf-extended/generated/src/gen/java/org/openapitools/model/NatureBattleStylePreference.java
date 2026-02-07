package org.openapitools.model;

import org.openapitools.model.MoveBattleStyleSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NatureBattleStylePreference  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer lowHpPreference;

  @ApiModelProperty(required = true, value = "")
  private Integer highHpPreference;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MoveBattleStyleSummary moveBattleStyle;
 /**
  * Get lowHpPreference
  * @return lowHpPreference
  */
  @JsonProperty("low_hp_preference")
  @NotNull
  public Integer getLowHpPreference() {
    return lowHpPreference;
  }

  /**
   * Sets the <code>lowHpPreference</code> property.
   */
 public void setLowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
  }

  /**
   * Sets the <code>lowHpPreference</code> property.
   */
  public NatureBattleStylePreference lowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
    return this;
  }

 /**
  * Get highHpPreference
  * @return highHpPreference
  */
  @JsonProperty("high_hp_preference")
  @NotNull
  public Integer getHighHpPreference() {
    return highHpPreference;
  }

  /**
   * Sets the <code>highHpPreference</code> property.
   */
 public void setHighHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
  }

  /**
   * Sets the <code>highHpPreference</code> property.
   */
  public NatureBattleStylePreference highHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
    return this;
  }

 /**
  * Get moveBattleStyle
  * @return moveBattleStyle
  */
  @JsonProperty("move_battle_style")
  @NotNull
  public MoveBattleStyleSummary getMoveBattleStyle() {
    return moveBattleStyle;
  }

  /**
   * Sets the <code>moveBattleStyle</code> property.
   */
 public void setMoveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
  }

  /**
   * Sets the <code>moveBattleStyle</code> property.
   */
  public NatureBattleStylePreference moveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

