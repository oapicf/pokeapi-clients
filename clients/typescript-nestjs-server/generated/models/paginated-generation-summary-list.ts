import { GenerationSummary } from './generation-summary';


export interface PaginatedGenerationSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<GenerationSummary>;
}

