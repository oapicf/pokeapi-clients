package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonShapeAwesomeName")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonShapeAwesomeName   {
  private String awesomeName;
  private LanguageSummary language;

  public PokemonShapeAwesomeName() {
  }

  @JsonCreator
  public PokemonShapeAwesomeName(
    @JsonProperty(required = true, value = "awesome_name") String awesomeName,
    @JsonProperty(required = true, value = "language") LanguageSummary language
  ) {
    this.awesomeName = awesomeName;
    this.language = language;
  }

  /**
   * The localized \&quot;scientific\&quot; name for an API resource in a specific language.
   **/
  public PokemonShapeAwesomeName awesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The localized \"scientific\" name for an API resource in a specific language.")
  @JsonProperty(required = true, value = "awesome_name")
  @NotNull  @Size(max=30)public String getAwesomeName() {
    return awesomeName;
  }

  @JsonProperty(required = true, value = "awesome_name")
  public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }

  /**
   * The language this \&quot;scientific\&quot; name is in.
   **/
  public PokemonShapeAwesomeName language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language this \"scientific\" name is in.")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public LanguageSummary getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
