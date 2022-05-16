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

#ifndef OAI_OAIMoveAilmentApiRequest_H
#define OAI_OAIMoveAilmentApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include <QString>
#include "OAIMoveAilmentApiHandler.h"

namespace OpenAPI {

class OAIMoveAilmentApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIMoveAilmentApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIMoveAilmentApiHandler> handler);
    virtual ~OAIMoveAilmentApiRequest();

    void moveAilmentListRequest();
    void moveAilmentReadRequest(const QString& id);
    

    void moveAilmentListResponse(const QString& res);
    void moveAilmentReadResponse(const QString& res);
    

    void moveAilmentListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void moveAilmentReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void moveAilmentList(qint32 limit, qint32 offset);
    void moveAilmentRead(qint32 id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIMoveAilmentApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIMoveAilmentApiRequest_H
