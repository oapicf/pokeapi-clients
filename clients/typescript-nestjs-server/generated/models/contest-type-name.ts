import { LanguageSummary } from './language-summary';


export interface ContestTypeName { 
  /**
   * The name for this contest.
   */
  name: string;
  /**
   * The color associated with this contest\'s name.
   */
  color: string;
  /**
   * The language that this name is in.
   */
  language: LanguageSummary;
}

