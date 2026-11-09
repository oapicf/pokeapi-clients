import { MoveSummary } from './move-summary';


export interface MoveComboUsage { 
  /**
   * A list of moves to use before this move.
   */
  use_before: Array<MoveSummary> | null;
  /**
   * A list of moves to use after this move.
   */
  use_after: Array<MoveSummary> | null;
}

