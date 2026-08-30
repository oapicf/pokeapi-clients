import { StatDetailAffectingMovesIncreaseInner } from './stat-detail-affecting-moves-increase-inner';


export interface StatDetailAffectingMoves { 
  increase: Array<StatDetailAffectingMovesIncreaseInner>;
  decrease: Array<StatDetailAffectingMovesIncreaseInner>;
}

