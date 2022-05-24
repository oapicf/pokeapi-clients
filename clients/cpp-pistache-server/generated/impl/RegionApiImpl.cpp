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

#include "RegionApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {



RegionApiImpl::RegionApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : RegionApi(rtr)
{
}

void RegionApiImpl::region_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void RegionApiImpl::region_read(const int32_t &id, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

