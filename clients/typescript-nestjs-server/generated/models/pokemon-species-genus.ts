import { LanguageSummary } from './language-summary';


export interface PokemonSpeciesGenus { 
  /**
   * The localized genus for the referenced Pokémon species
   */
  genus: string;
  /**
   * The language this genus is in.
   */
  language: LanguageSummary;
}

