import { LanguageSummary } from './language-summary';
import { VersionGroupSummary } from './version-group-summary';


export interface MoveFlavorText { 
  flavor_text: string;
  language: LanguageSummary;
  version_group: VersionGroupSummary;
}

