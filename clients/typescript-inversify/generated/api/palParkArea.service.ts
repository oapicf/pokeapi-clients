/**
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';


import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class PalParkAreaService {
    private basePath: string = 'https://pokeapi.co';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     *
     *
     * @param limit
     * @param offset

     */
    public palParkAreaList(limit?: number, offset?: number, observe?: 'body', headers?: Headers): Observable<string>;
    public palParkAreaList(limit?: number, offset?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public palParkAreaList(limit?: number, offset?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (limit !== undefined) {
            queryParameters.push('limit='+encodeURIComponent(String(limit)));
        }
        if (offset !== undefined) {
            queryParameters.push('offset='+encodeURIComponent(String(offset)));
        }

        headers['Accept'] = 'text/plain';

        const response: Observable<HttpResponse<string>> = this.httpClient.get(`${this.basePath}/api/v2/pal-park-area/?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <string>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     *
     *
     * @param id

     */
    public palParkAreaRead(id: number, observe?: 'body', headers?: Headers): Observable<string>;
    public palParkAreaRead(id: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public palParkAreaRead(id: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (id === null || id === undefined){
            throw new Error('Required parameter id was null or undefined when calling palParkAreaRead.');
        }

        headers['Accept'] = 'text/plain';

        const response: Observable<HttpResponse<string>> = this.httpClient.get(`${this.basePath}/api/v2/pal-park-area/${encodeURIComponent(String(id))}/`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <string>(httpResponse.response))
               );
        }
        return response;
    }

}
