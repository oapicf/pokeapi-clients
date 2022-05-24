/**
* 
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 20220523
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

/*
* LocationApiImpl.h
*
* 
*/

#ifndef LOCATION_API_IMPL_H_
#define LOCATION_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <LocationApi.h>


#include <string>

namespace org::openapitools::server::api
{



class LocationApiImpl : public org::openapitools::server::api::LocationApi {
public:
    explicit LocationApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~LocationApiImpl() override = default;

    void location_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response);
    void location_read(const int32_t &id, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
