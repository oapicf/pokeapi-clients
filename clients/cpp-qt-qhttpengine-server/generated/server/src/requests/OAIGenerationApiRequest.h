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

#ifndef OAI_OAIGenerationApiRequest_H
#define OAI_OAIGenerationApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include <QString>
#include "OAIGenerationApiHandler.h"

namespace OpenAPI {

class OAIGenerationApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIGenerationApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIGenerationApiHandler> handler);
    virtual ~OAIGenerationApiRequest();

    void generationListRequest();
    void generationReadRequest(const QString& id);


    void generationListResponse(const QString& res);
    void generationReadResponse(const QString& res);


    void generationListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generationReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);


    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void generationList(qint32 limit, qint32 offset);
    void generationRead(qint32 id);


private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIGenerationApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIGenerationApiRequest_H
