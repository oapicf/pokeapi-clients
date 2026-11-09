import { MoveBattleStyleSummary } from './move-battle-style-summary';


export interface NatureBattleStylePreference { 
  /**
   * Chance of using the move, in percent, if HP is under one half.
   */
  low_hp_preference: number;
  /**
   * Chance of using the move, in percent, if HP is over one half.
   */
  high_hp_preference: number;
  /**
   * The move battle style.
   */
  move_battle_style: MoveBattleStyleSummary;
}

