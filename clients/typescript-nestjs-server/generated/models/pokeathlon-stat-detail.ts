import { PokeathlonStatDetailAffectingNatures } from './pokeathlon-stat-detail-affecting-natures';
import { PokeathlonStatName } from './pokeathlon-stat-name';


export interface PokeathlonStatDetail { 
  readonly id: number;
  name: string;
  affecting_natures: PokeathlonStatDetailAffectingNatures;
  readonly names: Array<PokeathlonStatName>;
}

