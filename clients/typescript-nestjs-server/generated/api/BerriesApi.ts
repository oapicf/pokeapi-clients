import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { BerryDetail, BerryFirmnessDetail, BerryFlavorDetail, PaginatedBerryFirmnessSummaryList, PaginatedBerryFlavorSummaryList, PaginatedBerrySummaryList,  } from '../models';


@Injectable()
export abstract class BerriesApi {

  abstract berryFirmnessList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedBerryFirmnessSummaryList | Promise<PaginatedBerryFirmnessSummaryList> | Observable<PaginatedBerryFirmnessSummaryList>;


  abstract berryFirmnessRetrieve(id: string,  request: Request): BerryFirmnessDetail | Promise<BerryFirmnessDetail> | Observable<BerryFirmnessDetail>;


  abstract berryFlavorList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedBerryFlavorSummaryList | Promise<PaginatedBerryFlavorSummaryList> | Observable<PaginatedBerryFlavorSummaryList>;


  abstract berryFlavorRetrieve(id: string,  request: Request): BerryFlavorDetail | Promise<BerryFlavorDetail> | Observable<BerryFlavorDetail>;


  abstract berryList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedBerrySummaryList | Promise<PaginatedBerrySummaryList> | Observable<PaginatedBerrySummaryList>;


  abstract berryRetrieve(id: string,  request: Request): BerryDetail | Promise<BerryDetail> | Observable<BerryDetail>;

} 