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
#include "OAICharacteristicApiRequest.h"

namespace OpenAPI {

OAICharacteristicApiRequest::OAICharacteristicApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAICharacteristicApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAICharacteristicApiRequest::~OAICharacteristicApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAICharacteristicApiRequest::~OAICharacteristicApiRequest()";
}

QMap<QString, QString>
OAICharacteristicApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAICharacteristicApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAICharacteristicApiRequest::getRawSocket(){
    return socket;
}


void OAICharacteristicApiRequest::characteristicListRequest(){
    qDebug() << "/api/v2/characteristic/";
    connect(this, &OAICharacteristicApiRequest::characteristicList, handler.data(), &OAICharacteristicApiHandler::characteristicList);


    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }

    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }



    emit characteristicList(limit, offset);
}


void OAICharacteristicApiRequest::characteristicReadRequest(const QString& idstr){
    qDebug() << "/api/v2/characteristic/{id}/";
    connect(this, &OAICharacteristicApiRequest::characteristicRead, handler.data(), &OAICharacteristicApiHandler::characteristicRead);


    qint32 id;
    fromStringValue(idstr, id);


    emit characteristicRead(id);
}



void OAICharacteristicApiRequest::characteristicListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAICharacteristicApiRequest::characteristicReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAICharacteristicApiRequest::characteristicListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAICharacteristicApiRequest::characteristicReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAICharacteristicApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAICharacteristicApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
