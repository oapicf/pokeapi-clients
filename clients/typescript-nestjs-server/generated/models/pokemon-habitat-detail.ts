import { PokemonHabitatName } from './pokemon-habitat-name';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PokemonHabitatDetail { 
  readonly id: number;
  name: string;
  readonly names: Array<PokemonHabitatName>;
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

