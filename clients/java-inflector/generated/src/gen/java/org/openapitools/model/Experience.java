package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class Experience   {
  @JsonProperty("level")
  private Integer level;

  @JsonProperty("experience")
  private Integer experience;

  /**
   * The level gained.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public Experience level(Integer level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The level gained.")
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }

  /**
   * The amount of experience required to reach the referenced level.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public Experience experience(Integer experience) {
    this.experience = experience;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The amount of experience required to reach the referenced level.")
  @JsonProperty("experience")
  public Integer getExperience() {
    return experience;
  }
  public void setExperience(Integer experience) {
    this.experience = experience;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Experience experience = (Experience) o;
    return Objects.equals(level, experience.level) &&
        Objects.equals(experience, experience.experience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, experience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Experience {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
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

