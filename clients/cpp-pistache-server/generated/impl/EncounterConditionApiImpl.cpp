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

#include "EncounterConditionApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {



EncounterConditionApiImpl::EncounterConditionApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : EncounterConditionApi(rtr)
{
}

void EncounterConditionApiImpl::encounter_condition_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void EncounterConditionApiImpl::encounter_condition_read(const int32_t &id, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

