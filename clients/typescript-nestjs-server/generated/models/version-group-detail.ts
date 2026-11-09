import { GenerationSummary } from './generation-summary';
import { VersionSummary } from './version-summary';
import { MoveLearnMethodSummary } from './move-learn-method-summary';
import { RegionSummary } from './region-summary';
import { PokedexSummary } from './pokedex-summary';


export interface VersionGroupDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * Order for sorting. Almost by date of release, except similar versions are grouped together.
   */
  order?: number | null;
  /**
   * The generation this version was introduced in.
   */
  generation: GenerationSummary;
  /**
   * A list of methods in which Pokémon can learn moves in this version group.
   */
  readonly move_learn_methods: Array<MoveLearnMethodSummary>;
  /**
   * A list of Pokédexes introduces in this version group.
   */
  readonly pokedexes: Array<PokedexSummary>;
  /**
   * A list of regions that can be visited in this version group.
   */
  readonly regions: Array<RegionSummary>;
  /**
   * The versions this version group owns.
   */
  readonly versions: Array<VersionSummary>;
}

