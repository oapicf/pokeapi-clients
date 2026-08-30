import { StatSummary } from './stat-summary';
import { BerrySummary } from './berry-summary';
import { NatureBattleStylePreference } from './nature-battle-style-preference';
import { NatureDetailPokeathlonStatChangesInner } from './nature-detail-pokeathlon-stat-changes-inner';
import { BerryFlavorSummary } from './berry-flavor-summary';
import { NatureName } from './nature-name';


export interface NatureDetail { 
  readonly id: number;
  name: string;
  decreased_stat: StatSummary;
  increased_stat: StatSummary;
  likes_flavor: BerryFlavorSummary;
  hates_flavor: BerryFlavorSummary;
  readonly berries: Array<BerrySummary>;
  readonly pokeathlon_stat_changes: Array<NatureDetailPokeathlonStatChangesInner>;
  readonly move_battle_style_preferences: Array<NatureBattleStylePreference>;
  readonly names: Array<NatureName>;
}

