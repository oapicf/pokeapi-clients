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

#ifndef OAI_OAIEvolutionChainApiHandler_H
#define OAI_OAIEvolutionChainApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIEvolutionChainApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIEvolutionChainApiHandler();
    virtual ~OAIEvolutionChainApiHandler();


public slots:
    virtual void evolutionChainList(qint32 limit, qint32 offset);
    virtual void evolutionChainRead(qint32 id);
    

};

}

#endif // OAI_OAIEvolutionChainApiHandler_H
