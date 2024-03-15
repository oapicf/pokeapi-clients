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

#include "OAIHelpers.h"
#include "OAIEncounterMethodApiRequest.h"

namespace OpenAPI {

OAIEncounterMethodApiRequest::OAIEncounterMethodApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIEncounterMethodApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIEncounterMethodApiRequest::~OAIEncounterMethodApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIEncounterMethodApiRequest::~OAIEncounterMethodApiRequest()";
}

QMap<QString, QString>
OAIEncounterMethodApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIEncounterMethodApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIEncounterMethodApiRequest::getRawSocket(){
    return socket;
}


void OAIEncounterMethodApiRequest::encounterMethodListRequest(){
    qDebug() << "/api/v2/encounter-method/";
    connect(this, &OAIEncounterMethodApiRequest::encounterMethodList, handler.data(), &OAIEncounterMethodApiHandler::encounterMethodList);


    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }

    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }



    emit encounterMethodList(limit, offset);
}


void OAIEncounterMethodApiRequest::encounterMethodReadRequest(const QString& idstr){
    qDebug() << "/api/v2/encounter-method/{id}/";
    connect(this, &OAIEncounterMethodApiRequest::encounterMethodRead, handler.data(), &OAIEncounterMethodApiHandler::encounterMethodRead);


    qint32 id;
    fromStringValue(idstr, id);


    emit encounterMethodRead(id);
}



void OAIEncounterMethodApiRequest::encounterMethodListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterMethodApiRequest::encounterMethodReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEncounterMethodApiRequest::encounterMethodListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterMethodApiRequest::encounterMethodReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEncounterMethodApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEncounterMethodApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
