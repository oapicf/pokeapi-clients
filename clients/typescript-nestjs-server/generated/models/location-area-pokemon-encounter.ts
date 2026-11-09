import { LocationAreaPokemonEncounterVersion } from './location-area-pokemon-encounter-version';
import { PokemonSummary } from './pokemon-summary';


export interface LocationAreaPokemonEncounter { 
  /**
   * The Pokémon being encountered.
   */
  pokemon: PokemonSummary;
  /**
   * A list of versions and encounters with Pokémon that might happen in the referenced location area.
   */
  version_details: Array<LocationAreaPokemonEncounterVersion>;
}

