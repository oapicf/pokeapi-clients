import { LanguageSummary } from './language-summary';


export interface GenerationName { 
  /**
   * The localized name for an API resource in a specific language.
   */
  name: string;
  /**
   * The language this name is in.
   */
  language: LanguageSummary;
}

