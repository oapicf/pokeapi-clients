
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
#include "EvolutionChainDetail_chain.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	ItemSummary getBabyTriggerItem();

	/*! \brief Set 
	 */
	void setBabyTriggerItem(ItemSummary baby_trigger_item);
	/*! \brief Get 
	 */
	EvolutionChainDetail_chain getChain();

	/*! \brief Set 
	 */
	void setChain(EvolutionChainDetail_chain chain);


    private:
    int id{};
    ItemSummary baby_trigger_item;
    EvolutionChainDetail_chain chain;
};
}

#endif /* TINY_CPP_CLIENT_EvolutionChainDetail_H_ */
