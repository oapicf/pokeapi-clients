import { LanguageSummary } from './language-summary';
import { VersionGroupSummary } from './version-group-summary';


export interface AbilityFlavorText { 
  flavor_text: string;
  language: LanguageSummary;
  version_group: VersionGroupSummary;
}

