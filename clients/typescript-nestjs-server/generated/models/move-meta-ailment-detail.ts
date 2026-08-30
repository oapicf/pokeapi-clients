import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { MoveMetaAilmentName } from './move-meta-ailment-name';


export interface MoveMetaAilmentDetail { 
  readonly id: number;
  name: string;
  readonly moves: Array<AbilityDetailPokemonInnerPokemon>;
  readonly names: Array<MoveMetaAilmentName>;
}

