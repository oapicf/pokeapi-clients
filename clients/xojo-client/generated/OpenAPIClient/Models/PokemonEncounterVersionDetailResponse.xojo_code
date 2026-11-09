#tag Class
Protected Class PokemonEncounterVersionDetailResponse

	#tag Property, Flags = &h0
		#tag Note
			The game version this encounter happens in.
		#tag EndNote
		version As OpenAPIClient.Models.VersionSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The total percentage of all encounter potential.
		#tag EndNote
		max_chance As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of encounters and their specifics.
		#tag EndNote
		encounter_details() As OpenAPIClient.Models.PokemonEncounterDetailResponse
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
			Name="version"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_chance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="encounter_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEncounterDetailResponse"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


