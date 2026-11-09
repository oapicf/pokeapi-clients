import { LanguageSummary } from './language-summary';
import { VersionGroupSummary } from './version-group-summary';


export interface ItemFlavorText { 
  /**
   * The localized flavor text for an API resource in a specific language.
   */
  text: string;
  /**
   * The version group which uses this flavor text.
   */
  version_group: VersionGroupSummary;
  /**
   * The language this name is in.
   */
  language: LanguageSummary;
}

