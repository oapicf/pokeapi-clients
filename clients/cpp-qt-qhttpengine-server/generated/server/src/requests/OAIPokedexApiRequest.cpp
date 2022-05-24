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
#include "OAIPokedexApiRequest.h"

namespace OpenAPI {

OAIPokedexApiRequest::OAIPokedexApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIPokedexApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIPokedexApiRequest::~OAIPokedexApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIPokedexApiRequest::~OAIPokedexApiRequest()";
}

QMap<QString, QString>
OAIPokedexApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIPokedexApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIPokedexApiRequest::getRawSocket(){
    return socket;
}


void OAIPokedexApiRequest::pokedexListRequest(){
    qDebug() << "/api/v2/pokedex/";
    connect(this, &OAIPokedexApiRequest::pokedexList, handler.data(), &OAIPokedexApiHandler::pokedexList);

    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    


    emit pokedexList(limit, offset);
}


void OAIPokedexApiRequest::pokedexReadRequest(const QString& idstr){
    qDebug() << "/api/v2/pokedex/{id}/";
    connect(this, &OAIPokedexApiRequest::pokedexRead, handler.data(), &OAIPokedexApiHandler::pokedexRead);

    
    qint32 id;
    fromStringValue(idstr, id);
    

    emit pokedexRead(id);
}



void OAIPokedexApiRequest::pokedexListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPokedexApiRequest::pokedexReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIPokedexApiRequest::pokedexListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPokedexApiRequest::pokedexReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIPokedexApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPokedexApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
