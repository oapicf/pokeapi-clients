import { MoveSummary } from './move-summary';


export interface MoveStatChange { 
  /**
   * The maximum amount of change to the referenced stat.
   */
  change: number;
  /**
   * The move causing the change.
   */
  move: MoveSummary;
}

