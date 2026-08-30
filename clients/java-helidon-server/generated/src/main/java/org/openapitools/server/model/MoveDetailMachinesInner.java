package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.MoveDetailMachinesInnerMachine;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveDetailMachinesInner   {

    private MoveDetailMachinesInnerMachine machine;
    private AbilityDetailPokemonInnerPokemon versionGroup;

    /**
     * Default constructor.
     */
    public MoveDetailMachinesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveDetailMachinesInner.
     *
     * @param machine machine
     * @param versionGroup versionGroup
     */
    public MoveDetailMachinesInner(
        MoveDetailMachinesInnerMachine machine, 
        AbilityDetailPokemonInnerPokemon versionGroup
    ) {
        this.machine = machine;
        this.versionGroup = versionGroup;
    }



    /**
     * Get machine
     * @return machine
     */
    public MoveDetailMachinesInnerMachine getMachine() {
        return machine;
    }

    public void setMachine(MoveDetailMachinesInnerMachine machine) {
        this.machine = machine;
    }

    /**
     * Get versionGroup
     * @return versionGroup
     */
    public AbilityDetailPokemonInnerPokemon getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetailMachinesInner {\n");
        
        sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

