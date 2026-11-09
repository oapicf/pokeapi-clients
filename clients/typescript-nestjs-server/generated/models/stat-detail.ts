import { CharacteristicSummary } from './characteristic-summary';
import { MoveDamageClassSummary } from './move-damage-class-summary';
import { StatAffectingNatures } from './stat-affecting-natures';
import { StatAffectingMoves } from './stat-affecting-moves';
import { StatName } from './stat-name';
import { ItemSummary } from './item-summary';


export interface StatDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * ID the games use for this stat.
   */
  game_index: number;
  /**
   * Whether this stat only exists within a battle.
   */
  is_battle_only?: boolean;
  /**
   * A detail of moves which affect this stat positively or negatively.
   */
  readonly affecting_moves: StatAffectingMoves;
  /**
   * A detail of natures which affect this stat positively or negatively.
   */
  readonly affecting_natures: StatAffectingNatures;
  /**
   * Items that affect this stat, such as vitamins and battle items.
   */
  readonly affecting_items: Array<ItemSummary>;
  /**
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   */
  readonly characteristics: Array<CharacteristicSummary>;
  /**
   * The class of damage this stat is directly related to.
   */
  move_damage_class: MoveDamageClassSummary | null;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<StatName>;
}

