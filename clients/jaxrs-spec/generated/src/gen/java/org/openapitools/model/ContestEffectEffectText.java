package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ContestEffectEffectText")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ContestEffectEffectText   {
  private String effect;
  private LanguageSummary language;

  public ContestEffectEffectText() {
  }

  @JsonCreator
  public ContestEffectEffectText(
    @JsonProperty(required = true, value = "effect") String effect,
    @JsonProperty(required = true, value = "language") LanguageSummary language
  ) {
    this.effect = effect;
    this.language = language;
  }

  /**
   **/
  public ContestEffectEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "effect")
  @NotNull  @Size(max=6000)public String getEffect() {
    return effect;
  }

  @JsonProperty(required = true, value = "effect")
  public void setEffect(String effect) {
    this.effect = effect;
  }

  /**
   **/
  public ContestEffectEffectText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public LanguageSummary getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(LanguageSummary language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestEffectEffectText contestEffectEffectText = (ContestEffectEffectText) o;
    return Objects.equals(this.effect, contestEffectEffectText.effect) &&
        Objects.equals(this.language, contestEffectEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestEffectEffectText {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

