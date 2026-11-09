import { MoveComboUsage } from './move-combo-usage';


export interface MoveCombos { 
  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in contests.
   */
  normal: MoveComboUsage;
  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
   */
  'super': MoveComboUsage;
}

