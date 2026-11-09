
/*
 * PokeathlonStatAffectingNature.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokeathlonStatAffectingNature_H_
#define TINY_CPP_CLIENT_PokeathlonStatAffectingNature_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NatureSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokeathlonStatAffectingNature{
public:

    /*! \brief Constructor.
	 */
    PokeathlonStatAffectingNature();
    PokeathlonStatAffectingNature(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokeathlonStatAffectingNature();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The maximum amount of change to the referenced Pokéathlon stat.
	 */
	int getMaxChange();

	/*! \brief Set The maximum amount of change to the referenced Pokéathlon stat.
	 */
	void setMaxChange(int max_change);
	/*! \brief Get The nature causing the change.
	 */
	NatureSummary getNature();

	/*! \brief Set The nature causing the change.
	 */
	void setNature(NatureSummary nature);


    private:
    int max_change{};
    NatureSummary nature;
};
}

#endif /* TINY_CPP_CLIENT_PokeathlonStatAffectingNature_H_ */
