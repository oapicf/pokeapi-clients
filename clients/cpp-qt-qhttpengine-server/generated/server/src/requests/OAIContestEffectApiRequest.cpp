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
#include "OAIContestEffectApiRequest.h"

namespace OpenAPI {

OAIContestEffectApiRequest::OAIContestEffectApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIContestEffectApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIContestEffectApiRequest::~OAIContestEffectApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIContestEffectApiRequest::~OAIContestEffectApiRequest()";
}

QMap<QString, QString>
OAIContestEffectApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIContestEffectApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIContestEffectApiRequest::getRawSocket(){
    return socket;
}


void OAIContestEffectApiRequest::contestEffectListRequest(){
    qDebug() << "/api/v2/contest-effect/";
    connect(this, &OAIContestEffectApiRequest::contestEffectList, handler.data(), &OAIContestEffectApiHandler::contestEffectList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit contestEffectList(limit, offset);
}


void OAIContestEffectApiRequest::contestEffectReadRequest(const QString& idstr){
    qDebug() << "/api/v2/contest-effect/{id}/";
    connect(this, &OAIContestEffectApiRequest::contestEffectRead, handler.data(), &OAIContestEffectApiHandler::contestEffectRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit contestEffectRead(id);
}



void OAIContestEffectApiRequest::contestEffectListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIContestEffectApiRequest::contestEffectReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIContestEffectApiRequest::contestEffectListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIContestEffectApiRequest::contestEffectReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIContestEffectApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIContestEffectApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}