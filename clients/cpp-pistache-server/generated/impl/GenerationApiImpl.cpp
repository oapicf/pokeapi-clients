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

#include "GenerationApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {



GenerationApiImpl::GenerationApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : GenerationApi(rtr)
{
}

void GenerationApiImpl::generation_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void GenerationApiImpl::generation_read(const int32_t &id, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

