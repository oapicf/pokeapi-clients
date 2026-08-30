import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { EncounterConditionDetail, EncounterConditionValueDetail, EncounterMethodDetail, PaginatedEncounterConditionSummaryList, PaginatedEncounterConditionValueSummaryList, PaginatedEncounterMethodSummaryList,  } from '../models';


@Injectable()
export abstract class EncountersApi {

  abstract encounterConditionList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedEncounterConditionSummaryList | Promise<PaginatedEncounterConditionSummaryList> | Observable<PaginatedEncounterConditionSummaryList>;


  abstract encounterConditionRetrieve(id: string,  request: Request): EncounterConditionDetail | Promise<EncounterConditionDetail> | Observable<EncounterConditionDetail>;


  abstract encounterConditionValueList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedEncounterConditionValueSummaryList | Promise<PaginatedEncounterConditionValueSummaryList> | Observable<PaginatedEncounterConditionValueSummaryList>;


  abstract encounterConditionValueRetrieve(id: string,  request: Request): EncounterConditionValueDetail | Promise<EncounterConditionValueDetail> | Observable<EncounterConditionValueDetail>;


  abstract encounterMethodList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedEncounterMethodSummaryList | Promise<PaginatedEncounterMethodSummaryList> | Observable<PaginatedEncounterMethodSummaryList>;


  abstract encounterMethodRetrieve(id: string,  request: Request): EncounterMethodDetail | Promise<EncounterMethodDetail> | Observable<EncounterMethodDetail>;

} 