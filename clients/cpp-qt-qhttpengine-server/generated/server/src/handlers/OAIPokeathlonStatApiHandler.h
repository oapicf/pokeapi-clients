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

#ifndef OAI_OAIPokeathlonStatApiHandler_H
#define OAI_OAIPokeathlonStatApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIPokeathlonStatApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIPokeathlonStatApiHandler();
    virtual ~OAIPokeathlonStatApiHandler();


public slots:
    virtual void pokeathlonStatList(qint32 limit, qint32 offset);
    virtual void pokeathlonStatRead(qint32 id);


};

}

#endif // OAI_OAIPokeathlonStatApiHandler_H
