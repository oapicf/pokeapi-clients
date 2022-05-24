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
#include "OAIEggGroupApiRequest.h"

namespace OpenAPI {

OAIEggGroupApiRequest::OAIEggGroupApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIEggGroupApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIEggGroupApiRequest::~OAIEggGroupApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIEggGroupApiRequest::~OAIEggGroupApiRequest()";
}

QMap<QString, QString>
OAIEggGroupApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIEggGroupApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIEggGroupApiRequest::getRawSocket(){
    return socket;
}


void OAIEggGroupApiRequest::eggGroupListRequest(){
    qDebug() << "/api/v2/egg-group/";
    connect(this, &OAIEggGroupApiRequest::eggGroupList, handler.data(), &OAIEggGroupApiHandler::eggGroupList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit eggGroupList(limit, offset);
}


void OAIEggGroupApiRequest::eggGroupReadRequest(const QString& idstr){
    qDebug() << "/api/v2/egg-group/{id}/";
    connect(this, &OAIEggGroupApiRequest::eggGroupRead, handler.data(), &OAIEggGroupApiHandler::eggGroupRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit eggGroupRead(id);
}



void OAIEggGroupApiRequest::eggGroupListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEggGroupApiRequest::eggGroupReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEggGroupApiRequest::eggGroupListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEggGroupApiRequest::eggGroupReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEggGroupApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEggGroupApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
