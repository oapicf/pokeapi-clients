import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { EncountersApi } from '../api';
import { EncounterConditionDetail, EncounterConditionValueDetail, EncounterMethodDetail, PaginatedEncounterConditionSummaryList, PaginatedEncounterConditionValueSummaryList, PaginatedEncounterMethodSummaryList,  } from '../models';

@Controller()
export class EncountersApiController {
  constructor(private readonly encountersApi: EncountersApi) {}

  @Get('/api/v2/encounter-condition/')
  encounterConditionList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedEncounterConditionSummaryList | Promise<PaginatedEncounterConditionSummaryList> | Observable<PaginatedEncounterConditionSummaryList> {
    return this.encountersApi.encounterConditionList(limit, offset, q, request);
  }

  @Get('/api/v2/encounter-condition/:id/')
  encounterConditionRetrieve(@Param('id') id: string, @Req() request: Request): EncounterConditionDetail | Promise<EncounterConditionDetail> | Observable<EncounterConditionDetail> {
    return this.encountersApi.encounterConditionRetrieve(id, request);
  }

  @Get('/api/v2/encounter-condition-value/')
  encounterConditionValueList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedEncounterConditionValueSummaryList | Promise<PaginatedEncounterConditionValueSummaryList> | Observable<PaginatedEncounterConditionValueSummaryList> {
    return this.encountersApi.encounterConditionValueList(limit, offset, q, request);
  }

  @Get('/api/v2/encounter-condition-value/:id/')
  encounterConditionValueRetrieve(@Param('id') id: string, @Req() request: Request): EncounterConditionValueDetail | Promise<EncounterConditionValueDetail> | Observable<EncounterConditionValueDetail> {
    return this.encountersApi.encounterConditionValueRetrieve(id, request);
  }

  @Get('/api/v2/encounter-method/')
  encounterMethodList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedEncounterMethodSummaryList | Promise<PaginatedEncounterMethodSummaryList> | Observable<PaginatedEncounterMethodSummaryList> {
    return this.encountersApi.encounterMethodList(limit, offset, q, request);
  }

  @Get('/api/v2/encounter-method/:id/')
  encounterMethodRetrieve(@Param('id') id: string, @Req() request: Request): EncounterMethodDetail | Promise<EncounterMethodDetail> | Observable<EncounterMethodDetail> {
    return this.encountersApi.encounterMethodRetrieve(id, request);
  }

} 