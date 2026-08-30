import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { EvolutionApi } from '../api';
import { EvolutionChainDetail, EvolutionTriggerDetail, PaginatedEvolutionChainSummaryList, PaginatedEvolutionTriggerSummaryList,  } from '../models';

@Controller()
export class EvolutionApiController {
  constructor(private readonly evolutionApi: EvolutionApi) {}

  @Get('/api/v2/evolution-chain/')
  evolutionChainList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedEvolutionChainSummaryList | Promise<PaginatedEvolutionChainSummaryList> | Observable<PaginatedEvolutionChainSummaryList> {
    return this.evolutionApi.evolutionChainList(limit, offset, q, request);
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

} 