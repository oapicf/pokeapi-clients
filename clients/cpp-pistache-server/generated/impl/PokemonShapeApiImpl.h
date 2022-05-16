/**
* 
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

/*
* PokemonShapeApiImpl.h
*
* 
*/

#ifndef POKEMON_SHAPE_API_IMPL_H_
#define POKEMON_SHAPE_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <PokemonShapeApi.h>


#include <string>

namespace org::openapitools::server::api
{



class PokemonShapeApiImpl : public org::openapitools::server::api::PokemonShapeApi {
public:
    explicit PokemonShapeApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~PokemonShapeApiImpl() override = default;

    void pokemon_shape_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response);
    void pokemon_shape_read(const int32_t &id, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
