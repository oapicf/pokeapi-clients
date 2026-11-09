import { PokedexName } from './pokedex-name';
import { PokedexDescription } from './pokedex-description';
import { VersionGroupSummary } from './version-group-summary';
import { PokemonDexNumber } from './pokemon-dex-number';
import { RegionSummary } from './region-summary';


export interface PokedexDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * Whether or not this Pokédex originated in the main series of the video games.
   */
  is_main_series?: boolean;
  /**
   * The description of this resource listed in different languages.
   */
  readonly descriptions: Array<PokedexDescription>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<PokedexName>;
  /**
   * A list of Pokémon catalogued in this Pokédex and their indexes.
   */
  readonly pokemon_entries: Array<PokemonDexNumber>;
  /**
   * The region this Pokédex catalogues Pokémon for.
   */
  region: RegionSummary | null;
  /**
   * A list of version groups this Pokédex is relevant to.
   */
  readonly version_groups: Array<VersionGroupSummary>;
}

