import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { MachineDetail, PaginatedMachineSummaryList,  } from '../models';


@Injectable()
export abstract class MachinesApi {

  abstract machineList(limit: number | undefined, offset: number | undefined, q: string | undefined,  request: Request): PaginatedMachineSummaryList | Promise<PaginatedMachineSummaryList> | Observable<PaginatedMachineSummaryList>;


  abstract machineRetrieve(id: string,  request: Request): MachineDetail | Promise<MachineDetail> | Observable<MachineDetail>;

} 