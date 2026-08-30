import { MoveName } from './move-name';
import { MoveDetailEffectChangesInner } from './move-detail-effect-changes-inner';
import { MoveFlavorText } from './move-flavor-text';
import { GenerationSummary } from './generation-summary';
import { ContestTypeSummary } from './contest-type-summary';
import { MoveDetailStatChangesInner } from './move-detail-stat-changes-inner';
import { MoveMeta } from './move-meta';
import { TypeSummary } from './type-summary';
import { MoveDetailContestCombos } from './move-detail-contest-combos';
import { ContestEffectSummary } from './contest-effect-summary';
import { MoveChangeEffectEntriesInner } from './move-change-effect-entries-inner';
import { MoveDetailMachinesInner } from './move-detail-machines-inner';
import { MoveDamageClassSummary } from './move-damage-class-summary';
import { MoveTargetSummary } from './move-target-summary';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { MoveChange } from './move-change';
import { SuperContestEffectSummary } from './super-contest-effect-summary';


export interface MoveDetail { 
  readonly id: number;
  name: string;
  accuracy?: number | null;
  effect_chance: number;
  pp?: number | null;
  priority?: number | null;
  power?: number | null;
  contest_combos: MoveDetailContestCombos;
  contest_type: ContestTypeSummary;
  contest_effect: ContestEffectSummary;
  damage_class: MoveDamageClassSummary;
  readonly effect_entries: Array<MoveChangeEffectEntriesInner>;
  readonly effect_changes: Array<MoveDetailEffectChangesInner>;
  generation: GenerationSummary;
  readonly meta: MoveMeta;
  readonly names: Array<MoveName>;
  readonly past_values: Array<MoveChange>;
  readonly stat_changes: Array<MoveDetailStatChangesInner>;
  super_contest_effect: SuperContestEffectSummary;
  target: MoveTargetSummary;
  type: TypeSummary;
  readonly machines: Array<MoveDetailMachinesInner>;
  readonly flavor_text_entries: Array<MoveFlavorText>;
  readonly learned_by_pokemon: Array<AbilityDetailPokemonInnerPokemon>;
}

