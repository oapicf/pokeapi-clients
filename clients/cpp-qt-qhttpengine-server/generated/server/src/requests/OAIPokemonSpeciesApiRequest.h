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

#ifndef OAI_OAIPokemonSpeciesApiRequest_H
#define OAI_OAIPokemonSpeciesApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include <QString>
#include "OAIPokemonSpeciesApiHandler.h"

namespace OpenAPI {

class OAIPokemonSpeciesApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIPokemonSpeciesApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIPokemonSpeciesApiHandler> handler);
    virtual ~OAIPokemonSpeciesApiRequest();

    void pokemonSpeciesListRequest();
    void pokemonSpeciesReadRequest(const QString& id);
    

    void pokemonSpeciesListResponse(const QString& res);
    void pokemonSpeciesReadResponse(const QString& res);
    

    void pokemonSpeciesListError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void pokemonSpeciesReadError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void pokemonSpeciesList(qint32 limit, qint32 offset);
    void pokemonSpeciesRead(qint32 id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIPokemonSpeciesApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIPokemonSpeciesApiRequest_H
