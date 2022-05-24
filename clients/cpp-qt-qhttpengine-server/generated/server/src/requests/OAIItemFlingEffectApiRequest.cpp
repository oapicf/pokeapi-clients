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

#include "OAIHelpers.h"
#include "OAIItemFlingEffectApiRequest.h"

namespace OpenAPI {

OAIItemFlingEffectApiRequest::OAIItemFlingEffectApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIItemFlingEffectApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIItemFlingEffectApiRequest::~OAIItemFlingEffectApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIItemFlingEffectApiRequest::~OAIItemFlingEffectApiRequest()";
}

QMap<QString, QString>
OAIItemFlingEffectApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIItemFlingEffectApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIItemFlingEffectApiRequest::getRawSocket(){
    return socket;
}


void OAIItemFlingEffectApiRequest::itemFlingEffectListRequest(){
    qDebug() << "/api/v2/item-fling-effect/";
    connect(this, &OAIItemFlingEffectApiRequest::itemFlingEffectList, handler.data(), &OAIItemFlingEffectApiHandler::itemFlingEffectList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit itemFlingEffectList(limit, offset);
}


void OAIItemFlingEffectApiRequest::itemFlingEffectReadRequest(const QString& idstr){
    qDebug() << "/api/v2/item-fling-effect/{id}/";
    connect(this, &OAIItemFlingEffectApiRequest::itemFlingEffectRead, handler.data(), &OAIItemFlingEffectApiHandler::itemFlingEffectRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit itemFlingEffectRead(id);
}



void OAIItemFlingEffectApiRequest::itemFlingEffectListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIItemFlingEffectApiRequest::itemFlingEffectReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIItemFlingEffectApiRequest::itemFlingEffectListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIItemFlingEffectApiRequest::itemFlingEffectReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIItemFlingEffectApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIItemFlingEffectApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
