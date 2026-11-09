package apimodels;

import apimodels.LanguageSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MoveEffectChangeEffectText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveEffectChangeEffectText   {
  @JsonProperty("effect")
  @NotNull
@Size(max=6000)

  private String effect;

  @JsonProperty("language")
  @NotNull
@Valid

  private LanguageSummary language;

  public MoveEffectChangeEffectText effect(String effect) {
    this.effect = effect;
    return this;
  }

   /**
   * The localized effect text for an API resource in a specific language.
   * @return effect
  **/
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public MoveEffectChangeEffectText language(LanguageSummary language) {
    this.language = language;
    return this;
  }

   /**
   * The language this effect is in.
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
    MoveEffectChangeEffectText moveEffectChangeEffectText = (MoveEffectChangeEffectText) o;
    return Objects.equals(effect, moveEffectChangeEffectText.effect) &&
        Objects.equals(language, moveEffectChangeEffectText.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveEffectChangeEffectText {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

