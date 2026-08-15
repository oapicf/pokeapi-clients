
/*
 * PokemonStat.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonStat_H_
#define TINY_CPP_CLIENT_PokemonStat_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "StatSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonStat{
public:

    /*! \brief Constructor.
	 */
    PokemonStat();
    PokemonStat(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonStat();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getBaseStat();

	/*! \brief Set 
	 */
	void setBaseStat(int  base_stat);
	/*! \brief Get 
	 */
	int getEffort();

	/*! \brief Set 
	 */
	void setEffort(int  effort);
	/*! \brief Get 
	 */
	StatSummary getStat();

	/*! \brief Set 
	 */
	void setStat(StatSummary  stat);


    private:
    int base_stat{};
    int effort{};
    StatSummary stat;
};
}

#endif /* TINY_CPP_CLIENT_PokemonStat_H_ */
