import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { BerriesApi } from '../api';
import { BerryDetail, BerryFirmnessDetail, BerryFlavorDetail, PaginatedBerryFirmnessSummaryList, PaginatedBerryFlavorSummaryList, PaginatedBerrySummaryList,  } from '../models';

@Controller()
export class BerriesApiController {
  constructor(private readonly berriesApi: BerriesApi) {}

  @Get('/api/v2/berry-firmness/')
  berryFirmnessList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedBerryFirmnessSummaryList | Promise<PaginatedBerryFirmnessSummaryList> | Observable<PaginatedBerryFirmnessSummaryList> {
    return this.berriesApi.berryFirmnessList(limit, offset, q, request);
  }

  @Get('/api/v2/berry-firmness/:id/')
  berryFirmnessRetrieve(@Param('id') id: string, @Req() request: Request): BerryFirmnessDetail | Promise<BerryFirmnessDetail> | Observable<BerryFirmnessDetail> {
    return this.berriesApi.berryFirmnessRetrieve(id, request);
  }

  @Get('/api/v2/berry-flavor/')
  berryFlavorList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedBerryFlavorSummaryList | Promise<PaginatedBerryFlavorSummaryList> | Observable<PaginatedBerryFlavorSummaryList> {
    return this.berriesApi.berryFlavorList(limit, offset, q, request);
  }

  @Get('/api/v2/berry-flavor/:id/')
  berryFlavorRetrieve(@Param('id') id: string, @Req() request: Request): BerryFlavorDetail | Promise<BerryFlavorDetail> | Observable<BerryFlavorDetail> {
    return this.berriesApi.berryFlavorRetrieve(id, request);
  }

  @Get('/api/v2/berry/')
  berryList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedBerrySummaryList | Promise<PaginatedBerrySummaryList> | Observable<PaginatedBerrySummaryList> {
    return this.berriesApi.berryList(limit, offset, q, request);
  }

  @Get('/api/v2/berry/:id/')
  berryRetrieve(@Param('id') id: string, @Req() request: Request): BerryDetail | Promise<BerryDetail> | Observable<BerryDetail> {
    return this.berriesApi.berryRetrieve(id, request);
  }

} 