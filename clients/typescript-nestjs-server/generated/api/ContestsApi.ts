import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { ContestEffectDetail, ContestTypeDetail, PaginatedContestEffectSummaryList, PaginatedContestTypeSummaryList, PaginatedSuperContestEffectSummaryList, SuperContestEffectDetail,  } from '../models';


@Injectable()
export abstract class ContestsApi {

  abstract contestEffectList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedContestEffectSummaryList | Promise<PaginatedContestEffectSummaryList> | Observable<PaginatedContestEffectSummaryList>;


  abstract contestEffectRetrieve(id: string,  request: Request): ContestEffectDetail | Promise<ContestEffectDetail> | Observable<ContestEffectDetail>;


  abstract contestTypeList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedContestTypeSummaryList | Promise<PaginatedContestTypeSummaryList> | Observable<PaginatedContestTypeSummaryList>;


  abstract contestTypeRetrieve(id: string,  request: Request): ContestTypeDetail | Promise<ContestTypeDetail> | Observable<ContestTypeDetail>;


  abstract superContestEffectList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedSuperContestEffectSummaryList | Promise<PaginatedSuperContestEffectSummaryList> | Observable<PaginatedSuperContestEffectSummaryList>;


  abstract superContestEffectRetrieve(id: string,  request: Request): SuperContestEffectDetail | Promise<SuperContestEffectDetail> | Observable<SuperContestEffectDetail>;

} 