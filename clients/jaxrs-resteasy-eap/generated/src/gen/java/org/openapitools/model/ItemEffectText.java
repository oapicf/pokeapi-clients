package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemEffectText   {
  
  private String effect;
  private String shortEffect;
  private LanguageSummary language;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect")
  @NotNull
 @Size(max=6000)  public String getEffect() {
    return effect;
  }
  public void setEffect(String effect) {
    this.effect = effect;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("short_effect")
  @NotNull
 @Size(max=300)  public String getShortEffect() {
    return shortEffect;
  }
  public void setShortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  @NotNull
  public LanguageSummary getLanguage() {
    return language;
  }
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
    ItemEffectText itemEffectText = (ItemEffectText) o;
    return Objects.equals(this.effect, itemEffectText.effect) &&
        Objects.equals(this.shortEffect, itemEffectText.shortEffect) &&
        Objects.equals(this.language, itemEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, shortEffect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemEffectText {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    shortEffect: ").append(toIndentedString(shortEffect)).append("\n");
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

