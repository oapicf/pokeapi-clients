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

#ifndef OAI_OAIPokedexApiHandler_H
#define OAI_OAIPokedexApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIPokedexApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIPokedexApiHandler();
    virtual ~OAIPokedexApiHandler();


public slots:
    virtual void pokedexList(qint32 limit, qint32 offset);
    virtual void pokedexRead(qint32 id);
    

};

}

#endif // OAI_OAIPokedexApiHandler_H
