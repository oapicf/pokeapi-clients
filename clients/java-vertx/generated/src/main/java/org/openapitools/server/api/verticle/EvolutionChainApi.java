package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EvolutionChainApi  {
    //evolution-chain_list
    void evolutionChainList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //evolution-chain_read
    void evolutionChainRead(Integer id, Handler<AsyncResult<String>> handler);

}
