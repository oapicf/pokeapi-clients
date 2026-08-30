import { PokemonColorName } from './pokemon-color-name';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PokemonColorDetail { 
  readonly id: number;
  name: string;
  readonly names: Array<PokemonColorName>;
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

