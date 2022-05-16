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

#ifndef OAI_OAIPokemonHabitatApiRequest_H
#define OAI_OAIPokemonHabitatApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include <QString>
#include "OAIPokemonHabitatApiHandler.h"

namespace OpenAPI {

class OAIPokemonHabitatApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIPokemonHabitatApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIPokemonHabitatApiHandler> handler);
    virtual ~OAIPokemonHabitatApiRequest();

    void pokemonHabitatListRequest();
    void pokemonHabitatReadRequest(const QString& id);
    

    void pokemonHabitatListResponse(const QString& res);
    void pokemonHabitatReadResponse(const QString& res);
    

    void pokemonHabitatListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void pokemonHabitatReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void pokemonHabitatList(qint32 limit, qint32 offset);
    void pokemonHabitatRead(qint32 id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIPokemonHabitatApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIPokemonHabitatApiRequest_H
