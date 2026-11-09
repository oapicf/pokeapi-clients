import { StatSummary } from './stat-summary';
import { NaturePokeathlonStat } from './nature-pokeathlon-stat';
import { NatureBattleStylePreference } from './nature-battle-style-preference';
import { BerryFlavorSummary } from './berry-flavor-summary';
import { NatureName } from './nature-name';


export interface NatureDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The stat decreased by 10% in Pokémon with this nature.
   */
  decreased_stat: StatSummary | null;
  /**
   * The stat increased by 10% in Pokémon with this nature.
   */
  increased_stat: StatSummary | null;
  /**
   * The flavor liked by Pokémon with this nature.
   */
  likes_flavor: BerryFlavorSummary | null;
  /**
   * The flavor hated by Pokémon with this nature.
   */
  hates_flavor: BerryFlavorSummary | null;
  /**
   * A list of Pokéathlon stats this nature effects and how much it effects them.
   */
  readonly pokeathlon_stat_changes: Array<NaturePokeathlonStat>;
  /**
   * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
   */
  readonly move_battle_style_preferences: Array<NatureBattleStylePreference>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<NatureName>;
}

