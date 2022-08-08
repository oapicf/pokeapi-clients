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

#include "OAIItemCategoryApiHandler.h"
#include "OAIItemCategoryApiRequest.h"

namespace OpenAPI {

OAIItemCategoryApiHandler::OAIItemCategoryApiHandler(){

}

OAIItemCategoryApiHandler::~OAIItemCategoryApiHandler(){

}

void OAIItemCategoryApiHandler::itemCategoryList(qint32 limit, qint32 offset) {
    Q_UNUSED(limit);
    Q_UNUSED(offset);
    auto reqObj = qobject_cast<OAIItemCategoryApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QString res;
        reqObj->itemCategoryListResponse(res);
    }
}
void OAIItemCategoryApiHandler::itemCategoryRead(qint32 id) {
    Q_UNUSED(id);
    auto reqObj = qobject_cast<OAIItemCategoryApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QString res;
        reqObj->itemCategoryReadResponse(res);
    }
}


}