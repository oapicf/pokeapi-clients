package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ItemFlingEffectEffectText   {
  
  private String effect;

  private LanguageSummary language;

  /**
   **/
  public ItemFlingEffectEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

  
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
  public ItemFlingEffectEffectText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
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
    ItemFlingEffectEffectText itemFlingEffectEffectText = (ItemFlingEffectEffectText) o;
    return Objects.equals(this.effect, itemFlingEffectEffectText.effect) &&
        Objects.equals(this.language, itemFlingEffectEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemFlingEffectEffectText {\n");
    
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

