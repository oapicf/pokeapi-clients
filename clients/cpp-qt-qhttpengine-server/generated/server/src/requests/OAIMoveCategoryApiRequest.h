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

#ifndef OAI_OAIMoveCategoryApiRequest_H
#define OAI_OAIMoveCategoryApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include <QString>
#include "OAIMoveCategoryApiHandler.h"

namespace OpenAPI {

class OAIMoveCategoryApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIMoveCategoryApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIMoveCategoryApiHandler> handler);
    virtual ~OAIMoveCategoryApiRequest();

    void moveCategoryListRequest();
    void moveCategoryReadRequest(const QString& id);
    

    void moveCategoryListResponse(const QString& res);
    void moveCategoryReadResponse(const QString& res);
    

    void moveCategoryListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void moveCategoryReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void moveCategoryList(qint32 limit, qint32 offset);
    void moveCategoryRead(qint32 id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIMoveCategoryApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIMoveCategoryApiRequest_H
