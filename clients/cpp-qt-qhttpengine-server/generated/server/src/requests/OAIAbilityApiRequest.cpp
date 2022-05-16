/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
#include "OAIAbilityApiRequest.h"

namespace OpenAPI {

OAIAbilityApiRequest::OAIAbilityApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIAbilityApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIAbilityApiRequest::~OAIAbilityApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIAbilityApiRequest::~OAIAbilityApiRequest()";
}

QMap<QString, QString>
OAIAbilityApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIAbilityApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIAbilityApiRequest::getRawSocket(){
    return socket;
}


void OAIAbilityApiRequest::abilityListRequest(){
    qDebug() << "/api/v2/api/v2/ability/";
    connect(this, &OAIAbilityApiRequest::abilityList, handler.data(), &OAIAbilityApiHandler::abilityList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit abilityList(limit, offset);
}


void OAIAbilityApiRequest::abilityReadRequest(const QString& idstr){
    qDebug() << "/api/v2/api/v2/ability/{id}/";
    connect(this, &OAIAbilityApiRequest::abilityRead, handler.data(), &OAIAbilityApiHandler::abilityRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit abilityRead(id);
}



void OAIAbilityApiRequest::abilityListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAbilityApiRequest::abilityReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIAbilityApiRequest::abilityListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAbilityApiRequest::abilityReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIAbilityApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAbilityApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
