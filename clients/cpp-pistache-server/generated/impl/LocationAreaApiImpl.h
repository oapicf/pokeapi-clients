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
* LocationAreaApiImpl.h
*
* 
*/

#ifndef LOCATION_AREA_API_IMPL_H_
#define LOCATION_AREA_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <LocationAreaApi.h>


#include <string>

namespace org::openapitools::server::api
{



class LocationAreaApiImpl : public org::openapitools::server::api::LocationAreaApi {
public:
    explicit LocationAreaApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~LocationAreaApiImpl() override = default;

    void location_area_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response);
    void location_area_read(const int32_t &id, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
