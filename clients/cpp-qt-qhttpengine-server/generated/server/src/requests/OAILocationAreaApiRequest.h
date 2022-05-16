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

#ifndef OAI_OAILocationAreaApiRequest_H
#define OAI_OAILocationAreaApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include <QString>
#include "OAILocationAreaApiHandler.h"

namespace OpenAPI {

class OAILocationAreaApiRequest : public QObject
{
    Q_OBJECT

public:
    OAILocationAreaApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAILocationAreaApiHandler> handler);
    virtual ~OAILocationAreaApiRequest();

    void locationAreaListRequest();
    void locationAreaReadRequest(const QString& id);
    

    void locationAreaListResponse(const QString& res);
    void locationAreaReadResponse(const QString& res);
    

    void locationAreaListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void locationAreaReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void locationAreaList(qint32 limit, qint32 offset);
    void locationAreaRead(qint32 id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAILocationAreaApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAILocationAreaApiRequest_H
