import { EncounterMethodName } from './encounter-method-name';


export interface EncounterMethodDetail { 
  readonly id: number;
  name: string;
  order?: number | null;
  readonly names: Array<EncounterMethodName>;
}

