package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.LanguageSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonShapeAwesomeName   {
  
  private String awesomeName;
  private LanguageSummary language;

  public PokemonShapeAwesomeName () {

  }

  public PokemonShapeAwesomeName (String awesomeName, LanguageSummary language) {
    this.awesomeName = awesomeName;
    this.language = language;
  }

    
  @JsonProperty("awesome_name")
  public String getAwesomeName() {
    return awesomeName;
  }
  public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
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
    PokemonShapeAwesomeName pokemonShapeAwesomeName = (PokemonShapeAwesomeName) o;
    return Objects.equals(awesomeName, pokemonShapeAwesomeName.awesomeName) &&
        Objects.equals(language, pokemonShapeAwesomeName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awesomeName, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonShapeAwesomeName {\n");
    
    sb.append("    awesomeName: ").append(toIndentedString(awesomeName)).append("\n");
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
