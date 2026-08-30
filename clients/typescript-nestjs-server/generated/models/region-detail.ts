import { RegionName } from './region-name';
import { LocationSummary } from './location-summary';
import { GenerationSummary } from './generation-summary';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { PokedexSummary } from './pokedex-summary';


export interface RegionDetail { 
  readonly id: number;
  name: string;
  readonly locations: Array<LocationSummary>;
  readonly main_generation: GenerationSummary;
  readonly names: Array<RegionName>;
  readonly pokedexes: Array<PokedexSummary>;
  readonly version_groups: Array<AbilityDetailPokemonInnerPokemon>;
}

