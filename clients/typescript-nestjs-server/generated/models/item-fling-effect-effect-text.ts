import { LanguageSummary } from './language-summary';


export interface ItemFlingEffectEffectText { 
  /**
   * The localized effect text for an API resource in a specific language.
   */
  effect: string;
  /**
   * The language this effect is in.
   */
  language: LanguageSummary;
}

