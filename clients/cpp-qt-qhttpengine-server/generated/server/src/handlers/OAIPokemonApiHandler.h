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

#ifndef OAI_OAIPokemonApiHandler_H
#define OAI_OAIPokemonApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIPokemonApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIPokemonApiHandler();
    virtual ~OAIPokemonApiHandler();


public slots:
    virtual void pokemonList(qint32 limit, qint32 offset);
    virtual void pokemonRead(qint32 id);
    

};

}

#endif // OAI_OAIPokemonApiHandler_H
