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

#ifndef OAI_OAIPokemonHabitatApiHandler_H
#define OAI_OAIPokemonHabitatApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIPokemonHabitatApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIPokemonHabitatApiHandler();
    virtual ~OAIPokemonHabitatApiHandler();


public slots:
    virtual void pokemonHabitatList(qint32 limit, qint32 offset);
    virtual void pokemonHabitatRead(qint32 id);
    

};

}

#endif // OAI_OAIPokemonHabitatApiHandler_H
