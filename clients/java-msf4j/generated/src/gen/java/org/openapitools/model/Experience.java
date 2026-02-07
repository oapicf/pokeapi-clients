package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Experience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Experience   {
  @JsonProperty("level")
  private Integer level;

  @JsonProperty("experience")
  private Integer experience;

  public Experience level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Experience experience(Integer experience) {
    this.experience = experience;
    return this;
  }

   /**
   * Get experience
   * @return experience
  **/
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.level, experience.level) &&
        Objects.equals(this.experience, experience.experience);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

