#tag Class
Protected Class PokemonEncounterResponse

	#tag Property, Flags = &h0
		#tag Note
			The location area the referenced Pokémon can be encountered in.
		#tag EndNote
		location_area As OpenAPIClient.Models.LocationAreaSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of versions and encounters with the referenced Pokémon that might happen.
		#tag EndNote
		version_details() As OpenAPIClient.Models.PokemonEncounterVersionDetailResponse
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
			Name="location_area"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEncounterVersionDetailResponse"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


