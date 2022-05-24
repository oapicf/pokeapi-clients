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
#include "OAISuperContestEffectApiRequest.h"

namespace OpenAPI {

OAISuperContestEffectApiRequest::OAISuperContestEffectApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAISuperContestEffectApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAISuperContestEffectApiRequest::~OAISuperContestEffectApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAISuperContestEffectApiRequest::~OAISuperContestEffectApiRequest()";
}

QMap<QString, QString>
OAISuperContestEffectApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAISuperContestEffectApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAISuperContestEffectApiRequest::getRawSocket(){
    return socket;
}


void OAISuperContestEffectApiRequest::superContestEffectListRequest(){
    qDebug() << "/api/v2/super-contest-effect/";
    connect(this, &OAISuperContestEffectApiRequest::superContestEffectList, handler.data(), &OAISuperContestEffectApiHandler::superContestEffectList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit superContestEffectList(limit, offset);
}


void OAISuperContestEffectApiRequest::superContestEffectReadRequest(const QString& idstr){
    qDebug() << "/api/v2/super-contest-effect/{id}/";
    connect(this, &OAISuperContestEffectApiRequest::superContestEffectRead, handler.data(), &OAISuperContestEffectApiHandler::superContestEffectRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit superContestEffectRead(id);
}



void OAISuperContestEffectApiRequest::superContestEffectListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAISuperContestEffectApiRequest::superContestEffectReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAISuperContestEffectApiRequest::superContestEffectListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAISuperContestEffectApiRequest::superContestEffectReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAISuperContestEffectApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAISuperContestEffectApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
