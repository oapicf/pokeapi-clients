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

#ifndef OAI_OAIItemPocketApiRequest_H
#define OAI_OAIItemPocketApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include <QString>
#include "OAIItemPocketApiHandler.h"

namespace OpenAPI {

class OAIItemPocketApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIItemPocketApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIItemPocketApiHandler> handler);
    virtual ~OAIItemPocketApiRequest();

    void itemPocketListRequest();
    void itemPocketReadRequest(const QString& id);
    

    void itemPocketListResponse(const QString& res);
    void itemPocketReadResponse(const QString& res);
    

    void itemPocketListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void itemPocketReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void itemPocketList(qint32 limit, qint32 offset);
    void itemPocketRead(qint32 id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIItemPocketApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIItemPocketApiRequest_H