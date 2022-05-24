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

#ifndef OAI_APIROUTER_H
#define OAI_APIROUTER_H

#include <functional>
#include <QObject>
#include <QStringList>
#include <QSharedPointer>
#include <QList>
#include <QMultiMap>
#include <QRegularExpression>

#include <qhttpengine/socket.h>
#include <qhttpengine/handler.h>
#include <qhttpengine/qobjecthandler.h>

#include "OAIAbilityApiHandler.h"
#include "OAIBerryApiHandler.h"
#include "OAIBerryFirmnessApiHandler.h"
#include "OAIBerryFlavorApiHandler.h"
#include "OAICharacteristicApiHandler.h"
#include "OAIContestEffectApiHandler.h"
#include "OAIContestTypeApiHandler.h"
#include "OAIEggGroupApiHandler.h"
#include "OAIEncounterConditionApiHandler.h"
#include "OAIEncounterConditionValueApiHandler.h"
#include "OAIEncounterMethodApiHandler.h"
#include "OAIEvolutionChainApiHandler.h"
#include "OAIEvolutionTriggerApiHandler.h"
#include "OAIGenderApiHandler.h"
#include "OAIGenerationApiHandler.h"
#include "OAIGrowthRateApiHandler.h"
#include "OAIItemApiHandler.h"
#include "OAIItemAttributeApiHandler.h"
#include "OAIItemCategoryApiHandler.h"
#include "OAIItemFlingEffectApiHandler.h"
#include "OAIItemPocketApiHandler.h"
#include "OAILanguageApiHandler.h"
#include "OAILocationApiHandler.h"
#include "OAILocationAreaApiHandler.h"
#include "OAIMachineApiHandler.h"
#include "OAIMoveApiHandler.h"
#include "OAIMoveAilmentApiHandler.h"
#include "OAIMoveBattleStyleApiHandler.h"
#include "OAIMoveCategoryApiHandler.h"
#include "OAIMoveDamageClassApiHandler.h"
#include "OAIMoveLearnMethodApiHandler.h"
#include "OAIMoveTargetApiHandler.h"
#include "OAINatureApiHandler.h"
#include "OAIPalParkAreaApiHandler.h"
#include "OAIPokeathlonStatApiHandler.h"
#include "OAIPokedexApiHandler.h"
#include "OAIPokemonApiHandler.h"
#include "OAIPokemonColorApiHandler.h"
#include "OAIPokemonFormApiHandler.h"
#include "OAIPokemonHabitatApiHandler.h"
#include "OAIPokemonShapeApiHandler.h"
#include "OAIPokemonSpeciesApiHandler.h"
#include "OAIRegionApiHandler.h"
#include "OAIStatApiHandler.h"
#include "OAISuperContestEffectApiHandler.h"
#include "OAITypeApiHandler.h"
#include "OAIVersionApiHandler.h"
#include "OAIVersionGroupApiHandler.h"


namespace OpenAPI {

class OAIApiRequestHandler : public  QHttpEngine::QObjectHandler
{
    Q_OBJECT
signals:
    void requestReceived(QHttpEngine::Socket *socket);

protected:
    virtual void process(QHttpEngine::Socket *socket, const QString &path){
        Q_UNUSED(path);

        // If the slot requires all data to be received, check to see if this is
        // already the case, otherwise, wait until the rest of it arrives
        if (socket->bytesAvailable() >= socket->contentLength()) {
            emit requestReceived(socket);
        } else {
            connect(socket, &QHttpEngine::Socket::readChannelFinished, [this, socket]() {
                emit requestReceived(socket);
            });
        }
    }
};

class OAIApiRouter : public QObject
{
    Q_OBJECT
public:
    OAIApiRouter();
    virtual ~OAIApiRouter();

    void setUpRoutes();
    void processRequest(QHttpEngine::Socket *socket);
    
    void setOAIAbilityApiHandler(QSharedPointer<OAIAbilityApiHandler> handler);
    void setOAIBerryApiHandler(QSharedPointer<OAIBerryApiHandler> handler);
    void setOAIBerryFirmnessApiHandler(QSharedPointer<OAIBerryFirmnessApiHandler> handler);
    void setOAIBerryFlavorApiHandler(QSharedPointer<OAIBerryFlavorApiHandler> handler);
    void setOAICharacteristicApiHandler(QSharedPointer<OAICharacteristicApiHandler> handler);
    void setOAIContestEffectApiHandler(QSharedPointer<OAIContestEffectApiHandler> handler);
    void setOAIContestTypeApiHandler(QSharedPointer<OAIContestTypeApiHandler> handler);
    void setOAIEggGroupApiHandler(QSharedPointer<OAIEggGroupApiHandler> handler);
    void setOAIEncounterConditionApiHandler(QSharedPointer<OAIEncounterConditionApiHandler> handler);
    void setOAIEncounterConditionValueApiHandler(QSharedPointer<OAIEncounterConditionValueApiHandler> handler);
    void setOAIEncounterMethodApiHandler(QSharedPointer<OAIEncounterMethodApiHandler> handler);
    void setOAIEvolutionChainApiHandler(QSharedPointer<OAIEvolutionChainApiHandler> handler);
    void setOAIEvolutionTriggerApiHandler(QSharedPointer<OAIEvolutionTriggerApiHandler> handler);
    void setOAIGenderApiHandler(QSharedPointer<OAIGenderApiHandler> handler);
    void setOAIGenerationApiHandler(QSharedPointer<OAIGenerationApiHandler> handler);
    void setOAIGrowthRateApiHandler(QSharedPointer<OAIGrowthRateApiHandler> handler);
    void setOAIItemApiHandler(QSharedPointer<OAIItemApiHandler> handler);
    void setOAIItemAttributeApiHandler(QSharedPointer<OAIItemAttributeApiHandler> handler);
    void setOAIItemCategoryApiHandler(QSharedPointer<OAIItemCategoryApiHandler> handler);
    void setOAIItemFlingEffectApiHandler(QSharedPointer<OAIItemFlingEffectApiHandler> handler);
    void setOAIItemPocketApiHandler(QSharedPointer<OAIItemPocketApiHandler> handler);
    void setOAILanguageApiHandler(QSharedPointer<OAILanguageApiHandler> handler);
    void setOAILocationApiHandler(QSharedPointer<OAILocationApiHandler> handler);
    void setOAILocationAreaApiHandler(QSharedPointer<OAILocationAreaApiHandler> handler);
    void setOAIMachineApiHandler(QSharedPointer<OAIMachineApiHandler> handler);
    void setOAIMoveApiHandler(QSharedPointer<OAIMoveApiHandler> handler);
    void setOAIMoveAilmentApiHandler(QSharedPointer<OAIMoveAilmentApiHandler> handler);
    void setOAIMoveBattleStyleApiHandler(QSharedPointer<OAIMoveBattleStyleApiHandler> handler);
    void setOAIMoveCategoryApiHandler(QSharedPointer<OAIMoveCategoryApiHandler> handler);
    void setOAIMoveDamageClassApiHandler(QSharedPointer<OAIMoveDamageClassApiHandler> handler);
    void setOAIMoveLearnMethodApiHandler(QSharedPointer<OAIMoveLearnMethodApiHandler> handler);
    void setOAIMoveTargetApiHandler(QSharedPointer<OAIMoveTargetApiHandler> handler);
    void setOAINatureApiHandler(QSharedPointer<OAINatureApiHandler> handler);
    void setOAIPalParkAreaApiHandler(QSharedPointer<OAIPalParkAreaApiHandler> handler);
    void setOAIPokeathlonStatApiHandler(QSharedPointer<OAIPokeathlonStatApiHandler> handler);
    void setOAIPokedexApiHandler(QSharedPointer<OAIPokedexApiHandler> handler);
    void setOAIPokemonApiHandler(QSharedPointer<OAIPokemonApiHandler> handler);
    void setOAIPokemonColorApiHandler(QSharedPointer<OAIPokemonColorApiHandler> handler);
    void setOAIPokemonFormApiHandler(QSharedPointer<OAIPokemonFormApiHandler> handler);
    void setOAIPokemonHabitatApiHandler(QSharedPointer<OAIPokemonHabitatApiHandler> handler);
    void setOAIPokemonShapeApiHandler(QSharedPointer<OAIPokemonShapeApiHandler> handler);
    void setOAIPokemonSpeciesApiHandler(QSharedPointer<OAIPokemonSpeciesApiHandler> handler);
    void setOAIRegionApiHandler(QSharedPointer<OAIRegionApiHandler> handler);
    void setOAIStatApiHandler(QSharedPointer<OAIStatApiHandler> handler);
    void setOAISuperContestEffectApiHandler(QSharedPointer<OAISuperContestEffectApiHandler> handler);
    void setOAITypeApiHandler(QSharedPointer<OAITypeApiHandler> handler);
    void setOAIVersionApiHandler(QSharedPointer<OAIVersionApiHandler> handler);
    void setOAIVersionGroupApiHandler(QSharedPointer<OAIVersionGroupApiHandler> handler);
private:
    QMap<QString, std::function<void(QHttpEngine::Socket *)>> Routes;
    QMultiMap<QString, std::function<void(QHttpEngine::Socket *)>> RoutesWithPathParam;

    bool handleRequest(QHttpEngine::Socket *socket);
    bool handleRequestAndExtractPathParam(QHttpEngine::Socket *socket);

    
    QSharedPointer<OAIAbilityApiHandler> mOAIAbilityApiHandler;
    QSharedPointer<OAIBerryApiHandler> mOAIBerryApiHandler;
    QSharedPointer<OAIBerryFirmnessApiHandler> mOAIBerryFirmnessApiHandler;
    QSharedPointer<OAIBerryFlavorApiHandler> mOAIBerryFlavorApiHandler;
    QSharedPointer<OAICharacteristicApiHandler> mOAICharacteristicApiHandler;
    QSharedPointer<OAIContestEffectApiHandler> mOAIContestEffectApiHandler;
    QSharedPointer<OAIContestTypeApiHandler> mOAIContestTypeApiHandler;
    QSharedPointer<OAIEggGroupApiHandler> mOAIEggGroupApiHandler;
    QSharedPointer<OAIEncounterConditionApiHandler> mOAIEncounterConditionApiHandler;
    QSharedPointer<OAIEncounterConditionValueApiHandler> mOAIEncounterConditionValueApiHandler;
    QSharedPointer<OAIEncounterMethodApiHandler> mOAIEncounterMethodApiHandler;
    QSharedPointer<OAIEvolutionChainApiHandler> mOAIEvolutionChainApiHandler;
    QSharedPointer<OAIEvolutionTriggerApiHandler> mOAIEvolutionTriggerApiHandler;
    QSharedPointer<OAIGenderApiHandler> mOAIGenderApiHandler;
    QSharedPointer<OAIGenerationApiHandler> mOAIGenerationApiHandler;
    QSharedPointer<OAIGrowthRateApiHandler> mOAIGrowthRateApiHandler;
    QSharedPointer<OAIItemApiHandler> mOAIItemApiHandler;
    QSharedPointer<OAIItemAttributeApiHandler> mOAIItemAttributeApiHandler;
    QSharedPointer<OAIItemCategoryApiHandler> mOAIItemCategoryApiHandler;
    QSharedPointer<OAIItemFlingEffectApiHandler> mOAIItemFlingEffectApiHandler;
    QSharedPointer<OAIItemPocketApiHandler> mOAIItemPocketApiHandler;
    QSharedPointer<OAILanguageApiHandler> mOAILanguageApiHandler;
    QSharedPointer<OAILocationApiHandler> mOAILocationApiHandler;
    QSharedPointer<OAILocationAreaApiHandler> mOAILocationAreaApiHandler;
    QSharedPointer<OAIMachineApiHandler> mOAIMachineApiHandler;
    QSharedPointer<OAIMoveApiHandler> mOAIMoveApiHandler;
    QSharedPointer<OAIMoveAilmentApiHandler> mOAIMoveAilmentApiHandler;
    QSharedPointer<OAIMoveBattleStyleApiHandler> mOAIMoveBattleStyleApiHandler;
    QSharedPointer<OAIMoveCategoryApiHandler> mOAIMoveCategoryApiHandler;
    QSharedPointer<OAIMoveDamageClassApiHandler> mOAIMoveDamageClassApiHandler;
    QSharedPointer<OAIMoveLearnMethodApiHandler> mOAIMoveLearnMethodApiHandler;
    QSharedPointer<OAIMoveTargetApiHandler> mOAIMoveTargetApiHandler;
    QSharedPointer<OAINatureApiHandler> mOAINatureApiHandler;
    QSharedPointer<OAIPalParkAreaApiHandler> mOAIPalParkAreaApiHandler;
    QSharedPointer<OAIPokeathlonStatApiHandler> mOAIPokeathlonStatApiHandler;
    QSharedPointer<OAIPokedexApiHandler> mOAIPokedexApiHandler;
    QSharedPointer<OAIPokemonApiHandler> mOAIPokemonApiHandler;
    QSharedPointer<OAIPokemonColorApiHandler> mOAIPokemonColorApiHandler;
    QSharedPointer<OAIPokemonFormApiHandler> mOAIPokemonFormApiHandler;
    QSharedPointer<OAIPokemonHabitatApiHandler> mOAIPokemonHabitatApiHandler;
    QSharedPointer<OAIPokemonShapeApiHandler> mOAIPokemonShapeApiHandler;
    QSharedPointer<OAIPokemonSpeciesApiHandler> mOAIPokemonSpeciesApiHandler;
    QSharedPointer<OAIRegionApiHandler> mOAIRegionApiHandler;
    QSharedPointer<OAIStatApiHandler> mOAIStatApiHandler;
    QSharedPointer<OAISuperContestEffectApiHandler> mOAISuperContestEffectApiHandler;
    QSharedPointer<OAITypeApiHandler> mOAITypeApiHandler;
    QSharedPointer<OAIVersionApiHandler> mOAIVersionApiHandler;
    QSharedPointer<OAIVersionGroupApiHandler> mOAIVersionGroupApiHandler;
protected:
    // override this method to provide custom class derived from ApiHandler classes
    virtual void createApiHandlers();

private :
    inline QString fromQHttpEngineMethod(QHttpEngine::Socket::Method method){
        switch( method ){
            case QHttpEngine::Socket::Method::OPTIONS:
                return QStringLiteral("OPTIONS");
            case QHttpEngine::Socket::Method::GET:
                return QStringLiteral("GET");
            case QHttpEngine::Socket::Method::HEAD:
                return QStringLiteral("HEAD");
            case QHttpEngine::Socket::Method::POST:
                return QStringLiteral("POST");
            case QHttpEngine::Socket::Method::PUT:
                return QStringLiteral("PUT");
            case QHttpEngine::Socket::Method::DELETE:
                return QStringLiteral("DELETE");
            case QHttpEngine::Socket::Method::TRACE:
                return QStringLiteral("TRACE");
            case QHttpEngine::Socket::Method::CONNECT:
                return QStringLiteral("CONNECT");
        }
        return QStringLiteral("");
    }

    inline QRegularExpressionMatch getRequestMatch(QString serverTemplatePath, QString requestPath){
        QRegularExpression parExpr( R"(\{([^\/\s]+)\})" );
        serverTemplatePath.replace( parExpr, R"((?<\1>[^\/\s]+))" );
        serverTemplatePath.append("[\\/]?$");
        QRegularExpression pathExpr( serverTemplatePath );
        return pathExpr.match( requestPath );
    }

};


}

#endif // OAI_APIROUTER_H
