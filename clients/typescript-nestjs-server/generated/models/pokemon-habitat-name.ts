import { LanguageSummary } from './language-summary';


export interface PokemonHabitatName { 
  /**
   * The localized name for an API resource in a specific language.
   */
  name: string;
  /**
   * The language this name is in.
   */
  language: LanguageSummary;
}

