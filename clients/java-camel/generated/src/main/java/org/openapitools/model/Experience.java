package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Experience
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Experience {

  private Integer level;

  private Integer experience;

  public Experience() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Experience(Integer level, Integer experience) {
    this.level = level;
    this.experience = experience;
  }

  public Experience level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  @NotNull 
  @Schema(name = "level", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
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
   */
  @NotNull 
  @Schema(name = "experience", requiredMode = Schema.RequiredMode.REQUIRED)
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

