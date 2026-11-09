
/*
 * NaturePokeathlonStat.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_NaturePokeathlonStat_H_
#define TINY_CPP_CLIENT_NaturePokeathlonStat_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokeathlonStatSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class NaturePokeathlonStat{
public:

    /*! \brief Constructor.
	 */
    NaturePokeathlonStat();
    NaturePokeathlonStat(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NaturePokeathlonStat();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The amount of change.
	 */
	int getMaxChange();

	/*! \brief Set The amount of change.
	 */
	void setMaxChange(int max_change);
	/*! \brief Get The stat being affected.
	 */
	PokeathlonStatSummary getPokeathlonStat();

	/*! \brief Set The stat being affected.
	 */
	void setPokeathlonStat(PokeathlonStatSummary pokeathlon_stat);


    private:
    int max_change{};
    PokeathlonStatSummary pokeathlon_stat;
};
}

#endif /* TINY_CPP_CLIENT_NaturePokeathlonStat_H_ */
