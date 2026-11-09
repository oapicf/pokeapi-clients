import { LanguageSummary } from './language-summary';


export interface EvolutionVariableName { 
  /**
   * The localized name for an API resource in a specific language.
   */
  name: string;
  /**
   * The language this name is in.
   */
  language: LanguageSummary;
}

