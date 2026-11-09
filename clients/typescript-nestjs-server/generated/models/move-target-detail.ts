import { MoveTargetDescription } from './move-target-description';
import { MoveSummary } from './move-summary';
import { MoveTargetName } from './move-target-name';


export interface MoveTargetDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The description of this resource listed in different languages.
   */
  readonly descriptions: Array<MoveTargetDescription>;
  /**
   * A list of moves that that are directed at this target.
   */
  readonly moves: Array<MoveSummary>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<MoveTargetName>;
}

