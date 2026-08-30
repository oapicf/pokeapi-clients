import { PokedexName } from './pokedex-name';
import { PokedexDescription } from './pokedex-description';
import { PokedexDetailPokemonEntriesInner } from './pokedex-detail-pokemon-entries-inner';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { RegionSummary } from './region-summary';


export interface PokedexDetail { 
  readonly id: number;
  name: string;
  is_main_series?: boolean;
  readonly descriptions: Array<PokedexDescription>;
  readonly names: Array<PokedexName>;
  readonly pokemon_entries: Array<PokedexDetailPokemonEntriesInner>;
  region: RegionSummary;
  readonly version_groups: Array<AbilityDetailPokemonInnerPokemon>;
}

