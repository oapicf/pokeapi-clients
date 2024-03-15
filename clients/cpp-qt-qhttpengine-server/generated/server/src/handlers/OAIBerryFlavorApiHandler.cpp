/**
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
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

#include "OAIBerryFlavorApiHandler.h"
#include "OAIBerryFlavorApiRequest.h"

namespace OpenAPI {

OAIBerryFlavorApiHandler::OAIBerryFlavorApiHandler(){

}

OAIBerryFlavorApiHandler::~OAIBerryFlavorApiHandler(){

}

void OAIBerryFlavorApiHandler::berryFlavorList(qint32 limit, qint32 offset) {
    Q_UNUSED(limit);
    Q_UNUSED(offset);
    auto reqObj = qobject_cast<OAIBerryFlavorApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QString res;
        reqObj->berryFlavorListResponse(res);
    }
}
void OAIBerryFlavorApiHandler::berryFlavorRead(qint32 id) {
    Q_UNUSED(id);
    auto reqObj = qobject_cast<OAIBerryFlavorApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QString res;
        reqObj->berryFlavorReadResponse(res);
    }
}


}
