import { LanguageSummary } from './language-summary';
import { VersionGroupSummary } from './version-group-summary';


export interface ItemFlavorText { 
  text: string;
  version_group: VersionGroupSummary;
  language: LanguageSummary;
}

