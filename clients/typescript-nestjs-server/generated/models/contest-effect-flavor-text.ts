import { LanguageSummary } from './language-summary';


export interface ContestEffectFlavorText { 
  /**
   * The localized flavor text for an API resource in a specific language.
   */
  flavor_text: string;
  /**
   * The language this name is in.
   */
  language: LanguageSummary;
}

