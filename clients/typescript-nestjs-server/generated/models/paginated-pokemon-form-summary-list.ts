import { PokemonFormSummary } from './pokemon-form-summary';


export interface PaginatedPokemonFormSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PokemonFormSummary>;
}

