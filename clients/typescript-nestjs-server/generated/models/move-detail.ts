import { MoveName } from './move-name';
import { MoveFlavorText } from './move-flavor-text';
import { MoveEffectChange } from './move-effect-change';
import { GenerationSummary } from './generation-summary';
import { MoveEffectEffectText } from './move-effect-effect-text';
import { ContestTypeSummary } from './contest-type-summary';
import { MoveMeta } from './move-meta';
import { TypeSummary } from './type-summary';
import { MoveMetaStatChange } from './move-meta-stat-change';
import { ContestEffectSummary } from './contest-effect-summary';
import { MoveCombos } from './move-combos';
import { ItemMachine } from './item-machine';
import { MoveDamageClassSummary } from './move-damage-class-summary';
import { MoveTargetSummary } from './move-target-summary';
import { PokemonSummary } from './pokemon-summary';
import { MoveChange } from './move-change';
import { SuperContestEffectSummary } from './super-contest-effect-summary';


export interface MoveDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The percent value of how likely this move is to be successful.
   */
  accuracy?: number | null;
  /**
   * The percent value of how likely it is this moves effect will happen.
   */
  effect_chance: number | null;
  /**
   * Power points. The number of times this move can be used.
   */
  pp?: number | null;
  /**
   * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
   */
  priority?: number | null;
  /**
   * The base power of this move, or null if it has no fixed base power.
   */
  power?: number | null;
  /**
   * A detail of normal and super contest combos that require this move.
   */
  readonly contest_combos: MoveCombos | null;
  /**
   * The type of appeal this move gives a Pokémon when used in a contest.
   */
  contest_type: ContestTypeSummary | null;
  /**
   * The effect the move has when used in a contest.
   */
  contest_effect: ContestEffectSummary | null;
  /**
   * The type of damage the move inflicts on the target, e.g. physical.
   */
  damage_class: MoveDamageClassSummary;
  /**
   * The effect of this move listed in different languages.
   */
  readonly effect_entries: Array<MoveEffectEffectText>;
  /**
   * The list of previous effects this move has had across version groups of the games.
   */
  readonly effect_changes: Array<MoveEffectChange>;
  /**
   * The generation in which this move was introduced.
   */
  generation: GenerationSummary;
  /**
   * Metadata about this move
   */
  readonly meta: MoveMeta | null;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<MoveName>;
  /**
   * A list of move resource value changes across version groups of the game.
   */
  readonly past_values: Array<MoveChange>;
  /**
   * A list of stats this moves effects and how much it effects them.
   */
  readonly stat_changes: Array<MoveMetaStatChange>;
  /**
   * The effect the move has when used in a super contest.
   */
  super_contest_effect: SuperContestEffectSummary | null;
  /**
   * The type of target that will receive the effects of the attack.
   */
  target: MoveTargetSummary;
  /**
   * The elemental type of this move.
   */
  type: TypeSummary;
  /**
   * A list of the machines that teach this move.
   */
  readonly machines: Array<ItemMachine>;
  /**
   * The flavor text of this move listed in different languages.
   */
  readonly flavor_text_entries: Array<MoveFlavorText>;
  /**
   * List of Pokemon that can learn the move
   */
  readonly learned_by_pokemon: Array<PokemonSummary>;
}

