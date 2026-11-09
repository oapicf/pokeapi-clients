import { LocationAreaName } from './location-area-name';
import { LocationAreaPokemonEncounter } from './location-area-pokemon-encounter';
import { LocationSummary } from './location-summary';
import { LocationAreaEncounterRate } from './location-area-encounter-rate';


export interface LocationAreaDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The internal id of an API resource within game data.
   */
  game_index: number;
  /**
   * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
   */
  readonly encounter_method_rates: Array<LocationAreaEncounterRate>;
  /**
   * The region this location area can be found in.
   */
  location: LocationSummary;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<LocationAreaName>;
  /**
   * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
   */
  readonly pokemon_encounters: Array<LocationAreaPokemonEncounter>;
}

