/*
 * EvolutionChainDetail.h
 *
 * 
 */

#ifndef _EvolutionChainDetail_H_
#define _EvolutionChainDetail_H_


#include <string>
#include "EvolutionChainLink.h"
#include "ItemSummary.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionChainDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	EvolutionChainDetail();
	EvolutionChainDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EvolutionChainDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
	 */
	ItemSummary getBabyTriggerItem();

	/*! \brief Set The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
	 */
	void setBabyTriggerItem(ItemSummary  baby_trigger_item);
	/*! \brief Get The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
	 */
	EvolutionChainLink getChain();

	/*! \brief Set The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
	 */
	void setChain(EvolutionChainLink  chain);

private:
	int id;
	ItemSummary baby_trigger_item;
	EvolutionChainLink chain;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionChainDetail_H_ */
