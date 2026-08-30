import { VersionGroupSummary } from './version-group-summary';
import { MoveSummary } from './move-summary';
import { GenerationName } from './generation-name';
import { TypeSummary } from './type-summary';
import { AbilitySummary } from './ability-summary';
import { RegionSummary } from './region-summary';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface GenerationDetail { 
  readonly id: number;
  name: string;
  readonly abilities: Array<AbilitySummary>;
  main_region: RegionSummary;
  readonly moves: Array<MoveSummary>;
  readonly names: Array<GenerationName>;
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
  readonly types: Array<TypeSummary>;
  readonly version_groups: Array<VersionGroupSummary>;
}

