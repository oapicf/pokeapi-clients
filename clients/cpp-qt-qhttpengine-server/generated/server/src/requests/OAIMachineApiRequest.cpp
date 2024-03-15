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
#include "OAIMachineApiRequest.h"

namespace OpenAPI {

OAIMachineApiRequest::OAIMachineApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIMachineApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIMachineApiRequest::~OAIMachineApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIMachineApiRequest::~OAIMachineApiRequest()";
}

QMap<QString, QString>
OAIMachineApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIMachineApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIMachineApiRequest::getRawSocket(){
    return socket;
}


void OAIMachineApiRequest::machineListRequest(){
    qDebug() << "/api/v2/machine/";
    connect(this, &OAIMachineApiRequest::machineList, handler.data(), &OAIMachineApiHandler::machineList);


    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }

    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }



    emit machineList(limit, offset);
}


void OAIMachineApiRequest::machineReadRequest(const QString& idstr){
    qDebug() << "/api/v2/machine/{id}/";
    connect(this, &OAIMachineApiRequest::machineRead, handler.data(), &OAIMachineApiHandler::machineRead);


    qint32 id;
    fromStringValue(idstr, id);


    emit machineRead(id);
}



void OAIMachineApiRequest::machineListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIMachineApiRequest::machineReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIMachineApiRequest::machineListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIMachineApiRequest::machineReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIMachineApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIMachineApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
