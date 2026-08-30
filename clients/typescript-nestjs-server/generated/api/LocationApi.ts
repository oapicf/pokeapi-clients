import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { LocationAreaDetail, LocationDetail, PaginatedLocationAreaSummaryList, PaginatedLocationSummaryList, PaginatedPalParkAreaSummaryList, PaginatedRegionSummaryList, PalParkAreaDetail, RegionDetail,  } from '../models';


@Injectable()
export abstract class LocationApi {

  abstract locationAreaList(limit: number | undefined, offset: number | undefined,  request: Request): PaginatedLocationAreaSummaryList | Promise<PaginatedLocationAreaSummaryList> | Observable<PaginatedLocationAreaSummaryList>;


  abstract locationAreaRetrieve(id: number,  request: Request): LocationAreaDetail | Promise<LocationAreaDetail> | Observable<LocationAreaDetail>;


  abstract locationList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedLocationSummaryList | Promise<PaginatedLocationSummaryList> | Observable<PaginatedLocationSummaryList>;


  abstract locationRetrieve(id: string,  request: Request): LocationDetail | Promise<LocationDetail> | Observable<LocationDetail>;


  abstract palParkAreaList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedPalParkAreaSummaryList | Promise<PaginatedPalParkAreaSummaryList> | Observable<PaginatedPalParkAreaSummaryList>;


  abstract palParkAreaRetrieve(id: string,  request: Request): PalParkAreaDetail | Promise<PalParkAreaDetail> | Observable<PalParkAreaDetail>;


  abstract regionList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedRegionSummaryList | Promise<PaginatedRegionSummaryList> | Observable<PaginatedRegionSummaryList>;


  abstract regionRetrieve(id: string,  request: Request): RegionDetail | Promise<RegionDetail> | Observable<RegionDetail>;

} 