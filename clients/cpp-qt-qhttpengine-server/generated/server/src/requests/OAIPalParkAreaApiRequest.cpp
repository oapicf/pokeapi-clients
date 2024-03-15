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
#include "OAIPalParkAreaApiRequest.h"

namespace OpenAPI {

OAIPalParkAreaApiRequest::OAIPalParkAreaApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIPalParkAreaApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIPalParkAreaApiRequest::~OAIPalParkAreaApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIPalParkAreaApiRequest::~OAIPalParkAreaApiRequest()";
}

QMap<QString, QString>
OAIPalParkAreaApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIPalParkAreaApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIPalParkAreaApiRequest::getRawSocket(){
    return socket;
}


void OAIPalParkAreaApiRequest::palParkAreaListRequest(){
    qDebug() << "/api/v2/pal-park-area/";
    connect(this, &OAIPalParkAreaApiRequest::palParkAreaList, handler.data(), &OAIPalParkAreaApiHandler::palParkAreaList);


    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }

    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }



    emit palParkAreaList(limit, offset);
}


void OAIPalParkAreaApiRequest::palParkAreaReadRequest(const QString& idstr){
    qDebug() << "/api/v2/pal-park-area/{id}/";
    connect(this, &OAIPalParkAreaApiRequest::palParkAreaRead, handler.data(), &OAIPalParkAreaApiHandler::palParkAreaRead);


    qint32 id;
    fromStringValue(idstr, id);


    emit palParkAreaRead(id);
}



void OAIPalParkAreaApiRequest::palParkAreaListResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPalParkAreaApiRequest::palParkAreaReadResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIPalParkAreaApiRequest::palParkAreaListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPalParkAreaApiRequest::palParkAreaReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIPalParkAreaApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIPalParkAreaApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
