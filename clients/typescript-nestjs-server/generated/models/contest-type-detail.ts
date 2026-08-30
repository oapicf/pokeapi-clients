import { BerryFlavorSummary } from './berry-flavor-summary';
import { ContestTypeName } from './contest-type-name';


export interface ContestTypeDetail { 
  readonly id: number;
  name: string;
  readonly berry_flavor: BerryFlavorSummary;
  readonly names: Array<ContestTypeName>;
}

