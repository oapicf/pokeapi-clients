import { LanguageSummary } from './language-summary';


export interface BerryFirmnessName { 
  /**
   * The localized name for an API resource in a specific language.
   */
  name: string;
  /**
   * The language this name is in.
   */
  language: LanguageSummary;
}

