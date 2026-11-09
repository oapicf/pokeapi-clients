#tag Class
Protected Class LocationAreaDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The internal id of an API resource within game data.
		#tag EndNote
		game_index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
		#tag EndNote
		encounter_method_rates() As OpenAPIClient.Models.LocationAreaEncounterRate
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The region this location area can be found in.
		#tag EndNote
		location As OpenAPIClient.Models.LocationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.LocationAreaName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
		#tag EndNote
		pokemon_encounters() As OpenAPIClient.Models.LocationAreaPokemonEncounter
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="game_index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="encounter_method_rates"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaEncounterRate"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="location"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon_encounters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaPokemonEncounter"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


