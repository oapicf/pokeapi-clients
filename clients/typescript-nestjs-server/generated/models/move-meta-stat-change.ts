import { StatSummary } from './stat-summary';


export interface MoveMetaStatChange { 
  /**
   * The amount of change.
   */
  change: number;
  /**
   * The stat being affected.
   */
  stat: StatSummary;
}

