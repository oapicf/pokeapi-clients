import { VersionGroupSummary } from './version-group-summary';
import { VersionName } from './version-name';


/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I\'m not sure how to add anything other than a hyperlink
 */
export interface VersionDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<VersionName>;
  /**
   * The version group this version belongs to.
   */
  version_group: VersionGroupSummary;
}

