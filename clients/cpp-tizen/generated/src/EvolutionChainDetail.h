/*
 * EvolutionChainDetail.h
 *
 * 
 */

#ifndef _EvolutionChainDetail_H_
#define _EvolutionChainDetail_H_


#include <string>
#include "EvolutionChainDetail_chain.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	ItemSummary getBabyTriggerItem();

	/*! \brief Set 
	 */
	void setBabyTriggerItem(ItemSummary  baby_trigger_item);
	/*! \brief Get 
	 */
	EvolutionChainDetail_chain getChain();

	/*! \brief Set 
	 */
	void setChain(EvolutionChainDetail_chain  chain);

private:
	int id;
	ItemSummary baby_trigger_item;
	EvolutionChainDetail_chain chain;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionChainDetail_H_ */
