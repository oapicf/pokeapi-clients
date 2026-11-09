#tag Class
Protected Class LocationAreaPokemonEncounter

	#tag Property, Flags = &h0
		#tag Note
			The Pokémon being encountered.
		#tag EndNote
		pokemon As OpenAPIClient.Models.PokemonSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of versions and encounters with Pokémon that might happen in the referenced location area.
		#tag EndNote
		version_details() As OpenAPIClient.Models.LocationAreaPokemonEncounterVersion
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
			Name="pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaPokemonEncounterVersion"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


