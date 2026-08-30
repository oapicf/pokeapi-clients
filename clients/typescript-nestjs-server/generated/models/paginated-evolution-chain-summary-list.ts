import { EvolutionChainSummary } from './evolution-chain-summary';


export interface PaginatedEvolutionChainSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<EvolutionChainSummary>;
}

