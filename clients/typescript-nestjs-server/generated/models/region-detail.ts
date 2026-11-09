import { RegionName } from './region-name';
import { VersionGroupSummary } from './version-group-summary';
import { LocationSummary } from './location-summary';
import { GenerationSummary } from './generation-summary';
import { PokedexSummary } from './pokedex-summary';


export interface RegionDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of locations that can be found in this region.
   */
  readonly locations: Array<LocationSummary>;
  /**
   * The generation this region was introduced in.
   */
  readonly main_generation: GenerationSummary | null;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<RegionName>;
  /**
   * A list of pokédexes that catalogue Pokémon in this region.
   */
  readonly pokedexes: Array<PokedexSummary>;
  /**
   * A list of version groups where this region can be visited.
   */
  readonly version_groups: Array<VersionGroupSummary>;
}

