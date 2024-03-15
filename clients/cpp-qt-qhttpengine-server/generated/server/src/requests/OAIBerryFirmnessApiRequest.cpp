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
#include "OAIBerryFirmnessApiRequest.h"

namespace OpenAPI {

OAIBerryFirmnessApiRequest::OAIBerryFirmnessApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIBerryFirmnessApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIBerryFirmnessApiRequest::~OAIBerryFirmnessApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIBerryFirmnessApiRequest::~OAIBerryFirmnessApiRequest()";
}

QMap<QString, QString>
OAIBerryFirmnessApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIBerryFirmnessApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIBerryFirmnessApiRequest::getRawSocket(){
    return socket;
}


void OAIBerryFirmnessApiRequest::berryFirmnessListRequest(){
    qDebug() << "/api/v2/berry-firmness/";
    connect(this, &OAIBerryFirmnessApiRequest::berryFirmnessList, handler.data(), &OAIBerryFirmnessApiHandler::berryFirmnessList);


    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }

    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }



    emit berryFirmnessList(limit, offset);
}


void OAIBerryFirmnessApiRequest::berryFirmnessReadRequest(const QString& idstr){
    qDebug() << "/api/v2/berry-firmness/{id}/";
    connect(this, &OAIBerryFirmnessApiRequest::berryFirmnessRead, handler.data(), &OAIBerryFirmnessApiHandler::berryFirmnessRead);


    qint32 id;
    fromStringValue(idstr, id);


    emit berryFirmnessRead(id);
}



void OAIBerryFirmnessApiRequest::berryFirmnessListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIBerryFirmnessApiRequest::berryFirmnessReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIBerryFirmnessApiRequest::berryFirmnessListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIBerryFirmnessApiRequest::berryFirmnessReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIBerryFirmnessApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIBerryFirmnessApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
