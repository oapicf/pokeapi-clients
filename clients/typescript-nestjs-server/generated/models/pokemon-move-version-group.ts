import { VersionGroupSummary } from './version-group-summary';
import { MoveLearnMethodSummary } from './move-learn-method-summary';


export interface PokemonMoveVersionGroup { 
  /**
   * The minimum level to learn the move.
   */
  level_learned_at: number;
  /**
   * The method by which the move is learned.
   */
  move_learn_method: MoveLearnMethodSummary;
  /**
   * The version group in which the move is learned.
   */
  version_group: VersionGroupSummary;
  /**
   * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
   */
  order?: number | null;
}

