/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIAbilityApiHandler.h"
#include "OAIAbilityApiRequest.h"

namespace OpenAPI {

OAIAbilityApiHandler::OAIAbilityApiHandler(){

}

OAIAbilityApiHandler::~OAIAbilityApiHandler(){

}

void OAIAbilityApiHandler::abilityList(qint32 limit, qint32 offset) {
    Q_UNUSED(limit);
    Q_UNUSED(offset);
    auto reqObj = qobject_cast<OAIAbilityApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QString res;
        reqObj->abilityListResponse(res);
    }
}
void OAIAbilityApiHandler::abilityRead(qint32 id) {
    Q_UNUSED(id);
    auto reqObj = qobject_cast<OAIAbilityApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QString res;
        reqObj->abilityReadResponse(res);
    }
}


}
