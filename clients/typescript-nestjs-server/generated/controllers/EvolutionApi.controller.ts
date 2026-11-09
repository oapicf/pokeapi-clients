import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { EvolutionApi } from '../api';
import { EvolutionChainDetail, EvolutionTriggerDetail, EvolutionVariableDetail, PaginatedEvolutionChainSummaryList, PaginatedEvolutionTriggerSummaryList, PaginatedEvolutionVariableSummaryList,  } from '../models';

@Controller()
export class EvolutionApiController {
  constructor(private readonly evolutionApi: EvolutionApi) {}

  @Get('/api/v2/evolution-chain/')
  evolutionChainList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Req() request: Request): PaginatedEvolutionChainSummaryList | Promise<PaginatedEvolutionChainSummaryList> | Observable<PaginatedEvolutionChainSummaryList> {
    return this.evolutionApi.evolutionChainList(limit, offset, request);
  }

  @Get('/api/v2/evolution-chain/:id/')
  evolutionChainRetrieve(@Param('id') id: string, @Req() request: Request): EvolutionChainDetail | Promise<EvolutionChainDetail> | Observable<EvolutionChainDetail> {
    return this.evolutionApi.evolutionChainRetrieve(id, request);
  }

  @Get('/api/v2/evolution-trigger/')
  evolutionTriggerList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedEvolutionTriggerSummaryList | Promise<PaginatedEvolutionTriggerSummaryList> | Observable<PaginatedEvolutionTriggerSummaryList> {
    return this.evolutionApi.evolutionTriggerList(limit, offset, q, request);
  }

  @Get('/api/v2/evolution-trigger/:id/')
  evolutionTriggerRetrieve(@Param('id') id: string, @Req() request: Request): EvolutionTriggerDetail | Promise<EvolutionTriggerDetail> | Observable<EvolutionTriggerDetail> {
    return this.evolutionApi.evolutionTriggerRetrieve(id, request);
  }

  @Get('/api/v2/evolution-variable/')
  evolutionVariableList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedEvolutionVariableSummaryList | Promise<PaginatedEvolutionVariableSummaryList> | Observable<PaginatedEvolutionVariableSummaryList> {
    return this.evolutionApi.evolutionVariableList(limit, offset, q, request);
  }

  @Get('/api/v2/evolution-variable/:id/')
  evolutionVariableRetrieve(@Param('id') id: string, @Req() request: Request): EvolutionVariableDetail | Promise<EvolutionVariableDetail> | Observable<EvolutionVariableDetail> {
    return this.evolutionApi.evolutionVariableRetrieve(id, request);
  }

} 