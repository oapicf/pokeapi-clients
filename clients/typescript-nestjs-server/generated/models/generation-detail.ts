import { VersionGroupSummary } from './version-group-summary';
import { MoveSummary } from './move-summary';
import { GenerationName } from './generation-name';
import { TypeSummary } from './type-summary';
import { AbilitySummary } from './ability-summary';
import { RegionSummary } from './region-summary';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface GenerationDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of abilities that were introduced in this generation.
   */
  readonly abilities: Array<AbilitySummary>;
  /**
   * The main region travelled in this generation.
   */
  main_region: RegionSummary;
  /**
   * A list of moves that were introduced in this generation.
   */
  readonly moves: Array<MoveSummary>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<GenerationName>;
  /**
   * A list of Pokémon species that were introduced in this generation.
   */
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
  /**
   * A list of types that were introduced in this generation.
   */
  readonly types: Array<TypeSummary>;
  /**
   * A list of version groups that were introduced in this generation.
   */
  readonly version_groups: Array<VersionGroupSummary>;
}

