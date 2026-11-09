import { MoveLearnMethodName } from './move-learn-method-name';
import { VersionGroupSummary } from './version-group-summary';
import { MoveLearnMethodDescription } from './move-learn-method-description';


export interface MoveLearnMethodDetail { 
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
  readonly names: Array<MoveLearnMethodName>;
  /**
   * The description of this resource listed in different languages.
   */
  readonly descriptions: Array<MoveLearnMethodDescription>;
  /**
   * A list of version groups where moves can be learned through this method.
   */
  readonly version_groups: Array<VersionGroupSummary>;
}

