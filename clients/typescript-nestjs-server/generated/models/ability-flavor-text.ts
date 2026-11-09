import { LanguageSummary } from './language-summary';
import { VersionGroupSummary } from './version-group-summary';


export interface AbilityFlavorText { 
  /**
   * The localized name for an API resource in a specific language.
   */
  flavor_text: string;
  /**
   * The language this text resource is in.
   */
  language: LanguageSummary;
  /**
   * The version group that uses this flavor text.
   */
  version_group: VersionGroupSummary;
}

