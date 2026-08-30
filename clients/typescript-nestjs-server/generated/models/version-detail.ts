import { VersionGroupSummary } from './version-group-summary';
import { VersionName } from './version-name';


/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I\'m not sure how to add anything other than a hyperlink
 */
export interface VersionDetail { 
  readonly id: number;
  name: string;
  readonly names: Array<VersionName>;
  version_group: VersionGroupSummary;
}

