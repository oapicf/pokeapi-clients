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

#ifndef OAI_OAIStatApiHandler_H
#define OAI_OAIStatApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIStatApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIStatApiHandler();
    virtual ~OAIStatApiHandler();


public slots:
    virtual void statList(qint32 limit, qint32 offset);
    virtual void statRead(qint32 id);
    

};

}

#endif // OAI_OAIStatApiHandler_H
