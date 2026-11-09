package apimodels;

import apimodels.LanguageSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonSpeciesGenus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonSpeciesGenus   {
  @JsonProperty("genus")
  @NotNull
@Size(max=30)

  private String genus;

  @JsonProperty("language")
  @NotNull
@Valid

  private LanguageSummary language;

  public PokemonSpeciesGenus genus(String genus) {
    this.genus = genus;
    return this;
  }

   /**
   * The localized genus for the referenced Pokémon species
   * @return genus
  **/
  public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public PokemonSpeciesGenus language(LanguageSummary language) {
    this.language = language;
    return this;
  }

   /**
   * The language this genus is in.
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
    PokemonSpeciesGenus pokemonSpeciesGenus = (PokemonSpeciesGenus) o;
    return Objects.equals(genus, pokemonSpeciesGenus.genus) &&
        Objects.equals(language, pokemonSpeciesGenus.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genus, language);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

