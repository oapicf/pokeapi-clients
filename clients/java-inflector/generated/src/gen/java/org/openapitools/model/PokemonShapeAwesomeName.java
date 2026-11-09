package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonShapeAwesomeName   {
  @JsonProperty("awesome_name")
  private String awesomeName;

  @JsonProperty("language")
  private LanguageSummary language;

  /**
   * The localized \"scientific\" name for an API resource in a specific language.
   **/
  public PokemonShapeAwesomeName awesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The localized \"scientific\" name for an API resource in a specific language.")
  @JsonProperty("awesome_name")
  public String getAwesomeName() {
    return awesomeName;
  }
  public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }

  /**
   * The language this \"scientific\" name is in.
   **/
  public PokemonShapeAwesomeName language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language this \"scientific\" name is in.")
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

