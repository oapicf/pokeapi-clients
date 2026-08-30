import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { EvolutionChainDetail, EvolutionTriggerDetail, PaginatedEvolutionChainSummaryList, PaginatedEvolutionTriggerSummaryList,  } from '../models';


@Injectable()
export abstract class EvolutionApi {

  abstract evolutionChainList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedEvolutionChainSummaryList | Promise<PaginatedEvolutionChainSummaryList> | Observable<PaginatedEvolutionChainSummaryList>;


  abstract evolutionChainRetrieve(id: string,  request: Request): EvolutionChainDetail | Promise<EvolutionChainDetail> | Observable<EvolutionChainDetail>;


  abstract evolutionTriggerList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedEvolutionTriggerSummaryList | Promise<PaginatedEvolutionTriggerSummaryList> | Observable<PaginatedEvolutionTriggerSummaryList>;


  abstract evolutionTriggerRetrieve(id: string,  request: Request): EvolutionTriggerDetail | Promise<EvolutionTriggerDetail> | Observable<EvolutionTriggerDetail>;

} 