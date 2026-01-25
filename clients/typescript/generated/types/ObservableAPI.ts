import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions, mergeConfiguration } from '../configuration'
import type { Middleware } from '../middleware';
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';

import { AbilityApiRequestFactory, AbilityApiResponseProcessor} from "../apis/AbilityApi";
export class ObservableAbilityApi {
    private requestFactory: AbilityApiRequestFactory;
    private responseProcessor: AbilityApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AbilityApiRequestFactory,
        responseProcessor?: AbilityApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AbilityApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AbilityApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public abilityListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.abilityList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.abilityListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public abilityList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.abilityListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public abilityReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.abilityRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.abilityReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public abilityRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.abilityReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { BerryApiRequestFactory, BerryApiResponseProcessor} from "../apis/BerryApi";
export class ObservableBerryApi {
    private requestFactory: BerryApiRequestFactory;
    private responseProcessor: BerryApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: BerryApiRequestFactory,
        responseProcessor?: BerryApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new BerryApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new BerryApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public berryListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public berryList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.berryListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public berryReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public berryRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.berryReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { BerryFirmnessApiRequestFactory, BerryFirmnessApiResponseProcessor} from "../apis/BerryFirmnessApi";
export class ObservableBerryFirmnessApi {
    private requestFactory: BerryFirmnessApiRequestFactory;
    private responseProcessor: BerryFirmnessApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: BerryFirmnessApiRequestFactory,
        responseProcessor?: BerryFirmnessApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new BerryFirmnessApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new BerryFirmnessApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public berryFirmnessListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryFirmnessList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryFirmnessListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public berryFirmnessList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.berryFirmnessListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public berryFirmnessReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryFirmnessRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryFirmnessReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public berryFirmnessRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.berryFirmnessReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { BerryFlavorApiRequestFactory, BerryFlavorApiResponseProcessor} from "../apis/BerryFlavorApi";
export class ObservableBerryFlavorApi {
    private requestFactory: BerryFlavorApiRequestFactory;
    private responseProcessor: BerryFlavorApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: BerryFlavorApiRequestFactory,
        responseProcessor?: BerryFlavorApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new BerryFlavorApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new BerryFlavorApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public berryFlavorListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryFlavorList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryFlavorListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public berryFlavorList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.berryFlavorListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public berryFlavorReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryFlavorRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryFlavorReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public berryFlavorRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.berryFlavorReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { CharacteristicApiRequestFactory, CharacteristicApiResponseProcessor} from "../apis/CharacteristicApi";
export class ObservableCharacteristicApi {
    private requestFactory: CharacteristicApiRequestFactory;
    private responseProcessor: CharacteristicApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CharacteristicApiRequestFactory,
        responseProcessor?: CharacteristicApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CharacteristicApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CharacteristicApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public characteristicListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.characteristicList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.characteristicListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public characteristicList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.characteristicListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public characteristicReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.characteristicRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.characteristicReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public characteristicRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.characteristicReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { ContestEffectApiRequestFactory, ContestEffectApiResponseProcessor} from "../apis/ContestEffectApi";
export class ObservableContestEffectApi {
    private requestFactory: ContestEffectApiRequestFactory;
    private responseProcessor: ContestEffectApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ContestEffectApiRequestFactory,
        responseProcessor?: ContestEffectApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ContestEffectApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ContestEffectApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public contestEffectListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.contestEffectList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.contestEffectListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public contestEffectList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.contestEffectListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public contestEffectReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.contestEffectRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.contestEffectReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public contestEffectRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.contestEffectReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { ContestTypeApiRequestFactory, ContestTypeApiResponseProcessor} from "../apis/ContestTypeApi";
export class ObservableContestTypeApi {
    private requestFactory: ContestTypeApiRequestFactory;
    private responseProcessor: ContestTypeApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ContestTypeApiRequestFactory,
        responseProcessor?: ContestTypeApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ContestTypeApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ContestTypeApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public contestTypeListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.contestTypeList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.contestTypeListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public contestTypeList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.contestTypeListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public contestTypeReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.contestTypeRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.contestTypeReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public contestTypeRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.contestTypeReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { EggGroupApiRequestFactory, EggGroupApiResponseProcessor} from "../apis/EggGroupApi";
export class ObservableEggGroupApi {
    private requestFactory: EggGroupApiRequestFactory;
    private responseProcessor: EggGroupApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EggGroupApiRequestFactory,
        responseProcessor?: EggGroupApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EggGroupApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EggGroupApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public eggGroupListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.eggGroupList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.eggGroupListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public eggGroupList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.eggGroupListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public eggGroupReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.eggGroupRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.eggGroupReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public eggGroupRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.eggGroupReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { EncounterConditionApiRequestFactory, EncounterConditionApiResponseProcessor} from "../apis/EncounterConditionApi";
export class ObservableEncounterConditionApi {
    private requestFactory: EncounterConditionApiRequestFactory;
    private responseProcessor: EncounterConditionApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EncounterConditionApiRequestFactory,
        responseProcessor?: EncounterConditionApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EncounterConditionApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EncounterConditionApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public encounterConditionListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterConditionList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterConditionListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public encounterConditionList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.encounterConditionListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public encounterConditionReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterConditionRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterConditionReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public encounterConditionRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.encounterConditionReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { EncounterConditionValueApiRequestFactory, EncounterConditionValueApiResponseProcessor} from "../apis/EncounterConditionValueApi";
export class ObservableEncounterConditionValueApi {
    private requestFactory: EncounterConditionValueApiRequestFactory;
    private responseProcessor: EncounterConditionValueApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EncounterConditionValueApiRequestFactory,
        responseProcessor?: EncounterConditionValueApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EncounterConditionValueApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EncounterConditionValueApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public encounterConditionValueListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterConditionValueList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterConditionValueListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public encounterConditionValueList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.encounterConditionValueListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public encounterConditionValueReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterConditionValueRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterConditionValueReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public encounterConditionValueRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.encounterConditionValueReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { EncounterMethodApiRequestFactory, EncounterMethodApiResponseProcessor} from "../apis/EncounterMethodApi";
export class ObservableEncounterMethodApi {
    private requestFactory: EncounterMethodApiRequestFactory;
    private responseProcessor: EncounterMethodApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EncounterMethodApiRequestFactory,
        responseProcessor?: EncounterMethodApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EncounterMethodApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EncounterMethodApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public encounterMethodListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterMethodList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterMethodListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public encounterMethodList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.encounterMethodListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public encounterMethodReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterMethodRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterMethodReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public encounterMethodRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.encounterMethodReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { EvolutionChainApiRequestFactory, EvolutionChainApiResponseProcessor} from "../apis/EvolutionChainApi";
export class ObservableEvolutionChainApi {
    private requestFactory: EvolutionChainApiRequestFactory;
    private responseProcessor: EvolutionChainApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EvolutionChainApiRequestFactory,
        responseProcessor?: EvolutionChainApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EvolutionChainApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EvolutionChainApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public evolutionChainListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.evolutionChainList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.evolutionChainListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public evolutionChainList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.evolutionChainListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public evolutionChainReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.evolutionChainRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.evolutionChainReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public evolutionChainRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.evolutionChainReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { EvolutionTriggerApiRequestFactory, EvolutionTriggerApiResponseProcessor} from "../apis/EvolutionTriggerApi";
export class ObservableEvolutionTriggerApi {
    private requestFactory: EvolutionTriggerApiRequestFactory;
    private responseProcessor: EvolutionTriggerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EvolutionTriggerApiRequestFactory,
        responseProcessor?: EvolutionTriggerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EvolutionTriggerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EvolutionTriggerApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public evolutionTriggerListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.evolutionTriggerList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.evolutionTriggerListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public evolutionTriggerList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.evolutionTriggerListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public evolutionTriggerReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.evolutionTriggerRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.evolutionTriggerReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public evolutionTriggerRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.evolutionTriggerReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { GenderApiRequestFactory, GenderApiResponseProcessor} from "../apis/GenderApi";
export class ObservableGenderApi {
    private requestFactory: GenderApiRequestFactory;
    private responseProcessor: GenderApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: GenderApiRequestFactory,
        responseProcessor?: GenderApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new GenderApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new GenderApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public genderListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.genderList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.genderListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public genderList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.genderListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public genderReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.genderRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.genderReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public genderRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.genderReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { GenerationApiRequestFactory, GenerationApiResponseProcessor} from "../apis/GenerationApi";
export class ObservableGenerationApi {
    private requestFactory: GenerationApiRequestFactory;
    private responseProcessor: GenerationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: GenerationApiRequestFactory,
        responseProcessor?: GenerationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new GenerationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new GenerationApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public generationListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.generationList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.generationListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public generationList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.generationListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public generationReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.generationRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.generationReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public generationRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.generationReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { GrowthRateApiRequestFactory, GrowthRateApiResponseProcessor} from "../apis/GrowthRateApi";
export class ObservableGrowthRateApi {
    private requestFactory: GrowthRateApiRequestFactory;
    private responseProcessor: GrowthRateApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: GrowthRateApiRequestFactory,
        responseProcessor?: GrowthRateApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new GrowthRateApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new GrowthRateApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public growthRateListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.growthRateList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.growthRateListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public growthRateList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.growthRateListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public growthRateReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.growthRateRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.growthRateReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public growthRateRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.growthRateReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { ItemApiRequestFactory, ItemApiResponseProcessor} from "../apis/ItemApi";
export class ObservableItemApi {
    private requestFactory: ItemApiRequestFactory;
    private responseProcessor: ItemApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemApiRequestFactory,
        responseProcessor?: ItemApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ItemApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ItemApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public itemReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public itemRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { ItemAttributeApiRequestFactory, ItemAttributeApiResponseProcessor} from "../apis/ItemAttributeApi";
export class ObservableItemAttributeApi {
    private requestFactory: ItemAttributeApiRequestFactory;
    private responseProcessor: ItemAttributeApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemAttributeApiRequestFactory,
        responseProcessor?: ItemAttributeApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ItemAttributeApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ItemAttributeApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemAttributeListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemAttributeList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemAttributeListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemAttributeList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemAttributeListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public itemAttributeReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemAttributeRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemAttributeReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public itemAttributeRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemAttributeReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { ItemCategoryApiRequestFactory, ItemCategoryApiResponseProcessor} from "../apis/ItemCategoryApi";
export class ObservableItemCategoryApi {
    private requestFactory: ItemCategoryApiRequestFactory;
    private responseProcessor: ItemCategoryApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemCategoryApiRequestFactory,
        responseProcessor?: ItemCategoryApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ItemCategoryApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ItemCategoryApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemCategoryListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemCategoryList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemCategoryListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemCategoryList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemCategoryListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public itemCategoryReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemCategoryRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemCategoryReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public itemCategoryRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemCategoryReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { ItemFlingEffectApiRequestFactory, ItemFlingEffectApiResponseProcessor} from "../apis/ItemFlingEffectApi";
export class ObservableItemFlingEffectApi {
    private requestFactory: ItemFlingEffectApiRequestFactory;
    private responseProcessor: ItemFlingEffectApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemFlingEffectApiRequestFactory,
        responseProcessor?: ItemFlingEffectApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ItemFlingEffectApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ItemFlingEffectApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemFlingEffectListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemFlingEffectList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemFlingEffectListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemFlingEffectList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemFlingEffectListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public itemFlingEffectReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemFlingEffectRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemFlingEffectReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public itemFlingEffectRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemFlingEffectReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { ItemPocketApiRequestFactory, ItemPocketApiResponseProcessor} from "../apis/ItemPocketApi";
export class ObservableItemPocketApi {
    private requestFactory: ItemPocketApiRequestFactory;
    private responseProcessor: ItemPocketApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemPocketApiRequestFactory,
        responseProcessor?: ItemPocketApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ItemPocketApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ItemPocketApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemPocketListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemPocketList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemPocketListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public itemPocketList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemPocketListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public itemPocketReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemPocketRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemPocketReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public itemPocketRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.itemPocketReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { LanguageApiRequestFactory, LanguageApiResponseProcessor} from "../apis/LanguageApi";
export class ObservableLanguageApi {
    private requestFactory: LanguageApiRequestFactory;
    private responseProcessor: LanguageApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: LanguageApiRequestFactory,
        responseProcessor?: LanguageApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new LanguageApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new LanguageApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public languageListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.languageList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.languageListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public languageList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.languageListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public languageReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.languageRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.languageReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public languageRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.languageReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { LocationApiRequestFactory, LocationApiResponseProcessor} from "../apis/LocationApi";
export class ObservableLocationApi {
    private requestFactory: LocationApiRequestFactory;
    private responseProcessor: LocationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: LocationApiRequestFactory,
        responseProcessor?: LocationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new LocationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new LocationApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public locationListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.locationList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.locationListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public locationList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.locationListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public locationReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.locationRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.locationReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public locationRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.locationReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { LocationAreaApiRequestFactory, LocationAreaApiResponseProcessor} from "../apis/LocationAreaApi";
export class ObservableLocationAreaApi {
    private requestFactory: LocationAreaApiRequestFactory;
    private responseProcessor: LocationAreaApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: LocationAreaApiRequestFactory,
        responseProcessor?: LocationAreaApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new LocationAreaApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new LocationAreaApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public locationAreaListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.locationAreaList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.locationAreaListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public locationAreaList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.locationAreaListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public locationAreaReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.locationAreaRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.locationAreaReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public locationAreaRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.locationAreaReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { MachineApiRequestFactory, MachineApiResponseProcessor} from "../apis/MachineApi";
export class ObservableMachineApi {
    private requestFactory: MachineApiRequestFactory;
    private responseProcessor: MachineApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MachineApiRequestFactory,
        responseProcessor?: MachineApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MachineApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MachineApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public machineListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.machineList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.machineListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public machineList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.machineListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public machineReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.machineRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.machineReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public machineRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.machineReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { MoveApiRequestFactory, MoveApiResponseProcessor} from "../apis/MoveApi";
export class ObservableMoveApi {
    private requestFactory: MoveApiRequestFactory;
    private responseProcessor: MoveApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveApiRequestFactory,
        responseProcessor?: MoveApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MoveApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MoveApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public moveReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public moveRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { MoveAilmentApiRequestFactory, MoveAilmentApiResponseProcessor} from "../apis/MoveAilmentApi";
export class ObservableMoveAilmentApi {
    private requestFactory: MoveAilmentApiRequestFactory;
    private responseProcessor: MoveAilmentApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveAilmentApiRequestFactory,
        responseProcessor?: MoveAilmentApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MoveAilmentApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MoveAilmentApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveAilmentListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveAilmentList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveAilmentListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveAilmentList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveAilmentListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public moveAilmentReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveAilmentRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveAilmentReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public moveAilmentRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveAilmentReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { MoveBattleStyleApiRequestFactory, MoveBattleStyleApiResponseProcessor} from "../apis/MoveBattleStyleApi";
export class ObservableMoveBattleStyleApi {
    private requestFactory: MoveBattleStyleApiRequestFactory;
    private responseProcessor: MoveBattleStyleApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveBattleStyleApiRequestFactory,
        responseProcessor?: MoveBattleStyleApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MoveBattleStyleApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MoveBattleStyleApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveBattleStyleListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveBattleStyleList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveBattleStyleListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveBattleStyleList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveBattleStyleListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public moveBattleStyleReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveBattleStyleRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveBattleStyleReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public moveBattleStyleRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveBattleStyleReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { MoveCategoryApiRequestFactory, MoveCategoryApiResponseProcessor} from "../apis/MoveCategoryApi";
export class ObservableMoveCategoryApi {
    private requestFactory: MoveCategoryApiRequestFactory;
    private responseProcessor: MoveCategoryApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveCategoryApiRequestFactory,
        responseProcessor?: MoveCategoryApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MoveCategoryApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MoveCategoryApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveCategoryListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveCategoryList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveCategoryListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveCategoryList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveCategoryListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public moveCategoryReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveCategoryRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveCategoryReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public moveCategoryRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveCategoryReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { MoveDamageClassApiRequestFactory, MoveDamageClassApiResponseProcessor} from "../apis/MoveDamageClassApi";
export class ObservableMoveDamageClassApi {
    private requestFactory: MoveDamageClassApiRequestFactory;
    private responseProcessor: MoveDamageClassApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveDamageClassApiRequestFactory,
        responseProcessor?: MoveDamageClassApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MoveDamageClassApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MoveDamageClassApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveDamageClassListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveDamageClassList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveDamageClassListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveDamageClassList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveDamageClassListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public moveDamageClassReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveDamageClassRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveDamageClassReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public moveDamageClassRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveDamageClassReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { MoveLearnMethodApiRequestFactory, MoveLearnMethodApiResponseProcessor} from "../apis/MoveLearnMethodApi";
export class ObservableMoveLearnMethodApi {
    private requestFactory: MoveLearnMethodApiRequestFactory;
    private responseProcessor: MoveLearnMethodApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveLearnMethodApiRequestFactory,
        responseProcessor?: MoveLearnMethodApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MoveLearnMethodApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MoveLearnMethodApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveLearnMethodListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveLearnMethodList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveLearnMethodListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveLearnMethodList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveLearnMethodListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public moveLearnMethodReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveLearnMethodRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveLearnMethodReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public moveLearnMethodRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveLearnMethodReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { MoveTargetApiRequestFactory, MoveTargetApiResponseProcessor} from "../apis/MoveTargetApi";
export class ObservableMoveTargetApi {
    private requestFactory: MoveTargetApiRequestFactory;
    private responseProcessor: MoveTargetApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveTargetApiRequestFactory,
        responseProcessor?: MoveTargetApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MoveTargetApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MoveTargetApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveTargetListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveTargetList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveTargetListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public moveTargetList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveTargetListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public moveTargetReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveTargetRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveTargetReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public moveTargetRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.moveTargetReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { NatureApiRequestFactory, NatureApiResponseProcessor} from "../apis/NatureApi";
export class ObservableNatureApi {
    private requestFactory: NatureApiRequestFactory;
    private responseProcessor: NatureApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: NatureApiRequestFactory,
        responseProcessor?: NatureApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new NatureApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new NatureApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public natureListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.natureList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.natureListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public natureList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.natureListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public natureReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.natureRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.natureReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public natureRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.natureReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PalParkAreaApiRequestFactory, PalParkAreaApiResponseProcessor} from "../apis/PalParkAreaApi";
export class ObservablePalParkAreaApi {
    private requestFactory: PalParkAreaApiRequestFactory;
    private responseProcessor: PalParkAreaApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PalParkAreaApiRequestFactory,
        responseProcessor?: PalParkAreaApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PalParkAreaApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PalParkAreaApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public palParkAreaListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.palParkAreaList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.palParkAreaListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public palParkAreaList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.palParkAreaListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public palParkAreaReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.palParkAreaRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.palParkAreaReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public palParkAreaRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.palParkAreaReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PokeathlonStatApiRequestFactory, PokeathlonStatApiResponseProcessor} from "../apis/PokeathlonStatApi";
export class ObservablePokeathlonStatApi {
    private requestFactory: PokeathlonStatApiRequestFactory;
    private responseProcessor: PokeathlonStatApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokeathlonStatApiRequestFactory,
        responseProcessor?: PokeathlonStatApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokeathlonStatApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokeathlonStatApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokeathlonStatListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokeathlonStatList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokeathlonStatListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokeathlonStatList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokeathlonStatListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public pokeathlonStatReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokeathlonStatRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokeathlonStatReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public pokeathlonStatRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokeathlonStatReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PokedexApiRequestFactory, PokedexApiResponseProcessor} from "../apis/PokedexApi";
export class ObservablePokedexApi {
    private requestFactory: PokedexApiRequestFactory;
    private responseProcessor: PokedexApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokedexApiRequestFactory,
        responseProcessor?: PokedexApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokedexApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokedexApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokedexListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokedexList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokedexListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokedexList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokedexListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public pokedexReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokedexRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokedexReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public pokedexRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokedexReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PokemonApiRequestFactory, PokemonApiResponseProcessor} from "../apis/PokemonApi";
export class ObservablePokemonApi {
    private requestFactory: PokemonApiRequestFactory;
    private responseProcessor: PokemonApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonApiRequestFactory,
        responseProcessor?: PokemonApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokemonApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokemonApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public pokemonReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public pokemonRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PokemonColorApiRequestFactory, PokemonColorApiResponseProcessor} from "../apis/PokemonColorApi";
export class ObservablePokemonColorApi {
    private requestFactory: PokemonColorApiRequestFactory;
    private responseProcessor: PokemonColorApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonColorApiRequestFactory,
        responseProcessor?: PokemonColorApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokemonColorApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokemonColorApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonColorListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonColorList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonColorListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonColorList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonColorListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public pokemonColorReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonColorRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonColorReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public pokemonColorRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonColorReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PokemonFormApiRequestFactory, PokemonFormApiResponseProcessor} from "../apis/PokemonFormApi";
export class ObservablePokemonFormApi {
    private requestFactory: PokemonFormApiRequestFactory;
    private responseProcessor: PokemonFormApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonFormApiRequestFactory,
        responseProcessor?: PokemonFormApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokemonFormApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokemonFormApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonFormListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonFormList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonFormListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonFormList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonFormListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public pokemonFormReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonFormRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonFormReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public pokemonFormRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonFormReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PokemonHabitatApiRequestFactory, PokemonHabitatApiResponseProcessor} from "../apis/PokemonHabitatApi";
export class ObservablePokemonHabitatApi {
    private requestFactory: PokemonHabitatApiRequestFactory;
    private responseProcessor: PokemonHabitatApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonHabitatApiRequestFactory,
        responseProcessor?: PokemonHabitatApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokemonHabitatApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokemonHabitatApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonHabitatListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonHabitatList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonHabitatListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonHabitatList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonHabitatListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public pokemonHabitatReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonHabitatRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonHabitatReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public pokemonHabitatRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonHabitatReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PokemonShapeApiRequestFactory, PokemonShapeApiResponseProcessor} from "../apis/PokemonShapeApi";
export class ObservablePokemonShapeApi {
    private requestFactory: PokemonShapeApiRequestFactory;
    private responseProcessor: PokemonShapeApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonShapeApiRequestFactory,
        responseProcessor?: PokemonShapeApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokemonShapeApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokemonShapeApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonShapeListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonShapeList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonShapeListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonShapeList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonShapeListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public pokemonShapeReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonShapeRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonShapeReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public pokemonShapeRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonShapeReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { PokemonSpeciesApiRequestFactory, PokemonSpeciesApiResponseProcessor} from "../apis/PokemonSpeciesApi";
export class ObservablePokemonSpeciesApi {
    private requestFactory: PokemonSpeciesApiRequestFactory;
    private responseProcessor: PokemonSpeciesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonSpeciesApiRequestFactory,
        responseProcessor?: PokemonSpeciesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokemonSpeciesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokemonSpeciesApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonSpeciesListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonSpeciesList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonSpeciesListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public pokemonSpeciesList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonSpeciesListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public pokemonSpeciesReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonSpeciesRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonSpeciesReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public pokemonSpeciesRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.pokemonSpeciesReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { RegionApiRequestFactory, RegionApiResponseProcessor} from "../apis/RegionApi";
export class ObservableRegionApi {
    private requestFactory: RegionApiRequestFactory;
    private responseProcessor: RegionApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: RegionApiRequestFactory,
        responseProcessor?: RegionApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new RegionApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new RegionApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public regionListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.regionList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.regionListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public regionList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.regionListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public regionReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.regionRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.regionReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public regionRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.regionReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { StatApiRequestFactory, StatApiResponseProcessor} from "../apis/StatApi";
export class ObservableStatApi {
    private requestFactory: StatApiRequestFactory;
    private responseProcessor: StatApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: StatApiRequestFactory,
        responseProcessor?: StatApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new StatApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new StatApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public statListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.statList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.statListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public statList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.statListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public statReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.statRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.statReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public statRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.statReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { SuperContestEffectApiRequestFactory, SuperContestEffectApiResponseProcessor} from "../apis/SuperContestEffectApi";
export class ObservableSuperContestEffectApi {
    private requestFactory: SuperContestEffectApiRequestFactory;
    private responseProcessor: SuperContestEffectApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: SuperContestEffectApiRequestFactory,
        responseProcessor?: SuperContestEffectApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new SuperContestEffectApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new SuperContestEffectApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public superContestEffectListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.superContestEffectList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.superContestEffectListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public superContestEffectList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.superContestEffectListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public superContestEffectReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.superContestEffectRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.superContestEffectReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public superContestEffectRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.superContestEffectReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { TypeApiRequestFactory, TypeApiResponseProcessor} from "../apis/TypeApi";
export class ObservableTypeApi {
    private requestFactory: TypeApiRequestFactory;
    private responseProcessor: TypeApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: TypeApiRequestFactory,
        responseProcessor?: TypeApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new TypeApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new TypeApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public typeListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.typeList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.typeListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public typeList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.typeListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public typeReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.typeRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.typeReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public typeRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.typeReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { VersionApiRequestFactory, VersionApiResponseProcessor} from "../apis/VersionApi";
export class ObservableVersionApi {
    private requestFactory: VersionApiRequestFactory;
    private responseProcessor: VersionApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: VersionApiRequestFactory,
        responseProcessor?: VersionApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new VersionApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new VersionApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public versionListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.versionList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.versionListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public versionList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.versionListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public versionReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.versionRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.versionReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public versionRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.versionReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { VersionGroupApiRequestFactory, VersionGroupApiResponseProcessor} from "../apis/VersionGroupApi";
export class ObservableVersionGroupApi {
    private requestFactory: VersionGroupApiRequestFactory;
    private responseProcessor: VersionGroupApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: VersionGroupApiRequestFactory,
        responseProcessor?: VersionGroupApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new VersionGroupApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new VersionGroupApiResponseProcessor();
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public versionGroupListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.versionGroupList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.versionGroupListWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param [limit]
     * @param [offset]
     */
    public versionGroupList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<void> {
        return this.versionGroupListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

    /**
     * @param id
     */
    public versionGroupReadWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<void>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.versionGroupRead(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.versionGroupReadWithHttpInfo(rsp)));
            }));
    }

    /**
     * @param id
     */
    public versionGroupRead(id: number, _options?: ConfigurationOptions): Observable<void> {
        return this.versionGroupReadWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}
