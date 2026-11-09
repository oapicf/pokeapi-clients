
/*
 * EvolutionChainDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EvolutionChainDetail_H_
#define TINY_CPP_CLIENT_EvolutionChainDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EvolutionChainLink.h"
#include "ItemSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionChainDetail{
public:

    /*! \brief Constructor.
	 */
    EvolutionChainDetail();
    EvolutionChainDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EvolutionChainDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
	 */
	ItemSummary getBabyTriggerItem();

	/*! \brief Set The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
	 */
	void setBabyTriggerItem(ItemSummary baby_trigger_item);
	/*! \brief Get The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
	 */
	EvolutionChainLink getChain();

	/*! \brief Set The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
	 */
	void setChain(EvolutionChainLink chain);


    private:
    int id{};
    ItemSummary baby_trigger_item;
    EvolutionChainLink chain;
};
}

#endif /* TINY_CPP_CLIENT_EvolutionChainDetail_H_ */
