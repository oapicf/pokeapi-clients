package apimodels;

import apimodels.LanguageSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemFlingEffectEffectText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemFlingEffectEffectText   {
  @JsonProperty("effect")
  @NotNull
@Size(max=6000)

  private String effect;

  @JsonProperty("language")
  @NotNull
@Valid

  private LanguageSummary language;

  public ItemFlingEffectEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public ItemFlingEffectEffectText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
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
    return Objects.equals(effect, itemFlingEffectEffectText.effect) &&
        Objects.equals(language, itemFlingEffectEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

