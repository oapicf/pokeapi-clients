import { LanguageSummary } from './language-summary';


export interface PokemonShapeAwesomeName { 
  /**
   * The localized \"scientific\" name for an API resource in a specific language.
   */
  awesome_name: string;
  /**
   * The language this \"scientific\" name is in.
   */
  language: LanguageSummary;
}

