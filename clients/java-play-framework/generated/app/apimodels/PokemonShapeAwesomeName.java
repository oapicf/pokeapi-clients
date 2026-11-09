package apimodels;

import apimodels.LanguageSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonShapeAwesomeName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonShapeAwesomeName   {
  @JsonProperty("awesome_name")
  @NotNull
@Size(max=30)

  private String awesomeName;

  @JsonProperty("language")
  @NotNull
@Valid

  private LanguageSummary language;

  public PokemonShapeAwesomeName awesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
    return this;
  }

   /**
   * The localized \"scientific\" name for an API resource in a specific language.
   * @return awesomeName
  **/
  public String getAwesomeName() {
    return awesomeName;
  }

  public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }

  public PokemonShapeAwesomeName language(LanguageSummary language) {
    this.language = language;
    return this;
  }

   /**
   * The language this \"scientific\" name is in.
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
    PokemonShapeAwesomeName pokemonShapeAwesomeName = (PokemonShapeAwesomeName) o;
    return Objects.equals(awesomeName, pokemonShapeAwesomeName.awesomeName) &&
        Objects.equals(language, pokemonShapeAwesomeName.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awesomeName, language);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

