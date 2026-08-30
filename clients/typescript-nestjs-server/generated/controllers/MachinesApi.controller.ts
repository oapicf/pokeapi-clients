import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { MachinesApi } from '../api';
import { MachineDetail, PaginatedMachineSummaryList,  } from '../models';

@Controller()
export class MachinesApiController {
  constructor(private readonly machinesApi: MachinesApi) {}

  @Get('/api/v2/machine/')
  machineList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedMachineSummaryList | Promise<PaginatedMachineSummaryList> | Observable<PaginatedMachineSummaryList> {
    return this.machinesApi.machineList(limit, offset, q, request);
  }

  @Get('/api/v2/machine/:id/')
  machineRetrieve(@Param('id') id: string, @Req() request: Request): MachineDetail | Promise<MachineDetail> | Observable<MachineDetail> {
    return this.machinesApi.machineRetrieve(id, request);
  }

} 