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
#include "OAIMoveTargetApiRequest.h"

namespace OpenAPI {

OAIMoveTargetApiRequest::OAIMoveTargetApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIMoveTargetApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIMoveTargetApiRequest::~OAIMoveTargetApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIMoveTargetApiRequest::~OAIMoveTargetApiRequest()";
}

QMap<QString, QString>
OAIMoveTargetApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIMoveTargetApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIMoveTargetApiRequest::getRawSocket(){
    return socket;
}


void OAIMoveTargetApiRequest::moveTargetListRequest(){
    qDebug() << "/api/v2/api/v2/move-target/";
    connect(this, &OAIMoveTargetApiRequest::moveTargetList, handler.data(), &OAIMoveTargetApiHandler::moveTargetList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit moveTargetList(limit, offset);
}


void OAIMoveTargetApiRequest::moveTargetReadRequest(const QString& idstr){
    qDebug() << "/api/v2/api/v2/move-target/{id}/";
    connect(this, &OAIMoveTargetApiRequest::moveTargetRead, handler.data(), &OAIMoveTargetApiHandler::moveTargetRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit moveTargetRead(id);
}



void OAIMoveTargetApiRequest::moveTargetListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIMoveTargetApiRequest::moveTargetReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIMoveTargetApiRequest::moveTargetListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIMoveTargetApiRequest::moveTargetReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIMoveTargetApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIMoveTargetApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
