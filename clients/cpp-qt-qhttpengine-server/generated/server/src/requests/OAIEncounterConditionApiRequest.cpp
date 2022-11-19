/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah@cliffano.com
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
#include "OAIEncounterConditionApiRequest.h"

namespace OpenAPI {

OAIEncounterConditionApiRequest::OAIEncounterConditionApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIEncounterConditionApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIEncounterConditionApiRequest::~OAIEncounterConditionApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIEncounterConditionApiRequest::~OAIEncounterConditionApiRequest()";
}

QMap<QString, QString>
OAIEncounterConditionApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIEncounterConditionApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIEncounterConditionApiRequest::getRawSocket(){
    return socket;
}


void OAIEncounterConditionApiRequest::encounterConditionListRequest(){
    qDebug() << "/api/v2/encounter-condition/";
    connect(this, &OAIEncounterConditionApiRequest::encounterConditionList, handler.data(), &OAIEncounterConditionApiHandler::encounterConditionList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit encounterConditionList(limit, offset);
}


void OAIEncounterConditionApiRequest::encounterConditionReadRequest(const QString& idstr){
    qDebug() << "/api/v2/encounter-condition/{id}/";
    connect(this, &OAIEncounterConditionApiRequest::encounterConditionRead, handler.data(), &OAIEncounterConditionApiHandler::encounterConditionRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit encounterConditionRead(id);
}



void OAIEncounterConditionApiRequest::encounterConditionListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterConditionApiRequest::encounterConditionReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEncounterConditionApiRequest::encounterConditionListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterConditionApiRequest::encounterConditionReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEncounterConditionApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterConditionApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}