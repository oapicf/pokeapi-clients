package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import org.openapitools.vertxweb.server.model.PokemonFormSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonFormTriggerCondition   {
  
  private String trigger;
  private String name;
  private URI url;
  private PokemonFormSummary baseForm;

  public PokemonFormTriggerCondition () {

  }

  public PokemonFormTriggerCondition (String trigger, String name, URI url, PokemonFormSummary baseForm) {
    this.trigger = trigger;
    this.name = name;
    this.url = url;
    this.baseForm = baseForm;
  }

    
  @JsonProperty("trigger")
  public String getTrigger() {
    return trigger;
  }
  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }

    
  @JsonProperty("base_form")
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
