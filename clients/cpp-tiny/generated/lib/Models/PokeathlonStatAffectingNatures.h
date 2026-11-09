
/*
 * PokeathlonStatAffectingNatures.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokeathlonStatAffectingNatures_H_
#define TINY_CPP_CLIENT_PokeathlonStatAffectingNatures_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokeathlonStatAffectingNature.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokeathlonStatAffectingNatures{
public:

    /*! \brief Constructor.
	 */
    PokeathlonStatAffectingNatures();
    PokeathlonStatAffectingNatures(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokeathlonStatAffectingNatures();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of natures and how they change the referenced Pokéathlon stat.
	 */
	std::list<PokeathlonStatAffectingNature> getIncrease();

	/*! \brief Set A list of natures and how they change the referenced Pokéathlon stat.
	 */
	void setIncrease(std::list<PokeathlonStatAffectingNature> increase);
	/*! \brief Get A list of natures and how they change the referenced Pokéathlon stat.
	 */
	std::list<PokeathlonStatAffectingNature> getDecrease();

	/*! \brief Set A list of natures and how they change the referenced Pokéathlon stat.
	 */
	void setDecrease(std::list<PokeathlonStatAffectingNature> decrease);


    private:
    std::list<PokeathlonStatAffectingNature> increase;
    std::list<PokeathlonStatAffectingNature> decrease;
};
}

#endif /* TINY_CPP_CLIENT_PokeathlonStatAffectingNatures_H_ */
