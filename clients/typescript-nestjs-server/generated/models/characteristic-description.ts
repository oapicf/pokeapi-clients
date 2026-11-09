import { LanguageSummary } from './language-summary';


export interface CharacteristicDescription { 
  /**
   * The localized description for an API resource in a specific language.
   */
  description?: string;
  /**
   * The language this name is in.
   */
  language: LanguageSummary;
}

