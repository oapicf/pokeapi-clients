package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveBattleStyleSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class NatureBattleStylePreference   {
  
  private Integer lowHpPreference;

  private Integer highHpPreference;

  private MoveBattleStyleSummary moveBattleStyle;

  /**
   * Chance of using the move, in percent, if HP is under one half.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public NatureBattleStylePreference lowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Chance of using the move, in percent, if HP is under one half.")
  @JsonProperty("low_hp_preference")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getLowHpPreference() {
    return lowHpPreference;
  }
  public void setLowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
  }


  /**
   * Chance of using the move, in percent, if HP is over one half.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public NatureBattleStylePreference highHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Chance of using the move, in percent, if HP is over one half.")
  @JsonProperty("high_hp_preference")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getHighHpPreference() {
    return highHpPreference;
  }
  public void setHighHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
  }


  /**
   * The move battle style.
   **/
  public NatureBattleStylePreference moveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The move battle style.")
  @JsonProperty("move_battle_style")
  @NotNull
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

