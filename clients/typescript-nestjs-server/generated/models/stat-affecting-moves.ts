import { MoveStatChange } from './move-stat-change';


export interface StatAffectingMoves { 
  /**
   * A list of moves and how they change the referenced stat.
   */
  increase: Array<MoveStatChange>;
  /**
   * A list of moves and how they change the referenced stat.
   */
  decrease: Array<MoveStatChange>;
}

