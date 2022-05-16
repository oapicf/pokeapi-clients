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
* EncounterConditionValueApiImpl.h
*
* 
*/

#ifndef ENCOUNTER_CONDITION_VALUE_API_IMPL_H_
#define ENCOUNTER_CONDITION_VALUE_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <EncounterConditionValueApi.h>


#include <string>

namespace org::openapitools::server::api
{



class EncounterConditionValueApiImpl : public org::openapitools::server::api::EncounterConditionValueApi {
public:
    explicit EncounterConditionValueApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~EncounterConditionValueApiImpl() override = default;

    void encounter_condition_value_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response);
    void encounter_condition_value_read(const int32_t &id, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
