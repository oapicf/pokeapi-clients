import { PokemonHabitatSummary } from './pokemon-habitat-summary';


export interface PaginatedPokemonHabitatSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PokemonHabitatSummary>;
}

