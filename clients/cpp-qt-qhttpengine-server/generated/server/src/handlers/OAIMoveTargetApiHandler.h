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

#ifndef OAI_OAIMoveTargetApiHandler_H
#define OAI_OAIMoveTargetApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIMoveTargetApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIMoveTargetApiHandler();
    virtual ~OAIMoveTargetApiHandler();


public slots:
    virtual void moveTargetList(qint32 limit, qint32 offset);
    virtual void moveTargetRead(qint32 id);
    

};

}

#endif // OAI_OAIMoveTargetApiHandler_H
