package apimodels;

import apimodels.PokemonFormSummary;
import java.net.URI;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonFormTriggerCondition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonFormTriggerCondition   {
  @JsonProperty("trigger")
  @NotNull

  private String trigger;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("url")
  @Valid

  private URI url;

  @JsonProperty("base_form")
  @Valid

  private PokemonFormSummary baseForm;

  public PokemonFormTriggerCondition trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

   /**
   * The trigger for this form change.
   * @return trigger
  **/
  public String getTrigger() {
    return trigger;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  public PokemonFormTriggerCondition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the required item, ability, or move. Only present for a resource-based trigger.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonFormTriggerCondition url(URI url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the required item, ability, or move. Only present for a resource-based trigger.
   * @return url
  **/
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public PokemonFormTriggerCondition baseForm(PokemonFormSummary baseForm) {
    this.baseForm = baseForm;
    return this;
  }

   /**
   * The required base form. Only present when the trigger specifies one.
   * @return baseForm
  **/
  public PokemonFormSummary getBaseForm() {
    return baseForm;
  }

  public void setBaseForm(PokemonFormSummary baseForm) {
    this.baseForm = baseForm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonFormTriggerCondition pokemonFormTriggerCondition = (PokemonFormTriggerCondition) o;
    return Objects.equals(trigger, pokemonFormTriggerCondition.trigger) &&
        Objects.equals(name, pokemonFormTriggerCondition.name) &&
        Objects.equals(url, pokemonFormTriggerCondition.url) &&
        Objects.equals(baseForm, pokemonFormTriggerCondition.baseForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trigger, name, url, baseForm);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormTriggerCondition {\n");
    
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    baseForm: ").append(toIndentedString(baseForm)).append("\n");
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

