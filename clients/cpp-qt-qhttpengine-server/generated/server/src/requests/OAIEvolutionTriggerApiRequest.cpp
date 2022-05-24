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
#include "OAIEvolutionTriggerApiRequest.h"

namespace OpenAPI {

OAIEvolutionTriggerApiRequest::OAIEvolutionTriggerApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIEvolutionTriggerApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIEvolutionTriggerApiRequest::~OAIEvolutionTriggerApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIEvolutionTriggerApiRequest::~OAIEvolutionTriggerApiRequest()";
}

QMap<QString, QString>
OAIEvolutionTriggerApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIEvolutionTriggerApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIEvolutionTriggerApiRequest::getRawSocket(){
    return socket;
}


void OAIEvolutionTriggerApiRequest::evolutionTriggerListRequest(){
    qDebug() << "/api/v2/evolution-trigger/";
    connect(this, &OAIEvolutionTriggerApiRequest::evolutionTriggerList, handler.data(), &OAIEvolutionTriggerApiHandler::evolutionTriggerList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit evolutionTriggerList(limit, offset);
}


void OAIEvolutionTriggerApiRequest::evolutionTriggerReadRequest(const QString& idstr){
    qDebug() << "/api/v2/evolution-trigger/{id}/";
    connect(this, &OAIEvolutionTriggerApiRequest::evolutionTriggerRead, handler.data(), &OAIEvolutionTriggerApiHandler::evolutionTriggerRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit evolutionTriggerRead(id);
}



void OAIEvolutionTriggerApiRequest::evolutionTriggerListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEvolutionTriggerApiRequest::evolutionTriggerReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEvolutionTriggerApiRequest::evolutionTriggerListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEvolutionTriggerApiRequest::evolutionTriggerReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIEvolutionTriggerApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIEvolutionTriggerApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
