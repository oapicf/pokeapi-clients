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
#include "OAIEncounterConditionValueApiRequest.h"

namespace OpenAPI {

OAIEncounterConditionValueApiRequest::OAIEncounterConditionValueApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIEncounterConditionValueApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIEncounterConditionValueApiRequest::~OAIEncounterConditionValueApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIEncounterConditionValueApiRequest::~OAIEncounterConditionValueApiRequest()";
}

QMap<QString, QString>
OAIEncounterConditionValueApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIEncounterConditionValueApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIEncounterConditionValueApiRequest::getRawSocket(){
    return socket;
}


void OAIEncounterConditionValueApiRequest::encounterConditionValueListRequest(){
    qDebug() << "/api/v2/encounter-condition-value/";
    connect(this, &OAIEncounterConditionValueApiRequest::encounterConditionValueList, handler.data(), &OAIEncounterConditionValueApiHandler::encounterConditionValueList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit encounterConditionValueList(limit, offset);
}


void OAIEncounterConditionValueApiRequest::encounterConditionValueReadRequest(const QString& idstr){
    qDebug() << "/api/v2/encounter-condition-value/{id}/";
    connect(this, &OAIEncounterConditionValueApiRequest::encounterConditionValueRead, handler.data(), &OAIEncounterConditionValueApiHandler::encounterConditionValueRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit encounterConditionValueRead(id);
}



void OAIEncounterConditionValueApiRequest::encounterConditionValueListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterConditionValueApiRequest::encounterConditionValueReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEncounterConditionValueApiRequest::encounterConditionValueListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterConditionValueApiRequest::encounterConditionValueReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEncounterConditionValueApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterConditionValueApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
