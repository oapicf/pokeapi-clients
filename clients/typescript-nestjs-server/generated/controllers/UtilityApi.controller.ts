import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { UtilityApi } from '../api';
import { LanguageDetail, PaginatedLanguageSummaryList,  } from '../models';

@Controller()
export class UtilityApiController {
  constructor(private readonly utilityApi: UtilityApi) {}

  @Get('/api/v2/language/')
  languageList(@Query('limit') limit: number | undefined, @Query('offset') offset: number | undefined, @Query('q') q: string | undefined, @Req() request: Request): PaginatedLanguageSummaryList | Promise<PaginatedLanguageSummaryList> | Observable<PaginatedLanguageSummaryList> {
    return this.utilityApi.languageList(limit, offset, q, request);
  }

  @Get('/api/v2/language/:id/')
  languageRetrieve(@Param('id') id: string, @Req() request: Request): LanguageDetail | Promise<LanguageDetail> | Observable<LanguageDetail> {
    return this.utilityApi.languageRetrieve(id, request);
  }

} 