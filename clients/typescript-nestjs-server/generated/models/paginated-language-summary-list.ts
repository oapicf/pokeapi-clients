import { LanguageSummary } from './language-summary';


export interface PaginatedLanguageSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<LanguageSummary>;
}

