package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.LanguageSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonSpeciesGenus   {
  
  private String genus;
  private LanguageSummary language;

  public PokemonSpeciesGenus () {

  }

  public PokemonSpeciesGenus (String genus, LanguageSummary language) {
    this.genus = genus;
    this.language = language;
  }

    
  @JsonProperty("genus")
  public String getGenus() {
    return genus;
  }
  public void setGenus(String genus) {
    this.genus = genus;
  }

    
  @JsonProperty("language")
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
    PokemonSpeciesGenus pokemonSpeciesGenus = (PokemonSpeciesGenus) o;
    return Objects.equals(genus, pokemonSpeciesGenus.genus) &&
        Objects.equals(language, pokemonSpeciesGenus.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genus, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesGenus {\n");
    
    sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
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
