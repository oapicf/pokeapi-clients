import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { LocationApi } from '../api';
import { LocationAreaDetail, LocationDetail, PaginatedLocationAreaSummaryList, PaginatedLocationSummaryList, PaginatedPalParkAreaSummaryList, PaginatedRegionSummaryList, PalParkAreaDetail, RegionDetail,  } from '../models';

@Controller()
export class LocationApiController {
  constructor(private readonly locationApi: LocationApi) {}

  @Get('/api/v2/location-area/')
  locationAreaList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Req() request: Request): PaginatedLocationAreaSummaryList | Promise<PaginatedLocationAreaSummaryList> | Observable<PaginatedLocationAreaSummaryList> {
    return this.locationApi.locationAreaList(limit, offset, request);
  }

  @Get('/api/v2/location-area/:id/')
  locationAreaRetrieve(@Param('id') id: number, @Req() request: Request): LocationAreaDetail | Promise<LocationAreaDetail> | Observable<LocationAreaDetail> {
    return this.locationApi.locationAreaRetrieve(id, request);
  }

  @Get('/api/v2/location/')
  locationList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedLocationSummaryList | Promise<PaginatedLocationSummaryList> | Observable<PaginatedLocationSummaryList> {
    return this.locationApi.locationList(limit, offset, q, request);
  }

  @Get('/api/v2/location/:id/')
  locationRetrieve(@Param('id') id: string, @Req() request: Request): LocationDetail | Promise<LocationDetail> | Observable<LocationDetail> {
    return this.locationApi.locationRetrieve(id, request);
  }

  @Get('/api/v2/pal-park-area/')
  palParkAreaList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedPalParkAreaSummaryList | Promise<PaginatedPalParkAreaSummaryList> | Observable<PaginatedPalParkAreaSummaryList> {
    return this.locationApi.palParkAreaList(limit, offset, q, request);
  }

  @Get('/api/v2/pal-park-area/:id/')
  palParkAreaRetrieve(@Param('id') id: string, @Req() request: Request): PalParkAreaDetail | Promise<PalParkAreaDetail> | Observable<PalParkAreaDetail> {
    return this.locationApi.palParkAreaRetrieve(id, request);
  }

  @Get('/api/v2/region/')
  regionList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedRegionSummaryList | Promise<PaginatedRegionSummaryList> | Observable<PaginatedRegionSummaryList> {
    return this.locationApi.regionList(limit, offset, q, request);
  }

  @Get('/api/v2/region/:id/')
  regionRetrieve(@Param('id') id: string, @Req() request: Request): RegionDetail | Promise<RegionDetail> | Observable<RegionDetail> {
    return this.locationApi.regionRetrieve(id, request);
  }

} 