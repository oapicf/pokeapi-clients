import { CharacteristicSummary } from './characteristic-summary';
import { MoveDamageClassSummary } from './move-damage-class-summary';
import { StatName } from './stat-name';
import { StatDetailAffectingNatures } from './stat-detail-affecting-natures';
import { StatDetailAffectingMoves } from './stat-detail-affecting-moves';


export interface StatDetail { 
  readonly id: number;
  name: string;
  game_index: number;
  is_battle_only?: boolean;
  affecting_moves: StatDetailAffectingMoves;
  affecting_natures: StatDetailAffectingNatures;
  readonly characteristics: Array<CharacteristicSummary>;
  move_damage_class: MoveDamageClassSummary;
  readonly names: Array<StatName>;
}

