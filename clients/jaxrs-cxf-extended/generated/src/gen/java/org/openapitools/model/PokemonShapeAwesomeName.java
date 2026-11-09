package org.openapitools.model;

import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonShapeAwesomeName  {
  
 /**
  * The localized \"scientific\" name for an API resource in a specific language.
  */
  @ApiModelProperty(required = true, value = "The localized \"scientific\" name for an API resource in a specific language.")
  private String awesomeName;

 /**
  * The language this \"scientific\" name is in.
  */
  @ApiModelProperty(required = true, value = "The language this \"scientific\" name is in.")
  @Valid
  private LanguageSummary language;
 /**
  * The localized \&quot;scientific\&quot; name for an API resource in a specific language.
  * @return awesomeName
  */
  @JsonProperty("awesome_name")
  @NotNull
 @Size(max=30)  public String getAwesomeName() {
    return awesomeName;
  }

  /**
   * Sets the <code>awesomeName</code> property.
   */
 public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }

  /**
   * Sets the <code>awesomeName</code> property.
   */
  public PokemonShapeAwesomeName awesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
    return this;
  }

 /**
  * The language this \&quot;scientific\&quot; name is in.
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public LanguageSummary getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(LanguageSummary language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public PokemonShapeAwesomeName language(LanguageSummary language) {
    this.language = language;
    return this;
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
    return Objects.equals(this.awesomeName, pokemonShapeAwesomeName.awesomeName) &&
        Objects.equals(this.language, pokemonShapeAwesomeName.language);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

