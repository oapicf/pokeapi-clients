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

#ifndef OAI_OAIEncounterConditionValueApiHandler_H
#define OAI_OAIEncounterConditionValueApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIEncounterConditionValueApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIEncounterConditionValueApiHandler();
    virtual ~OAIEncounterConditionValueApiHandler();


public slots:
    virtual void encounterConditionValueList(qint32 limit, qint32 offset);
    virtual void encounterConditionValueRead(qint32 id);


};

}

#endif // OAI_OAIEncounterConditionValueApiHandler_H
