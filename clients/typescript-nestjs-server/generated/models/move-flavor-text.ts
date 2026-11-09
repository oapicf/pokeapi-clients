import { LanguageSummary } from './language-summary';
import { VersionGroupSummary } from './version-group-summary';


export interface MoveFlavorText { 
  /**
   * The localized flavor text for an api resource in a specific language.
   */
  flavor_text: string;
  /**
   * The language this name is in.
   */
  language: LanguageSummary;
  /**
   * The version group that uses this flavor text.
   */
  version_group: VersionGroupSummary;
}

